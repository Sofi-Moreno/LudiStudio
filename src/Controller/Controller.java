/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sofia Moreno, Ricardo Barrios, Aquiles Millan, Luis Morales.
 */
public class Controller {
    JTextField usuarioInicio, contraseñaInicio;
    JTextField usuarioRegistro, claveRegistro, nombreRegistro, apellidoRegistro;
    JComboBox monedaRegistro,paisRegistro,institucionRegistro, carreraRegistro;;
    JPanel ventana;
    
    //CONSTRUCTORES
    //constructor para iniciar sesion
    public Controller(JTextField usuarioInicio, JTextField contraseñaInicio, JPanel ventana){    
        this.usuarioInicio = usuarioInicio;
        this.contraseñaInicio = contraseñaInicio;
        this.ventana = ventana;
    }
    //constructor para registrar unuario
    public Controller(JTextField usuarioRegistro, JTextField claveRegistro, JTextField nombreRegistro, JTextField apellidoRegistro, 
            JComboBox monedaRegistro, JComboBox paisRegistro, JComboBox institucionRegistro, JComboBox carreraRegistro, JPanel ventana) {
        this.usuarioRegistro = usuarioRegistro;
        this.claveRegistro = claveRegistro;
        this.nombreRegistro = nombreRegistro;
        this.apellidoRegistro = apellidoRegistro;
        this.monedaRegistro = monedaRegistro;
        this.paisRegistro = paisRegistro;
        this.institucionRegistro = institucionRegistro;
        this.carreraRegistro = carreraRegistro;
        this.ventana = ventana;
    }
    //constructor para eliminar
    public Controller(JPanel ventana){
        this.ventana = ventana;
    }
    //VALIDACIONES PARA INICIAR SESION
    //validacion usuario
    public boolean validarUsuario(Usuario user){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean bol = false;
        try{
            stmt = conex.prepareStatement("SELECT COUNT(*) AS cantidad FROM usuario WHERE usuario = ?");
            stmt.setString(1,usuarioInicio.getText());
            rs = stmt.executeQuery();
            if(rs.next()){
                if(rs.getInt("cantidad")==1){
                bol = true;
                user.setUsuario(usuarioInicio.getText());
                }
            }
            
        }catch(SQLException ex){
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(stmt!=null) stmt.close();
                if(rs!=null) rs.close();
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return bol;
    }
    //validacion contraseña
    public boolean validarClave(Usuario user) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement st = null;
        ResultSet rs= null;
        boolean bol = false;
        String pas ="";
        String sql1 = "SELECT id_usuario FROM usuario WHERE usuario = ?";
        try {
            st = conex.prepareStatement(sql1);
            st.setString(1, user.getUsuario());
            rs = st.executeQuery();
            if (rs.next()) {
                user.setId_usuario(rs.getInt("id_usuario"));
            }
            String sql2 = "SELECT contraseña FROM usuario WHERE id_usuario = ?";
            st = conex.prepareStatement(sql2);
            st.setInt(1, user.getId_usuario());
            rs = st.executeQuery();
            if(rs.next()){
                pas = rs.getString("contraseña");
            }
            if(!pas.equals(contraseñaInicio.getText())){
                bol=true;
            }
            else{
                user.setClave(contraseñaInicio.getText());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            rs.close();
            st.close();
            conex.close();
            con.desconectar();
        }
        
        return bol;
    }
    //inicializacion de usuario en caso de que no existan errores
    public void iniciarSesion(Usuario user){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection();
        Statement stmt;
        ResultSet rs;
        String sql = "SELECT * FROM usuario WHERE id_usuario = "+user.getId_usuario();
        try {
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                user.setApellidoUsuario(rs.getString("apellido"));
                user.setNombreUsuario(rs.getString("nombre"));
                user.setMonedaUsuario(rs.getString("moneda"));
                user.setPaisUsuario(rs.getString("pais"));
                user.setInstitucionUsuario(rs.getString("institucion"));
                user.setCarreraUsuario(rs.getString("carrera"));
            }
            conex.close();
            con.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);           
        }
    }
     
    //VALIDACIONES DE REGISTRAR USUARIO
    //validar nombre o apellido
    public int validarNombreApellidoRegistro(Usuario user,String tipoDato){
        int e = 0; //valor sin errores
        String patron= "^[A-Z][a-z]*$"; //Patron para ingresar una sola palabra con mayuscula al inicio.
        JTextField dato = null;
        if(tipoDato.equals("apellido")){
            dato = apellidoRegistro;
        }else if(tipoDato.equals("nombre")){
            dato = nombreRegistro;
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
        else if(e==0 && tipoDato.equals("apellido")){
            user.setApellidoUsuario(dato.getText()); //aqui asignamos apellido
        }else if(e==0 && tipoDato.equals("nombre")){
            user.setNombreUsuario(dato.getText()); //aqui asignamos nombre
        }
        return e;
    }
    //validar usuario
    public int validarUsuarioRegistro(Usuario user) throws SQLException{
        int val =0; //si no hay errores
        boolean bol = false;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuario";
        String patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!&$._*-]).*$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(usuarioRegistro.getText());
        try {
            //aqui definimos si este usuario ya existe
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(usuarioRegistro.getText().equals(rs.getString("usuario"))){
                    bol = true;
                }
            }
            if(bol==true){
                val = 1; //error si este usuario ya existe
            }
            else if(!matcher.matches() && (usuarioRegistro.getText().length()>10 || usuarioRegistro.getText().length()<3)){
                val = 2; //si no cumple el patron y no tiene la longitud correcta
            }
            else if(!matcher.matches()){
                val = 3; //si no cumple el patron
            }
            else if(usuarioRegistro.getText().length()>10 || usuarioRegistro.getText().length()<3){
                val = 4; //error si no tiene el tamaño correcto
            }
            else{
                user.setUsuario(usuarioRegistro.getText());
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
    //validar contraseña
    public int validarContraseña(Usuario user) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuario";
        int val = 0; //valor sin errores
        boolean bol = false; //valor sin error
        String patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!$&¡*\\-_]).+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(claveRegistro.getText());
        try {
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(claveRegistro.getText().equals(rs.getString("contraseña"))){
                    bol = true;//si ya se encuentra en la base de datos
                }
            }
            if(bol == true){
                val = 1; //si ya esta en la base de datos
            }
            if(!matcher.matches() && (claveRegistro.getText().length()>10 || claveRegistro.getText().length()<3)){
                val = 2; //si no cumple con ambas condiciones
            }
            else if(!matcher.matches()){
                val = 3; //si no cumple el patron
            }
            else if(claveRegistro.getText().length()>10 || claveRegistro.getText().length()<3){
                val = 4; //si no cumple la longitud
            }
            else{
                user.setClave(claveRegistro.getText());
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
    //registro de usuario en caso de que no existan errores
    public boolean guardarRegistroDB(Usuario user) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement st = null;
        String sql = "INSERT INTO usuario (usuario, contraseña, apellido, nombre, pais, moneda, institucion, carrera) VALUES (?,?,?,?,?,?,?,?)";
        try {
            st = conex.prepareStatement(sql);
            st.setString(1,user.getUsuario());
            st.setString(2,user.getClave());
            st.setString(3,user.getApellidoUsuario());
            st.setString(4,user.getNombreUsuario());
            st.setString(5,(String)paisRegistro.getSelectedItem());
            st.setString(6,(String)monedaRegistro.getSelectedItem());
            st.setString(7,(String)institucionRegistro.getSelectedItem());
            st.setString(8,(String)carreraRegistro.getSelectedItem());
            int rowsInserted = st.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
            user.setPaisUsuario((String) paisRegistro.getSelectedItem());
            user.setMonedaUsuario((String) monedaRegistro.getSelectedItem());
            user.setInstitucionUsuario((String) institucionRegistro.getSelectedItem());
            user.setCarreraUsuario((String) carreraRegistro.getSelectedItem());
            
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            st.close();
            conex.close();
            con.desconectar();
        }
        return bol;
    }
    
    //MODIFICAR USUARIO
    public boolean guardarModificacion(Usuario usuario) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement st = null;
        String sql = "UPDATE usuario SET usuario = ?, contraseña = ?, apellido = ?, nombre = ?, pais = ?, moneda = ?, institucion = ?, carrera = ? WHERE id_usuario = ?";
        try {
            st = conex.prepareStatement(sql);
            st.setString(1,usuarioRegistro.getText());
            st.setString(2,claveRegistro.getText());
            st.setString(3,apellidoRegistro.getText());
            st.setString(4,nombreRegistro.getText());
            st.setString(5,(String)paisRegistro.getSelectedItem());
            st.setString(6,(String)monedaRegistro.getSelectedItem());
            st.setString(7,(String)institucionRegistro.getSelectedItem());
            st.setString(8,(String)carreraRegistro.getSelectedItem());
            st.setInt(9, usuario.getId_usuario());
            int rowsInserted = st.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
            usuario.setUsuario(usuarioRegistro.getText());
            usuario.setClave(claveRegistro.getText());
            usuario.setApellidoUsuario(apellidoRegistro.getText());
            usuario.setNombreUsuario(nombreRegistro.getText());
            usuario.setPaisUsuario((String) paisRegistro.getSelectedItem());
            usuario.setMonedaUsuario((String) monedaRegistro.getSelectedItem());
            usuario.setInstitucionUsuario((String) institucionRegistro.getSelectedItem());
            usuario.setCarreraUsuario((String) carreraRegistro.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null) st.close();
            conex.close();
            con.desconectar();
        }
        return bol;
    }
    
    //ELIMINAR USUARIO
    //eliminarProyectosDelUsuario
    public void eliminarProyecto(int id) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement st = null;
        Statement stmt= null;
        ResultSet rs = null;
        int idMaterial = 0;
        String sql1 = "DELETE FROM partes WHERE id_partes = ?";
        String sql2 = "DELETE FROM proyecto WHERE id_proyecto = ?";
        String sql3 = "SELECT materiales FROM proyecto WHERE id_proyecto = ?";
        try {
            st = conex.prepareStatement(sql3);
            st.setInt(1,id);
            rs = st.executeQuery();
            if(rs.next()){
                idMaterial = rs.getInt("materiales");
            }
            //aqui eliminamos
            st = conex.prepareStatement(sql1);
            st.setInt(1, idMaterial);
            st.executeUpdate();
            st = conex.prepareStatement(sql2);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            if(st!=null) st.close();
            conex.close();
            con.desconectar();
        }
    }
    //eliminar usuario
    public boolean eliminarUsuario(Usuario usuario){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean bol = false;
        int cont=0;
        List<Integer> proyectos = new ArrayList<>();
        try {
            stmt = conex.prepareStatement("SELECT id_proyecto FROM proyecto WHERE usuario = ?");
            stmt.setInt(1,usuario.getId_usuario());
            rs = stmt.executeQuery();
            while(rs.next()){
                proyectos.add(rs.getInt("id_proyecto"));
            }
            System.out.println(proyectos);
            while(cont<proyectos.size()){
                eliminarProyecto(proyectos.get(cont));
                cont++;
            }
            stmt = conex.prepareStatement("DELETE FROM usuario WHERE id_usuario = ?");
            stmt.setInt(1,usuario.getId_usuario());
            stmt.executeUpdate();
            bol = true;
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bol;
    }
}
