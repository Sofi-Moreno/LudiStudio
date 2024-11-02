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
    private String nombreProyecto,fechaDeCreacion;
    private double presupuesto, presupuestoTotal;
    private int id_usuario;
    
    public Proyecto(){
        nombreProyecto = "";
        fechaDeCreacion = "";
        id_usuario = 0;
        presupuesto = 0.0;
        presupuestoTotal = 0.0;
    }

    public Proyecto(String nombreProyecto, double presupuesto, double presupuestoTotal, String fechaDeCreacion, int id_usuario) {
        this.nombreProyecto = nombreProyecto;
        this.presupuesto = presupuesto;
        this.presupuestoTotal = presupuestoTotal;
        this.fechaDeCreacion = fechaDeCreacion;
        this.id_usuario = id_usuario;
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

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    
}
