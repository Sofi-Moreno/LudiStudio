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
    private String nombreProyecto,fechaDeCreacion, sustentabilidad;
    private double presupuesto, presupuestoTotal;
    private int idProyecto, idUsuario, idMateriales;
    
    public Proyecto(){
        nombreProyecto = "";
        fechaDeCreacion = "";
        sustentabilidad = "";
        idProyecto = 0;
        idUsuario = 0;
        idMateriales =0;
        presupuesto = 0.0;
        presupuestoTotal = 0.0;
    }

    public Proyecto(String nombreProyecto, String fechaDeCreacion, String sustentabilidad, double presupuesto, double presupuestoTotal, int idProyecto, int idUsuario, int idMateriales) {
        this.nombreProyecto = nombreProyecto;
        this.fechaDeCreacion = fechaDeCreacion;
        this.sustentabilidad = sustentabilidad;
        this.presupuesto = presupuesto;
        this.presupuestoTotal = presupuestoTotal;
        this.idProyecto = idProyecto;
        this.idUsuario = idUsuario;
        this.idMateriales = idMateriales;
    }

    

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdMateriales() {
        return idMateriales;
    }

    public void setIdMateriales(int idMateriales) {
        this.idMateriales = idMateriales;
    }

    public String getSustentabilidad() {
        return sustentabilidad;
    }

    public void setSustentabilidad(String sustentabilidad) {
        this.sustentabilidad = sustentabilidad;
    }

    

    
}
