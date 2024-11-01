/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

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
    
    //getter y setter

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
    
}
