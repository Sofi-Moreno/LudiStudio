/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LAMM
 */
public class ControlMateriales {
    //atributos registrar materiales y modificarlos
    JTextField rubroRegistro, nombreRegistro, cantidadRegistro, costoMRegistro,
              proveRegistro, costransRegistro,costomanoRegistro,  
            costoHerraRegistro;
    JComboBox unidadRegistro,sustRegistro,manodRegistro,transRegistro,herraRegistro;
    JPanel ventana;
    
    //Atributo para eliminar
    JTextField nombreEliminar;
    

    public ControlMateriales(JTextField rubroRegistro, JTextField nombreRegistro, JTextField cantidadRegistro, JTextField costoMRegistro, JTextField proveRegistro, JTextField costransRegistro, JTextField costomanoRegistro, JTextField costoHerraRegistro, JComboBox unidadRegistro, JComboBox sustRegistro, JComboBox manodRegistro, JComboBox transRegistro, JComboBox herraRegistro, JPanel ventana) {
        this.rubroRegistro = rubroRegistro;
        this.nombreRegistro = nombreRegistro;
        this.cantidadRegistro = cantidadRegistro;
        this.costoMRegistro = costoMRegistro;
        this.proveRegistro = proveRegistro;
        this.costransRegistro = costransRegistro;
        this.costomanoRegistro = costomanoRegistro;
        this.costoHerraRegistro = costoHerraRegistro;
        this.unidadRegistro = unidadRegistro;
        this.sustRegistro = sustRegistro;
        this.manodRegistro = manodRegistro;
        this.transRegistro = transRegistro;
        this.herraRegistro = herraRegistro;
        this.ventana = ventana;
    }
    
    //Constructor para eliminar
    public ControlMateriales(JTextField nombreEliminar) {
        this.nombreEliminar = nombreEliminar;
    }
    
 
    
    //METODO PARA VALIDAR EL NOMBRE DEL MATERIAL
    public int validarMaterialNombre(Material mat) throws SQLException{
        int val =0; //si no hay errores
        boolean bol = false;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM material";
        String patron = "^[a-zA-Z0-9\\s.,;:-^()\\/]+\\s*(\\([a-zA-Z0-9\\s.,;:-^()\\/]+\\))*$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(nombreRegistro.getText());
        try {
            //AQUI VERIFICAMOS SI EL MATERIAL YA EXISTE BASANDONOS EN SU NOMBRE
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(nombreRegistro.getText().equals(rs.getString("nombre_material"))){
                    bol = true;
                }
            }
            if(bol==true){
                val = 1; //error si este material ya existe
            }
            else if(!matcher.matches() && (nombreRegistro.getText().length()>25 || nombreRegistro.getText().length()<3)){
                val = 2; //si no cumple el patron y no tiene la longitud correcta
            }
            else if(!matcher.matches()){
                val = 3; //si no cumple el patron
            }
            else if(nombreRegistro.getText().length()>25 || nombreRegistro.getText().length()<3){
                val = 4; //error si no tiene el tamaño correcto
            }
            else{
                mat.setNombreMaterial(nombreRegistro.getText());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            stmt.close();
            rs.close();
            conex.close();
            con.desconectar();
        }
        return val;
    }
    
    //METODO PARA VALIDAR RUBRO Y PROVEEDOR
    public int validarRubroProveedorRegistro(Material mat,String tipoDato){
        int e = 0; //valor sin errores
        String patron= "^[A-Z][a-z]*$"; //Patron para ingresar una sola palabra con mayuscula al inicio.
        JTextField dato = null;
        if(tipoDato.equals("rubro_material")){
            dato = rubroRegistro;
        }else if(tipoDato.equals("proveedor_material")){
            dato = proveRegistro;
        }
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher((dato.getText()));
        if(!matcher.matches() && (dato.getText().length()>25 || dato.getText().length()<1)){
            e = 1;//no cumple el patron y no es del tamaño correcto
        }
        else if (!matcher.matches()){
            e = 2; //no cumple el patron
        }
        else if(dato.getText().length()>25 || dato.getText().length()<1){
            e = 3; //no tiene el tamaño correcto
        }
        else if(e==0 && tipoDato.equals("rubro_material")){
            mat.setRubro(dato.getText()); //aqui asignamos el rubro
        }else if(e==0 && tipoDato.equals("proveedor_material")){
            mat.setProveedor(dato.getText()); //aqui asignamos el proveedor
        }
        return e;
    }
    
