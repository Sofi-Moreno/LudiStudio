/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.ConnectionDB;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sofia Moreno
 */
public class Usuario {
    private String nombreUsuario, apellidoUsuario, usuario, clave, 
            monedaUsuario, paisUsuario, institucionUsuario, carreraUsuario;


    public Usuario(String nombreUsuario, String apellidoUsuario, String usuario, String clave, String monedaUsuario, String paisUsuario, String institucionUsuario, String carreraUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.usuario = usuario;
        this.clave = clave;
        this.monedaUsuario = monedaUsuario;
        this.paisUsuario = paisUsuario;
        this.institucionUsuario = institucionUsuario;
        this.carreraUsuario = carreraUsuario;
    }
    
    public boolean validarUsuario(String cadena){
        boolean boleano = false;
        if(cadena.length()>15){
            boleano = true;
        }
        return boleano;
    }
    
    public boolean validarContraseña(String cadena){
        boolean boleano = false;
        String patron = "";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);
        if(!matcher.matches() || cadena.length()>15){
            
        }
        return boleano;
    }
    
    //ESTOS METODOS VALIDAN EL INICIO DE SESIÓN
    //en este metodo validamos que al iniciar sesion el usuario exista en la DB
    public boolean validarUsuarioContraseña(String user){
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
                if(user == rs.getString("usuario")){
                    bol = true;
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
    //en este metodo validamos que la contraseña introducida por el usuario sea la correcta
    public boolean validarClave(String user, String pass){
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
            st.setString(1, user);
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
            if(!pas.equals(pass)){
                bol=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bol;
    }
    
    //ESTOS METODOS VALIDAN EL REGISTRO DE USUARIOS
    //con esta funcion validamos el nombre y el apellido del usuario
    public int validarNombreApellido(String cadena){
        int e = 0;
        String patron= "^[A-Z][a-z]*$"; //Patron para ingresar una sola palabra con mayuscula al inicio.
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);
        if (!matcher.matches()){
            e = 1; //no cumple el patron
        }
        else if(cadena.length()>25 || cadena.length()<1){
            e = 2; //no tiene el tamaño correcto
        }
        if(!matcher.matches() && (cadena.length()>25 || cadena.length()<1)){
            e = 3; //no cumple el patron y no es del tamaño correcto
        }
        return e;
    }
    //con esta funcion validamos el usuario
    
    //con esta funcion validamos la contraseña
}
