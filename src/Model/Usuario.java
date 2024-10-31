/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.InputMismatchException;
import java.util.Scanner;
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMonedaUsuario() {
        return monedaUsuario;
    }

    public void setMonedaUsuario(String monedaUsuario) {
        this.monedaUsuario = monedaUsuario;
    }

    public String getPaisUsuario() {
        return paisUsuario;
    }

    public void setPaisUsuario(String paisUsuario) {
        this.paisUsuario = paisUsuario;
    }

    public String getInstitucionUsuario() {
        return institucionUsuario;
    }

    public void setInstitucionUsuario(String institucionUsuario) {
        this.institucionUsuario = institucionUsuario;
    }

    public String getCarreraUsuario() {
        return carreraUsuario;
    }

    public void setCarreraUsuario(String carreraUsuario) {
        this.carreraUsuario = carreraUsuario;
    }
    
    public boolean validarNombreApellido(String cadena){
        boolean boleano = false;
        String patron= "^[A-Z][a-z]*$"; //Patron para ingresar una sola palabra con mayuscula al inicio.
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);
        if (!matcher.matches() || cadena.length()>25){
            boleano = true;
        }
        return boleano;
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
    
        public void verUsuario(){

    }
        public void eliminarUsuario(){

    }
        public void validarUsuario(){

    }
        public void iniciarSesion(){

    }
}