    public int validarCostos(Material mat,String tipoDato){
        int e = 0; //valor sin errores
        String patron= "^\\d+\\.\\d{3}$"; //Patron para ingresar un double con "." como decimal
        JTextField dato = null;           // NOTA: especificar que se debe utilizar "." en vez de
        if(tipoDato.equals("costo_material")){  // "," para escribir decimales
            dato = costoMRegistro;
        }else if(tipoDato.equals("cantidad_material")){
            dato = cantidadRegistro;
        }else if(tipoDato.equals("costo_manodeobra")){
            dato = costomanoRegistro;
        }else if(tipoDato.equals("costo_herramientas")){
            dato = costoHerraRegistro;
        }else if(tipoDato.equals("costo_transporte")){
            dato = costransRegistro;
        }
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher((dato.getText()));
        if(!matcher.matches() && (dato.getText().length()>4 || dato.getText().length()<1)){
            e = 1;//no cumple el patron y no es del tamaño correcto
        }
        else if (!matcher.matches()){
            e = 2; //no cumple el patron
        }
        else if(dato.getText().length()>4 || dato.getText().length()<1){
            e = 3; //no tiene el tamaño correcto
        }
        else if(e==0 && tipoDato.equals("costo_material")){
            mat.setCostoMaterial(Double.parseDouble(dato.getText()));
        }else if(e==0 && tipoDato.equals("cantidad_material")){
            mat.setCantidadMaterial(Integer.parseInt(dato.getText())); 
        }else if(e==0 && tipoDato.equals("costo_manodeobra")){
            mat.setCostoMDObra(Double.parseDouble(dato.getText()));
        }else if(e==0 && tipoDato.equals("costo_herramientas")){
            mat.setCostoHerramientas(Double.parseDouble(dato.getText()));
        }else if(e==0 && tipoDato.equals("costo_transporte")){
            mat.setCostoTransporte(Double.parseDouble(dato.getText()));
        }
        return e;
    }
    
