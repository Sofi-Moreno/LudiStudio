/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LAMM
 */
public class Material {
    private String rubro,nombreMaterial,unidadMaterial,
            sustentabilidad,proveedor,transporte,manoDeObra,herramientas;
    
    private double cantidadMaterial,costoMaterial,costoTransporte,costoMDObra,
            costoHerramientas,costoTotalMaterial;
    private int id_material;
    
    public Material(){
        id_material = 0;
        rubro="";
        nombreMaterial="";
        unidadMaterial="";
        sustentabilidad="";
        proveedor="";
        transporte="";
        manoDeObra="";
        herramientas="";
        costoMaterial=0;
        costoTransporte=0;
        costoMDObra=0;
        costoHerramientas=0;
        costoTotalMaterial=0;
        cantidadMaterial=0;
    
    }

    public Material(int id_material,String rubro, String nombreMaterial, String unidadMaterial, String sustentabilidad,
            String proveedor, String transporte, String manoDeObra, String herramientas,double costoMaterial,
            double costoTransporte, double costoMDObra, double costoHerramientas, double costoTotalMaterial, int cantidadMaterial) {
        this.id_material = id_material;
        this.rubro = rubro;
        this.nombreMaterial = nombreMaterial;
        this.unidadMaterial = unidadMaterial;
        this.sustentabilidad = sustentabilidad;
        this.proveedor = proveedor;
        this.transporte = transporte;
        this.manoDeObra = manoDeObra;
        this.herramientas = herramientas;
        this.costoMaterial = costoMaterial;
        this.costoTransporte = costoTransporte;
        this.costoMDObra = costoMDObra;
        this.costoHerramientas = costoHerramientas;
        this.costoTotalMaterial = costoTotalMaterial;
        this.cantidadMaterial = cantidadMaterial;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }
    
    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getUnidadMaterial() {
        return unidadMaterial;
    }

    public void setUnidadMaterial(String unidadMaterial) {
        this.unidadMaterial = unidadMaterial;
    }

    public String getSustentabilidad() {
        return sustentabilidad;
    }

    public void setSustentabilidad(String sustentabilidad) {
        this.sustentabilidad = sustentabilidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getManoDeObra() {
        return manoDeObra;
    }

    public void setManoDeObra(String manoDeObra) {
        this.manoDeObra = manoDeObra;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    public double getCostoMaterial() {
        return costoMaterial;
    }

    public void setCostoMaterial(double costoMaterial) {
        this.costoMaterial = costoMaterial;
    }

    public double getCostoTransporte() {
        return costoTransporte;
    }

    public void setCostoTransporte(double costoTransporte) {
        this.costoTransporte = costoTransporte;
    }

    public double getCostoMDObra() {
        return costoMDObra;
    }

    public void setCostoMDObra(double costoMDObra) {
        this.costoMDObra = costoMDObra;
    }

    public double getCostoHerramientas() {
        return costoHerramientas;
    }

    public void setCostoHerramientas(double costoHerramientas) {
        this.costoHerramientas = costoHerramientas;
    }

    public double getCostoTotalMaterial() {
        return costoTotalMaterial;
    }

    public void setCostoTotalMaterial(double costoTotalMaterial) {
        this.costoTotalMaterial = costoTotalMaterial;
    }

    public double getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(int cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

}
