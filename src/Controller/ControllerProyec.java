/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Proyecto;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    
    //atributos de vista previa
    DefaultTableModel tabla;
    JFrame ventanita;
    
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
    public ControllerProyec(JPanel ventana,JTextField idProyecto) {
        this.ventana = ventana;
        this.idProyecto = idProyecto;
    }
    //constructor para vista previa

    public ControllerProyec(JFrame ventanita) {
        this.ventanita = ventanita;
    }
    
    //constructor para ver
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
            materiales = conex.prepareStatement("INSERT INTO partes(Zapata) VALUES(0)");
            materiales.executeUpdate();
            materiales = conex.prepareStatement("SELECT id_partes FROM partes");
            resultado = materiales.executeQuery();
            int ultimoIdPartes = 0; 
            while (resultado.next()) { 
                ultimoIdPartes = resultado.getInt("id_partes"); 
            }
            System.out.println(ultimoIdPartes);
            st = conex.prepareStatement("INSERT INTO proyecto (usuario, nombre, presupuesto, fecha, sustentabilidad, materiales) VALUES (?,?,?,?,?,?)");
            st.setInt(1,proyecto.getIdUsuario());
            st.setString(2,proyecto.getNombreProyecto());
            st.setDouble(3,proyecto.getPresupuesto());
            st.setString(4,fecha());
            st.setString(5,(String)sustentabilidad.getSelectedItem());
            st.setInt(6,ultimoIdPartes);
            int rowsInserted = st.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
            proyecto.setFechaDeCreacion(fecha());
            proyecto.setSustentabilidad((String)sustentabilidad.getSelectedItem());
            proyecto.setIdMateriales(ultimoIdPartes);
            
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
    public void llenarBoxMateriales(JComboBox material, List<String> lista) throws SQLException{
        int cont = 0;
        while(cont<lista.size()){
            material.addItem(lista.get(cont));
            cont++;
        }
    }
    
    public void llenarListaMateriales(List<String> material) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt=  null;
        ResultSet rs = null;
        String sql = "SELECT nombre_material FROM material";
        try {
            stmt = conex.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                material.add(rs.getString("nombre_material"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        
    }
    //guardar materiales
    public void guardarMateriales(Proyecto proyecto,JComboBox material, String sql) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement st = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id = 0;
        String sql1 = "SELECT id_material FROM material WHERE nombre_material = ?";
        try {
            st = conex.prepareStatement(sql1);
            st.setString(1, (String)material.getSelectedItem());
            rs = st.executeQuery();
            if(rs.next()){
                id = rs.getInt("id_material");
            }
            stmt = conex.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.setInt(2,proyecto.getIdMateriales());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null) st.close();
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
    }
    //llenar tablita
    public DefaultTableModel llenarVistaPrevia(Proyecto proyecto) throws SQLException{
        List<String> partes = new ArrayList<>();
        partes.add("Zapata");partes.add("MurosDeContención");partes.add("Columnas");partes.add("Vigas");
        partes.add("Losas");partes.add("Entrepiso");partes.add("EstructuraDeCubierta");partes.add("Cubierta");partes.add("Muros");
        partes.add("Ventanas");partes.add("Puertas");partes.add("Escalera");partes.add("Rampas");partes.add("Barandas");partes.add("Techos");
        String [] columnas = {"PARTE","RUBRO", "NOMBRE MATERIAL", "UNIDAD", "PRECIO MATERIAL", "SUSTENTABILIDAD", "PROVEEDOR", "TRANSPORTE", "PRECIO TRANSPORTE", "MANO DE OBRA", "PRECIO MANO", "HERRAMIENTAS", "COSTO HERRAMIENTAS", "COSTO TOTAL"};
        String [] registros = new String[14];
        DefaultTableModel modelo = new DefaultTableModel(null,columnas);
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int part = 0;
        int cont = 0;
        try {
            while(cont<partes.size()){
                stmt = conex.prepareStatement("SELECT "+partes.get(cont)+" FROM partes WHERE id_partes = ?");
                stmt.setInt(1, proyecto.getIdMateriales());
                rs = stmt.executeQuery();
                if(rs.next()){
                    part = rs.getInt(partes.get(cont));
                }
                stmt = conex.prepareStatement("SELECT * FROM material WHERE id_material = ?");
                stmt.setInt(1, part);
                rs = stmt.executeQuery();
                if(rs.next()){
                    registros[0] = partes.get(cont);
                    registros[1] = rs.getString("rubro_material");
                    registros[2] = rs.getString("nombre_material");
                    registros[3] = rs.getString("unidad_material");
                    registros[4] = rs.getString("costo_material");
                    registros[5] = rs.getString("sustentabilidad_material");
                    registros[6] = rs.getString("proveedor_material");
                    registros[7] = rs.getString("transporte_material");
                    registros[8] = rs.getString("costo_transporte");
                    registros[9] = rs.getString("manodeobra_material");
                    registros[10] = rs.getString("costo_manodeobra");
                    registros[11] = rs.getString("herramientas_material");
                    registros[12] = rs.getString("costo_herramientas");
                    registros[13] = rs.getString("costo_total");
                    modelo.addRow(registros);
                }
                cont++;
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        return modelo;  
    }
    //mostrar el precio del material seleccionado
    public String mostrarPrecio(JComboBox material) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String precio = "0";
        try {
            stmt = conex.prepareStatement("SELECT costo_total FROM material WHERE nombre_material = ?");
            stmt.setString(1, (String) material.getSelectedItem());
            rs = stmt.executeQuery();
            if(rs.next()){
                precio = String.valueOf(rs.getDouble("costo_total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        return precio;  
    }
    //calculo de presupuesto total
    public double calculoPresupuestoTotal(JComboBox material, Double presupuesto) throws SQLException{
        double total=0, precio=0;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try { 
            stmt = conex.prepareStatement("SELECT costo_total FROM material WHERE nombre_material = ?");
            stmt.setString(1, (String) material.getSelectedItem());
            rs = stmt.executeQuery();
            if(rs.next()){
                precio = rs.getDouble("costo_total");
            }
            total = presupuesto + precio;
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        return total;
    }
    public void guardarProyecto(Double presupuesto, Proyecto proyecto) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        try {
            stmt = conex.prepareStatement("UPDATE proyecto SET presupuestoTotal = ? WHERE id_proyecto = ?");
            stmt.setDouble(1, presupuesto);
            stmt.setInt(2, proyecto.getIdProyecto());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            conex.close();
            con.desconectar();
        }

    }
    
    
    //**************************VER PROYECTO**************************
    public DefaultTableModel llenarVerProyecto(Usuario usuario){
        String [] columnas = {"ID","NOMBRE"};
        DefaultTableModel modelo = new DefaultTableModel(null,columnas);
        String [] registros = new String[2];
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conex.prepareStatement("SELECT id_proyecto, nombre FROM proyecto WHERE usuario = ?");
            stmt.setInt(1, usuario.getId_usuario());
            rs = stmt.executeQuery();
            while(rs.next()){
                registros [0] = String.valueOf(rs.getInt("id_proyecto"));
                registros [1] = rs.getString("nombre");
                modelo.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modelo;
    }
    public int validarID(Usuario usuario, Proyecto proyecto) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt= null;
        ResultSet rs = null;
        int val = 0;
        boolean boleano = false;
        String patron = "^\\d+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(idProyecto.getText());
        try{
            if(!matcher.matches()){
                val = 1; // si no cumple con el patron de solo poseer numeros
            }else{
                stmt = conex.createStatement();
                rs = stmt.executeQuery("SELECT id_proyecto FROM proyecto WHERE usuario = "+usuario.getId_usuario());
                while(rs.next()){
                    if(idProyecto.getText().equals(String.valueOf(rs.getInt("id_proyecto")))){
                        proyecto.setIdUsuario(rs.getInt("id_proyecto"));
                        boleano = true;
                    }
                }
                if(boleano){
                    stmt = conex.createStatement();
                    rs = stmt.executeQuery("SELECT * FROM proyecto WHERE id_proyecto ="+idProyecto.getText());
                    if(rs.next()){
                        proyecto.setIdUsuario(rs.getInt("usuario"));
                        proyecto.setNombreProyecto(rs.getString("nombre"));
                        proyecto.setPresupuesto(rs.getDouble("presupuesto"));
                        proyecto.setPresupuestoTotal(rs.getDouble("presupuestoTotal"));
                        proyecto.setFechaDeCreacion(rs.getString("fecha"));
                        proyecto.setSustentabilidad(rs.getString("sustentabilidad"));
                        proyecto.setIdMateriales(rs.getInt("materiales"));
                        
                    }
                    
                }else{
                    val = 2; //si no existe
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        
        return val;
    }
    
    
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
        String sql1 = "DELETE FROM partes WHERE id_partes = ?";
        String sql2 = "DELETE FROM proyecto WHERE id_proyecto = ?";
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
                    st.executeUpdate();
                    st = conex.prepareStatement(sql2);
                    st.setInt(1, idInt);
                    st.executeUpdate();
                }else{
                    val = 2; //si ese id no existe
                }   
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            if(st!=null) st.close();
            conex.close();
            con.desconectar();
        }
        return val;
    }
    
}
