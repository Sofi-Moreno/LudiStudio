/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LAMM
 */
public class Proyecto {
    private String nombreProyecto,fechaDeCreacion,usuario;
    private double presupuesto, presupuestoTotal;

    public Proyecto(String nombreProyecto, double presupuesto, double presupuestoTotal, String fechaDeCreacion, String usuario) {
        this.nombreProyecto = nombreProyecto;
        this.presupuesto = presupuesto;
        this.presupuestoTotal = presupuestoTotal;
        this.fechaDeCreacion = fechaDeCreacion;
        this.usuario = usuario;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPresupuestoTotal() {
        return presupuestoTotal;
    }

    public void setPresupuestoTotal(double presupuestoTotal) {
        this.presupuestoTotal = presupuestoTotal;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void crearProyecto(){
        
    }
    public void verProyectos(){
        
    }
    public void eliminarProyectos(){
        
    }
    public void modificarProyectos(){
        
    }
    public void calcularPresupuesto(){
        
    }
    public void validarProyecto(){
        
    }
}
