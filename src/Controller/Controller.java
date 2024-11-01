/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuario;
import Model.Proyecto;
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
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Sofia Moreno, Ricardo Barrios, Aquiles Millan, Luis Morales.
 */
public class Controller {
    JTextField usuarioInicio, contraseñaInicio;
    JTextField usuarioRegistro, claveRegistro, nombreRegistro, apellidoRegistro, paisRegistro, 
               institucionRegistro, carreraRegistro;
    JComboBox moneda;
    JFrame ventana;
    
    public Controller(JFrame ventana, JTextField usuarioInicio, JTextField contraseñaInicio){
        this.ventana = ventana;
        this.usuarioInicio = usuarioInicio;
        this.contraseñaInicio = contraseñaInicio;
    }
    
    //CON ESTOS METODOS SE INICIALIZA USUARIO
    //este metodo para inicial sesion
    public void iniciarSesion(Usuario user){
        user.setUsuario(usuarioInicio.getText());
        user.setClave(contraseñaInicio.getText());
    }
    //este metodo para registrar usuario
    public void registrarUsuario(Usuario user){
        user.setUsuario(usuarioRegistro.getText());
        user.setClave(claveRegistro.getText());
        user.setNombreUsuario(nombreRegistro.getText());
        user.setApellidoUsuario(apellidoRegistro.getText());
        user.setPaisUsuario(paisRegistro.getText());
        user.setInstitucionUsuario(institucionRegistro.getText());
        user.setCarreraUsuario(carreraRegistro.getText());
    }
    
    //VALIDACIONES PARA INICIAR SESION
    //validacion usuario
    public boolean validarUsuario(Usuario user, JTextField dato){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt;
        ResultSet rs;
        boolean bol = false;
        String sql = "SELECT * FROM usuario";
        try{
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(dato.getText().equals(rs.getString("usuario"))){
                    bol = true;
                    user.setUsuario(dato.getText());
                }
            }
            rs.close();
            stmt.close();
            con.desconectar();
        }catch(SQLException ex){
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return bol;
    }
    //validacion contraseña
    public boolean validarClave(Usuario user){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement st;
        ResultSet rs;
        boolean bol = false;
        int id =0;
        String pas ="";
        String sql1 = "SELECT id_usuario FROM usuario WHERE usuario = ?";
        try {
            st = conex.prepareStatement(sql1);
            st.setString(1, user.getUsuario());
            rs = st.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id_usuario");
            }
            String sql2 = "SELECT contraseña FROM usuario WHERE id_usuario = "+id;
            st = conex.prepareStatement(sql2);
            rs = st.executeQuery();
            if(rs.next()){
                pas = rs.getString("contraseña");
            }
            if(!pas.equals(user.getClave())){
                bol=true;
            }
            else{
                user.setClave(pas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bol;
    }
    
    
    //VALIDACIONES DE REGISTRAR USUARIO
    //validar nombre o apellido
    public int validarNombreApellidoRegistro(Usuario user,String tipoDato, JTextField dato){
        int e = 0; //valor sin errores
        String patron= "^[A-Z][a-z]*$"; //Patron para ingresar una sola palabra con mayuscula al inicio.
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(dato.getText());
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
    public int validarUsuarioRegistro(Usuario user, JTextField dato){
        int val =0; //si no hay errores
        boolean bol = false;
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt;
        ResultSet rs;
        String sql = "SELECT * FROM usuario";
        try {
            //aqui definimos si este usuario ya existe
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(dato.getText().equals(rs.getString("usuario"))){
                    bol = true;
                }
            }
            if(bol==true && (dato.getText().length()>15 || dato.getText().length()<3)){
                val = 1; //error si no cumple las dos condiciones
            }
            else if(bol==true){
                val = 2; //error si este usuario ya existe
            }
            else if(dato.getText().length()>15 || dato.getText().length()<3){
                val = 3; //error si no tiene el tamaño correcto
            }
            else{
                user.setUsuario(dato.getText());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }
    //validar contraseña
    public int validarContraseña(Usuario user, JTextField dato){
        int val = 0; //valor sin errores
        String patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!&$._*-]).*$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(dato.getText());
        if(!matcher.matches() && (dato.getText().length()>15 || dato.getText().length()<3)){
            val = 1; //si no cumple con ambas condiciones
        }
        else if(!matcher.matches()){
            val = 2; //si no cumple el patron
        }
        else if(dato.getText().length()>15 || dato.getText().length()<3){
            val = 3; //si no cumple la longitud
        }
        else{
            user.setClave(dato.getText());
        } 
        return val;
    }
    
}
