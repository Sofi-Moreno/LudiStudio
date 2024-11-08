/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sofia Moreno
 */
public class ControllerProyec {
    //atributos de primer panel (datos basicos)
    JTextField nombreProyecto, presupuestoInicial;
    JComboBox sustentabilidad;
    JPanel ventana;
    
    //atributos para eliminar
    JTextField idProyecto;
    
    //CONSTRUCTORES
    //constructor para crear proyecto
    public ControllerProyec(JTextField nombreProyecto, JTextField presupuestoInicial, JComboBox sustentabilidad, JPanel ventana){    
        this.nombreProyecto = nombreProyecto;
        this.presupuestoInicial = presupuestoInicial;
        this.sustentabilidad = sustentabilidad;
        this.ventana = ventana;
    }
    public ControllerProyec(JPanel ventana){
        this.ventana = ventana;
    }
    //constructor para eliminar
    public ControllerProyec(JTextField idProyecto) {
        this.idProyecto = idProyecto;
    }
    //constructor para modificar
    //**************************CREAR PROYECTO**************************
    //validacion de nombre del proyecto
    public boolean validarNombre(Proyecto proyecto) {
        boolean boleano = false;
        if(nombreProyecto.getText().length()>25 || nombreProyecto.getText().length()<1){
            boleano = true;
        }
        else{
            proyecto.setNombreProyecto(nombreProyecto.getText());
        }
        return boleano;
    }
    //validacion del presupuesto
    public boolean validarPresupuesto(Proyecto proyecto){
        boolean boleano = false;
        String patron = "^[\\d.]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(presupuestoInicial.getText());
        if(!matcher.matches()){
            boleano = true;
        }else{
            proyecto.setPresupuesto(Double.parseDouble(presupuestoInicial.getText()));
        }
        return boleano;
    }
    //tomar fecha actual del sistema
    public String fecha(){
        String fechita;
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        fechita = fecha.format(formato);
        return fechita;
    }
    //guardar datos iniciales
    public boolean guardarInformacion(Proyecto proyecto) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement st = null;
        PreparedStatement materiales= null;
        ResultSet resultado = null;
        try {
            materiales = conex.prepareStatement("SELECT id_partes FROM partes ORDER BY id_partes DESC LIMIT 1");
            resultado = materiales.executeQuery();
            int ultimoIdPartes = 0; 
            if (resultado.next()) { 
                ultimoIdPartes = resultado.getInt("id_partes"); 
            }
            st = conex.prepareStatement("INSERT INTO proyecto (usuario, nombre, presupuesto, fecha, sustentabilidad, materiales) VALUES (?,?,?,?,?,?)");
            st.setInt(1,proyecto.getIdUsuario());
            st.setString(2,proyecto.getNombreProyecto());
            st.setDouble(3,proyecto.getPresupuesto());
            st.setString(4,fecha());
            st.setString(5,(String)sustentabilidad.getSelectedItem());
            st.setInt(6,ultimoIdPartes+1);
            int rowsInserted = st.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
            proyecto.setFechaDeCreacion(fecha());
            proyecto.setSustentabilidad((String)sustentabilidad.getSelectedItem());
            proyecto.setIdMateriales(ultimoIdPartes+1);
            materiales = conex.prepareStatement("SELECT id_proyecto FROM proyecto WHERE nombre = ?");
            materiales.setString(1, proyecto.getNombreProyecto()); 
            resultado = materiales.executeQuery(); 
            if (resultado.next()) { 
                proyecto.setIdProyecto(resultado.getInt("id_proyecto"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (resultado != null) resultado.close(); 
            if (materiales != null) materiales.close(); 
            if (st != null) st.close(); 
            if (conex != null) conex.close();
        }
        return bol;
    }
    //llenar box de materiales
    public void llenarBoxMateriales(JComboBox material) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt=  null;
        ResultSet rs = null;
        String sql = "SELECT nombre_material FROM material";
        try {
            stmt = conex.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                material.addItem(rs.getString("nombre_material"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            stmt.close();
            rs.close();
            conex.close();
            con.desconectar();
        }
        
    }
    //guardar materiales
    public void guardarMateriales(JComboBox material, JLabel parte) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        int id = 0;
        String sql1 = "SELECT id_material FROM material WHERE nombre_material = "+material.getSelectedItem();
        String sql2 = "INSERT INTO partes ("+parte.getText()+") VALUES(?)";
        try {
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql1);
            if(rs.next()){
                id = rs.getInt("id_material");
            }
            st = conex.prepareStatement(sql2);
            st.setInt(1,id);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            st.close();
            stmt.close();
            rs.close();
            conex.close();
            con.desconectar();
        }
    }
    
    //**************************VER PROYECTO**************************
    
    //**************************ELIMINAR PROYECTO**************************
    public int eliminarProyecto() throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement st = null;
        Statement stmt= null;
        ResultSet rs = null;
        boolean boleano = false;
        int val = 0, idInt, idMaterial = 0;
        String patron = "^\\d+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(idProyecto.getText());
        String sql1 = "DELETE FROM parte WHERE id_partes = ?";
        String sql2 = "DELETE FROM proyecto WHERE nombre = ?";
        String sql3 = "SELECT id_proyecto FROM proyecto";
        String sql4 = "SELECT materiales FROM proyecto WHERE id_proyecto = ?";
        try {
            if(!matcher.matches()){
                val = 1; // si no cumple con el patron de solo poseer numeros
            }else{
                idInt = Integer.parseInt(idProyecto.getText());
                stmt = conex.createStatement();
                rs = stmt.executeQuery(sql3);
                while(rs.next()){
                    if(idInt == rs.getInt("id_proyecto")){
                        boleano = true;
                    }
                }
                if(boleano){
                    st = conex.prepareStatement(sql4);
                    st.setInt(1,idInt);
                    rs = st.executeQuery();
                    if(rs.next()){
                        idMaterial = rs.getInt("materiales");
                    }
                    //aqui eliminamos
                    st = conex.prepareStatement(sql1);
                    st.setInt(1, idMaterial);
                    st.execute();
                    st = conex.prepareStatement(sql2);
                    st.setInt(1, idInt);
                    st.execute();
                }else{
                    val = 2; //si ese id no existe
                }   
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            stmt.close();
            rs.close();
            st.close();
            conex.close();
            con.desconectar();
        }
        return val;
    }
}