    //registro de material en caso de que no existan errores
    public boolean guardarRegistroDB(Material mat) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement st = null;
        String sql = "INSERT INTO material (rubro_material, nombre_material, unidad_material, cantidad_material, costo_material, sustentabilidad_material, proveedor_material, transporte_material, costo_transporte, manodeobra_material, costo_manodeobra, herramientas_material, costo_herramientas, costo_total) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            st = conex.prepareStatement(sql);
            st.setString(1,mat.getRubro());
            st.setString(2,mat.getNombreMaterial());
            st.setString(3,(String)unidadRegistro.getSelectedItem());
            st.setInt(4,mat.getCantidadMaterial());
            st.setDouble(5,mat.getCostoMaterial());
            st.setString(6,(String)sustRegistro.getSelectedItem());
            st.setString(7,mat.getProveedor());
            st.setString(8,(String)transRegistro.getSelectedItem());
            st.setDouble(9,mat.getCostoTransporte());
            st.setString(10,(String)manodRegistro.getSelectedItem());
            st.setDouble(11,mat.getCostoMDObra());
            st.setString(12,(String)herraRegistro.getSelectedItem());
            st.setDouble(13,mat.getCostoHerramientas());
            st.setDouble(14,mat.getCostoTotatalMaterial());
            int rowsInserted = st.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            st.close();
            conex.close();
            con.desconectar();
        }
        return bol;
    }
    
    //====================ELIMINAR MATERIAL====================================
    public int eliminarRegistroDB() throws SQLException {
        int veri=0;//VALOR SIN ERRORES
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        boolean bol = false;
        PreparedStatement st = null, st2 = null;
        ResultSet rs = null;
        String patron = "^[a-zA-Z0-9\\s.,;:-^()\\/]+\\s*(\\([a-zA-Z0-9\\s.,;:-^()\\/]+\\))*$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(nombreEliminar.getText());
        String sql1 = "SELECT COUNT(*) FROM material WHERE nombre_material = ?";
        String sql2 = "DELETE FROM material WHERE nombre_material = ?";

        try {
            if (!matcher.matches()){
                veri=1; //No coincide con el patron establecido
            }else if(!matcher.matches() && (nombreEliminar.getText().length()>25 || nombreEliminar.getText().length()<3)){
                veri = 2; //si no cumple el patron y no tiene la longitud correcta
            }else if(nombreEliminar.getText().length()>25 || nombreEliminar.getText().length()<3){
                veri = 3; //error si no tiene el tamaño correcto
            }else{
            // Verifica si el material existe
            st = conex.prepareStatement(sql1);
            st.setString(1, nombreEliminar.getText());
            rs = st.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    // El material existe y procede con la eliminacion
                    st2 = conex.prepareStatement(sql2);
                    st2.setString(1, nombreEliminar.getText());
                    int rowsDeleted = st2.executeUpdate();
                    if (rowsDeleted > 0) {
                        bol = true;
                    }
                } else {
                    veri= 4; //material no encontrado
                }
            } else {
                veri=5; // Error encontrando material
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (st2 != null) {
                st2.close();
            }
            conex.close();
            con.desconectar();
        }

        return veri;
    }
    
    public boolean modificarMaterial(Material mat) throws SQLException {
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        boolean bol = false;
        PreparedStatement st = null;

        String sql = "UPDATE material SET rubro_material = ?, nombre_material = ?, unidad_material = ?, cantidad_material = ?, costo_material = ?, sustentabilidad_material = ?, proveedor_material = ?, transporte_material = ?, costo_transporte = ?, manodeobra_material = ?, costo_manodeobra = ?, herramientas_material = ?, costo_herramientas = ? WHERE nombre_material = ?";
        try {
            st = conex.prepareStatement(sql);
            st.setString(1,mat.getRubro());
            st.setString(2,mat.getNombreMaterial());
            st.setString(3,(String)unidadRegistro.getSelectedItem());
            st.setInt(4,mat.getCantidadMaterial());
            st.setDouble(5,mat.getCostoMaterial());
            st.setString(6,(String)sustRegistro.getSelectedItem());
            st.setString(7,mat.getProveedor());
            st.setString(8,(String)transRegistro.getSelectedItem());
            st.setDouble(9,mat.getCostoTransporte());
            st.setString(10,(String)manodRegistro.getSelectedItem());
            st.setDouble(11,mat.getCostoMDObra());
            st.setString(12,(String)herraRegistro.getSelectedItem());
            st.setDouble(13,mat.getCostoHerramientas());
            st.setDouble(14,mat.getCostoTotatalMaterial());

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                bol = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                st.close();
            }
            conex.close();
            con.desconectar();
        }

        return bol;
    }
    
    //ESTA FUNCION VE TODOS LOS MATERIALES, SERA UTILIZADA PARA OTRA FUNCION
    public ResultSet selecTodosMateriales() throws SQLException {
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM material";

        try {
          stmt = conex.createStatement();
          rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
          Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          stmt.close();
          conex.close();
          con.desconectar();
        }

        return rs;
      }
    
    //ESTA FUNCION LLAMA A LA DE ARRIBA PARA MOSTRAR LO QUE VE
    public void mostrarTodosMateriales() throws SQLException {
        ResultSet rs =  selecTodosMateriales();

        // Imprimir los resultados en la consola (Ejemplo)
        while (rs.next()) {
          String nombreMaterial = rs.getString("nombre_material");
          String rubroMaterial = rs.getString("rubro_material");
          
        }

       // POR TERMINAR PORQUE HAY QUE VER COMO SE VA A MOSTRAR EN LA INTERFAZ
      }
    
}
