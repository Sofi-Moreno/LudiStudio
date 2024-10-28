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
    private String nombreUsuario;
    private String apellidoUsuario;
    private String usuario;
    private String clave;
    private String monedaUsuario;
    private String paisUsuario;
    private String institucionUsuario;
    private String carreraUsuario;

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
    
    public String ingresarnameUsuario(String cadena){
        Scanner scan= new Scanner(System.in);
        String patron1= "^[A-Z][a-z]*$"; //Patron para ingresar una sola palabra con mayuscula al inicio.
        boolean usuarioval= false;
        try{
            while(!usuarioval){
                Pattern pattern = Pattern.compile(patron1);
                Matcher matcher1 = pattern.matcher(cadena);
                if (!matcher1.matches()){
                    System.out.println("ERROR por favor solo ingrese una palabra.");
                }
            }
        }catch(InputMismatchException e) {
        System.out.println("Error: Ingrese por favor un caracter valido.");
        scan.nextLine();  
        }
        return cadena; //OJOOOOOOOOO METODO POR TESTEAR
    }
        public void pedirDatos(){
            Scanner esca= new Scanner(System.in);
            String cad;
            System.out.println("Ingrese su primer nombre: ");
            cad = esca.next();
            nombreUsuario = ingresarnameUsuario(cad);
            System.out.println("Ingrese su primer apellido: ");
            cad = esca.next();
            apellidoUsuario = ingresarnameUsuario(cad);
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
