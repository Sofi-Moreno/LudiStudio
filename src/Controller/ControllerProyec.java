/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Controller;
import Model.Material;
import Model.Proyecto;
import Model.Usuario;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Moreno
 */
public class ControllerProyec {
    //atributos de primer panel (datos basicos)
    JTextField nombreProyecto, presupuestoInicial;
    JComboBox sustentabilidad,publico, actividad;
    JPanel ventana;
    
    //atributos para eliminar
    JTextField idProyecto;
    
    //atributos de vista previa
    DefaultTableModel tabla;
    JFrame ventanita;
    
    //CONSTRUCTORES
    //constructor para crear proyecto

    public ControllerProyec(JTextField nombreProyecto, JTextField presupuestoInicial, JComboBox sustentabilidad, JComboBox publico, JComboBox actividad, JPanel ventana) {
        this.nombreProyecto = nombreProyecto;
        this.presupuestoInicial = presupuestoInicial;
        this.sustentabilidad = sustentabilidad;
        this.publico = publico;
        this.actividad = actividad;
        this.ventana = ventana;
    }
    public ControllerProyec(JPanel ventana){
        this.ventana = ventana;
    }
    //constructor para eliminar
    public ControllerProyec(JPanel ventana,JTextField idProyecto) {
        this.ventana = ventana;
        this.idProyecto = idProyecto;
    }
    //constructor para vista previa
    public ControllerProyec(JFrame ventanita) {
        this.ventanita = ventanita;
    }
    //**************************CREAR PROYECTO**************************
    //validacion de nombre del proyecto
    public boolean validarNombre(Proyecto proyecto) {
        boolean boleano = false;
        if(nombreProyecto.getText().length()>25 || nombreProyecto.getText().length()<1){
            boleano = true;
        }
        else{
            proyecto.setNombreProyecto(nombreProyecto.getText());
        }
        return boleano;
    }
    //validacion del presupuesto
    public boolean validarPresupuesto(Proyecto proyecto){
        boolean boleano = false;
        String patron = "^[\\d.]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(presupuestoInicial.getText());
        if(!matcher.matches()){
            boleano = true;
        }else{
            proyecto.setPresupuesto(Double.parseDouble(presupuestoInicial.getText()));
        }
        return boleano;
    }
    //tomar fecha actual del sistema
    public String fecha(){
        String fechita;
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        fechita = fecha.format(formato);
        return fechita;
    }
    //guardar datos iniciales
    public boolean guardarInformacion(Proyecto proyecto,List<Material> material) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        boolean bol = false;
        PreparedStatement st = null;
        PreparedStatement materiales= null;
        ResultSet resultado = null;
        try {
            materiales = conex.prepareStatement("INSERT INTO partes(Zapata,MurosDeContención,Columnas,Vigas,Losas,Entrepiso,EstructuraDeCubierta,Cubierta,Muros,Ventanas,Puertas,Escalera,Rampas,Barandas,Techos)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            if(material.get(0)!=null){
                materiales.setInt(1, material.get(0).getId_material());
            }else{
                materiales.setNull(1,java.sql.Types.INTEGER);
            }
            if(material.get(1)!=null){
                materiales.setInt(2, material.get(1).getId_material());
            }else{
                materiales.setNull(2, java.sql.Types.INTEGER);
            }
            if(material.get(2)!=null){
                materiales.setInt(3, material.get(2).getId_material());
            }else{
                materiales.setNull(3, java.sql.Types.INTEGER);
            }
            if(material.get(3)!=null){
                materiales.setInt(4, material.get(3).getId_material());
            }else{
                materiales.setNull(4, java.sql.Types.INTEGER);
            }
            if(material.get(4)!=null){
                materiales.setInt(5, material.get(4).getId_material());
            }else{
                materiales.setNull(5, java.sql.Types.INTEGER);
            }
            if(material.get(5)!=null){
                materiales.setInt(6, material.get(5).getId_material());
            }else{
                materiales.setNull(6, java.sql.Types.INTEGER);
            }
            if(material.get(6)!=null){
                materiales.setInt(7, material.get(6).getId_material());
            }else{
                materiales.setNull(7, java.sql.Types.INTEGER);
            }
            if(material.get(7)!=null){
                materiales.setInt(8, material.get(7).getId_material());
            }else{
                materiales.setNull(8, java.sql.Types.INTEGER);
            }
            if(material.get(8)!=null){
                materiales.setInt(9, material.get(8).getId_material());
            }else{
                materiales.setNull(9, java.sql.Types.INTEGER);
            }
            if(material.get(9)!=null){
                materiales.setInt(10, material.get(9).getId_material());
            }else{
                materiales.setNull(10, java.sql.Types.INTEGER);
            }
            if(material.get(10)!=null){
                materiales.setInt(11, material.get(10).getId_material());
            }else{
                materiales.setNull(11, java.sql.Types.INTEGER);
            }
            if(material.get(11)!=null){
                materiales.setInt(12, material.get(11).getId_material());
            }else{
                materiales.setNull(12, java.sql.Types.INTEGER);
            }
            if(material.get(12)!=null){
                materiales.setInt(13, material.get(12).getId_material());
            }else{
                materiales.setNull(13, java.sql.Types.INTEGER);
            }
            if(material.get(13)!=null){
                materiales.setInt(14, material.get(13).getId_material());
            }else{
                materiales.setNull(14, java.sql.Types.INTEGER);
            }
            if(material.get(14)!=null){
                materiales.setInt(15, material.get(14).getId_material());
            }else{
                materiales.setNull(15, java.sql.Types.INTEGER);
            }
            materiales.executeUpdate();
            materiales = conex.prepareStatement("SELECT MAX(id_partes) AS ultimoID FROM partes");
            resultado = materiales.executeQuery();
            int ultimoIdPartes = 0; 
            while (resultado.next()) { 
                ultimoIdPartes = resultado.getInt("ultimoID"); 
            }
            System.out.println(ultimoIdPartes);
            st = conex.prepareStatement("INSERT INTO proyecto (usuario, nombre, presupuesto,presupuestoTotal, fecha, sustentabilidad,publico,actividad,resumen,materiales) VALUES (?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1,proyecto.getIdUsuario());
            st.setString(2,proyecto.getNombreProyecto());
            st.setDouble(3,proyecto.getPresupuesto());
            st.setDouble(4,proyecto.getPresupuestoTotal());
            st.setString(5,proyecto.getFechaDeCreacion());
            st.setString(6,proyecto.getSustentabilidad());
            st.setString(7,proyecto.getPublico());
            st.setString(8,proyecto.getActividad());
            st.setString(9,proyecto.getResumen());
            st.setInt(10,ultimoIdPartes);
            int rowsInserted = st.executeUpdate();
            if(rowsInserted>0){
                bol = true;
            }
            proyecto.setIdMateriales(ultimoIdPartes);
            
            materiales = conex.prepareStatement("SELECT MAX(id_proyecto) AS ultimoID FROM proyecto");
            resultado = materiales.executeQuery(); 
            if (resultado.next()) { 
                proyecto.setIdProyecto(resultado.getInt("ultimoID"));
            }
            System.out.println(proyecto.getIdProyecto());
            System.out.println(proyecto.getIdMateriales());
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (resultado != null) resultado.close(); 
            if (materiales != null) materiales.close(); 
            if (st != null) st.close(); 
            if (conex != null) conex.close();
        }
        return bol;
    }
    //llenar box de materiales
    public void llenarBoxMateriales(JComboBox material, List<Material> lista){
        int cont = 0;
        Material mat;
        while(cont<lista.size()){
            mat = lista.get(cont);
            material.addItem(mat.getNombreMaterial());
            cont++;
        }
    }
    
    public void llenarListaMateriales(List<Material> materiales) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt=  null;
        ResultSet rs = null;
        String sql = "SELECT * FROM material";
        Material material;
        try {
            stmt = conex.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                material = new Material(rs.getInt("id_material"),rs.getString("rubro_material"),rs.getString("nombre_material"),
                rs.getString("unidad_material"),rs.getString("sustentabilidad_material"),rs.getString("proveedor_material"),
                rs.getString("transporte_material"),rs.getString("manodeobra_material"), rs.getString("herramientas_material"), rs.getDouble("costo_material"),
                rs.getDouble("costo_transporte"),rs.getDouble("costo_manodeobra"),rs.getDouble("costo_herramientas"),rs.getDouble("costo_total"),0);
                materiales.add(material);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        
    }
    //llenar materiales escogidos en un proyecto
    public void llenarListaEscogido(List<Material> materiales, Proyecto proyecto) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt=  null;
        ResultSet rs = null;
        Material material;
        List<Integer> partes = new ArrayList<>(14);
        int parte,cont=0;
        try {
            stmt = conex.prepareStatement("SELECT * FROM partes WHERE id_partes = ?");
            stmt.setInt(1,proyecto.getIdMateriales());
            rs = stmt.executeQuery();
            if(rs.next()){
                parte = rs.getInt("Zapata");if(!rs.wasNull()){partes.add(0, parte);}else{partes.add(0, null);}
                parte = rs.getInt("MurosDeContención");if(!rs.wasNull()){partes.add(1, parte);}else{partes.add(1, null);}
                parte = rs.getInt("Columnas");if(!rs.wasNull()){partes.add(2, parte);}else{partes.add(2, null);}
                parte = rs.getInt("Vigas");if(!rs.wasNull()){partes.add(3, parte);}else{partes.add(3, null);}
                parte = rs.getInt("Losas");if(!rs.wasNull()){partes.add(4, parte);}else{partes.add(4, null);}
                parte = rs.getInt("Entrepiso");if(!rs.wasNull()){partes.add(5, parte);}else{partes.add(5, null);}
                parte = rs.getInt("EstructuraDeCubierta");if(!rs.wasNull()){partes.add(6, parte);}else{partes.add(6, null);}
                parte = rs.getInt("Cubierta");if(!rs.wasNull()){partes.add(7, parte);}else{partes.add(7, null);}
                parte = rs.getInt("Muros");if(!rs.wasNull()){partes.add(8, parte);}else{partes.add(8, null);}
                parte = rs.getInt("Ventanas");if(!rs.wasNull()){partes.add(9, parte);}else{partes.add(9, null);}
                parte = rs.getInt("Puertas");if(!rs.wasNull()){partes.add(10, parte);}else{partes.add(10, null);}
                parte = rs.getInt("Escalera");if(!rs.wasNull()){partes.add(11, parte);}else{partes.add(11, null);}
                parte = rs.getInt("Rampas");if(!rs.wasNull()){partes.add(12, parte);}else{partes.add(12, null);}
                parte = rs.getInt("Barandas");if(!rs.wasNull()){partes.add(13, parte);}else{partes.add(13, null);}
                parte = rs.getInt("Techos");if(!rs.wasNull()){partes.add(14, parte);}else{partes.add(14, null);}
            }
            while(cont<partes.size()){
                if(partes.get(cont)!=null){
                    stmt = conex.prepareStatement("SELECT * FROM material WHERE id_material = ?");
                    stmt.setInt(1,partes.get(cont));
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        material = new Material(rs.getInt("id_material"),rs.getString("rubro_material"),rs.getString("nombre_material"),
                        rs.getString("unidad_material"),rs.getString("sustentabilidad_material"),rs.getString("proveedor_material"),
                        rs.getString("transporte_material"),rs.getString("manodeobra_material"), rs.getString("herramientas_material"), rs.getDouble("costo_material"),
                        rs.getDouble("costo_transporte"),rs.getDouble("costo_manodeobra"),rs.getDouble("costo_herramientas"),rs.getDouble("costo_total"),0);
                        materiales.add(material);
                    }
                }else{
                    materiales.add(null);
                }
                cont++;  
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        
    }
    
    //guardar materiales
    public void guardarMateriales(Proyecto proyecto,JComboBox material,List<Material> proyec,List<Material> materiales){
        int cont =0;
        Material mat;
        while(cont<materiales.size()){
            mat = materiales.get(cont);
            if(mat.getNombreMaterial()==material.getSelectedItem()){
                proyec.add(mat);
            }
            cont++;
        }
    }
    //llenar tablita
    public DefaultTableModel llenarVistaPrevia(Proyecto proyecto, List<Material> escogido){
        List<String> partes = new ArrayList<>();
        partes.add("Zapata");partes.add("MurosDeContención");partes.add("Columnas");partes.add("Vigas");
        partes.add("Losas");partes.add("Entrepiso");partes.add("EstructuraDeCubierta");partes.add("Cubierta");partes.add("Muros");
        partes.add("Ventanas");partes.add("Puertas");partes.add("Escalera");partes.add("Rampas");partes.add("Barandas");partes.add("Techos");
        String [] columnas = {"PARTE","RUBRO", "NOMBRE MATERIAL", "UNIDAD", "PRECIO MATERIAL", "SUSTENTABILIDAD", "PROVEEDOR", "TRANSPORTE", 
            "PRECIO TRANSPORTE", "MANO DE OBRA", "PRECIO MANO", "HERRAMIENTAS", "COSTO HERRAMIENTAS", "COSTO TOTAL"};
        String [] registros = new String[14];
        DefaultTableModel modelo = new DefaultTableModel(null,columnas);
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int part = 0;
        int cont = 0;
        while(cont<partes.size()){
            if(escogido.get(cont)!=null){
                registros[0] = partes.get(cont);
                registros[1] = escogido.get(cont).getRubro();
                registros[2] = escogido.get(cont).getNombreMaterial();
                registros[3] = escogido.get(cont).getUnidadMaterial();
                registros[4] = String.valueOf(escogido.get(cont).getCostoMaterial());
                registros[5] = escogido.get(cont).getSustentabilidad();
                registros[6] = escogido.get(cont).getProveedor();
                registros[7] = escogido.get(cont).getTransporte();
                registros[8] = String.valueOf(escogido.get(cont).getCostoTransporte());
                registros[9] = escogido.get(cont).getManoDeObra();
                registros[10] = String.valueOf(escogido.get(cont).getCostoMDObra());
                registros[11] = escogido.get(cont).getHerramientas();
                registros[12] = String.valueOf(escogido.get(cont).getCostoHerramientas());
                registros[13] = String.valueOf(escogido.get(cont).getCostoTotalMaterial());
                modelo.addRow(registros);
            }
            cont++;
        }
        return modelo;  
    }
    public DefaultTableModel llenarVistaPrevia(Proyecto proyecto) throws SQLException{
        List<String> partes = new ArrayList<>();
        partes.add("Zapata");partes.add("MurosDeContención");partes.add("Columnas");partes.add("Vigas");
        partes.add("Losas");partes.add("Entrepiso");partes.add("EstructuraDeCubierta");partes.add("Cubierta");partes.add("Muros");
        partes.add("Ventanas");partes.add("Puertas");partes.add("Escalera");partes.add("Rampas");partes.add("Barandas");partes.add("Techos");
        String [] columnas = {"PARTE","RUBRO", "NOMBRE MATERIAL", "UNIDAD", "PRECIO MATERIAL", "SUSTENTABILIDAD", "PROVEEDOR", "TRANSPORTE", "PRECIO TRANSPORTE", "MANO DE OBRA", "PRECIO MANO", "HERRAMIENTAS", "COSTO HERRAMIENTAS", "COSTO TOTAL"};
        String [] registros = new String[14];
        DefaultTableModel modelo = new DefaultTableModel(null,columnas);
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int part = 0;
        int cont = 0;
        try {
            while(cont<partes.size()){
                stmt = conex.prepareStatement("SELECT "+partes.get(cont)+" FROM partes WHERE id_partes = ?");
                stmt.setInt(1, proyecto.getIdMateriales());
                rs = stmt.executeQuery();
                if(rs.next()){
                    part = rs.getInt(partes.get(cont));
                }
                stmt = conex.prepareStatement("SELECT * FROM material WHERE id_material = ?");
                stmt.setInt(1, part);
                rs = stmt.executeQuery();
                if(rs.next()){
                    registros[0] = partes.get(cont);
                    registros[1] = rs.getString("rubro_material");
                    registros[2] = rs.getString("nombre_material");
                    registros[3] = rs.getString("unidad_material");
                    registros[4] = rs.getString("costo_material");
                    registros[5] = rs.getString("sustentabilidad_material");
                    registros[6] = rs.getString("proveedor_material");
                    registros[7] = rs.getString("transporte_material");
                    registros[8] = rs.getString("costo_transporte");
                    registros[9] = rs.getString("manodeobra_material");
                    registros[10] = rs.getString("costo_manodeobra");
                    registros[11] = rs.getString("herramientas_material");
                    registros[12] = rs.getString("costo_herramientas");
                    registros[13] = rs.getString("costo_total");
                    modelo.addRow(registros);
                }
                cont++;
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        return modelo;  
    }
    
    //mostrar el precio del material seleccionado
    public String mostrarPrecio(JComboBox material) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String precio = "0";
        try {
            stmt = conex.prepareStatement("SELECT costo_total FROM material WHERE nombre_material = ?");
            stmt.setString(1, (String) material.getSelectedItem());
            rs = stmt.executeQuery();
            if(rs.next()){
                precio = String.valueOf(rs.getDouble("costo_total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        return precio;  
    }
    //calculo de presupuesto total
    public double calculoPresupuestoTotal(List<Material> material, Double presupuesto){
        int cont=0;
        while(cont<material.size()){
            Material mat = material.get(cont);
            if(mat!=null){
                presupuesto = presupuesto +mat.getCostoTotalMaterial();
            }
            cont++;
        }
        BigDecimal numero = new BigDecimal(presupuesto).setScale(2, RoundingMode.HALF_UP);
        presupuesto = numero.doubleValue();
        return presupuesto;
    }
    
    //**************************VER PROYECTO**************************
    public DefaultTableModel llenarVerProyecto(Usuario usuario){
        String [] columnas = {"ID","NOMBRE"};
        DefaultTableModel modelo = new DefaultTableModel(null,columnas);
        String [] registros = new String[2];
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conex.prepareStatement("SELECT id_proyecto, nombre FROM proyecto WHERE usuario = ?");
            stmt.setInt(1, usuario.getId_usuario());
            rs = stmt.executeQuery();
            while(rs.next()){
                registros [0] = String.valueOf(rs.getInt("id_proyecto"));
                registros [1] = rs.getString("nombre");
                modelo.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modelo;
    }
    public int validarID(Usuario usuario, Proyecto proyecto) throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt= null;
        ResultSet rs = null;
        int val = 0;
        boolean boleano = false;
        String patron = "^\\d+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(idProyecto.getText());
        try{
            if(!matcher.matches()){
                val = 1; // si no cumple con el patron de solo poseer numeros
            }else{
                stmt = conex.createStatement();
                rs = stmt.executeQuery("SELECT id_proyecto FROM proyecto WHERE usuario = "+usuario.getId_usuario());
                while(rs.next()){
                    if(idProyecto.getText().equals(String.valueOf(rs.getInt("id_proyecto")))){
                        boleano = true;
                    }
                }
                if(boleano){
                    stmt = conex.createStatement();
                    rs = stmt.executeQuery("SELECT * FROM proyecto WHERE id_proyecto ="+idProyecto.getText());
                    if(rs.next()){
                        proyecto.setIdProyecto(rs.getInt("id_proyecto"));
                        proyecto.setIdUsuario(rs.getInt("usuario"));
                        proyecto.setNombreProyecto(rs.getString("nombre"));
                        proyecto.setPresupuesto(rs.getDouble("presupuesto"));
                        proyecto.setPresupuestoTotal(rs.getDouble("presupuestoTotal"));
                        proyecto.setFechaDeCreacion(rs.getString("fecha"));
                        proyecto.setSustentabilidad(rs.getString("sustentabilidad"));
                        proyecto.setPublico(rs.getString("publico"));
                        proyecto.setActividad(rs.getString("actividad"));
                        proyecto.setResumen(rs.getString("resumen"));
                        proyecto.setIdMateriales(rs.getInt("materiales"));
                    }

                }else{
                    val = 2; //si no existe
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            conex.close();
            con.desconectar();
        }
        
        return val;
    }
    
    //**************************Modificar proyecto**************************
    public void modificarProyecto(Proyecto proyecto, List<Material> material){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = conex.prepareStatement("UPDATE proyecto SET nombre=?,presupuesto=?,presupuestoTotal=?,sustentabilidad=?,publico=?,actividad=?,resumen=? WHERE id_proyecto=?");
            stmt.setString(1, proyecto.getNombreProyecto());
            stmt.setDouble(2, proyecto.getPresupuesto());
            stmt.setDouble(3, proyecto.getPresupuestoTotal());
            stmt.setString(4, proyecto.getSustentabilidad());
            stmt.setString(5, proyecto.getPublico());
            stmt.setString(6, proyecto.getActividad());
            stmt.setString(7, proyecto.getResumen());
            stmt.setInt(8,proyecto.getIdProyecto());
            stmt.executeUpdate();
            stmt = conex.prepareStatement("UPDATE partes SET Zapata=?,MurosDeContención=?,Columnas=?,Vigas=?,Losas=?,Entrepiso=?,EstructuraDeCubierta=?,Cubierta=?,Muros=?,Ventanas=?,Puertas=?,Escalera=?,Rampas=?,Barandas=?,Techos=? WHERE id_partes = ?");
            if(material.get(0)!=null){
                stmt.setInt(1, material.get(0).getId_material());
            }else{
                stmt.setNull(1,java.sql.Types.INTEGER);
            }
            if(material.get(1)!=null){
                stmt.setInt(2, material.get(1).getId_material());
            }else{
                stmt.setNull(2, java.sql.Types.INTEGER);
            }
            if(material.get(2)!=null){
                stmt.setInt(3, material.get(2).getId_material());
            }else{
                stmt.setNull(3, java.sql.Types.INTEGER);
            }
            if(material.get(3)!=null){
                stmt.setInt(4, material.get(3).getId_material());
            }else{
                stmt.setNull(4, java.sql.Types.INTEGER);
            }
            if(material.get(4)!=null){
                stmt.setInt(5, material.get(4).getId_material());
            }else{
                stmt.setNull(5, java.sql.Types.INTEGER);
            }
            if(material.get(5)!=null){
                stmt.setInt(6, material.get(5).getId_material());
            }else{
                stmt.setNull(6, java.sql.Types.INTEGER);
            }
            if(material.get(6)!=null){
                stmt.setInt(7, material.get(6).getId_material());
            }else{
                stmt.setNull(7, java.sql.Types.INTEGER);
            }
            if(material.get(7)!=null){
                stmt.setInt(8, material.get(7).getId_material());
            }else{
                stmt.setNull(8, java.sql.Types.INTEGER);
            }
            if(material.get(8)!=null){
                stmt.setInt(9, material.get(8).getId_material());
            }else{
                stmt.setNull(9, java.sql.Types.INTEGER);
            }
            if(material.get(9)!=null){
                stmt.setInt(10, material.get(9).getId_material());
            }else{
                stmt.setNull(10, java.sql.Types.INTEGER);
            }
            if(material.get(10)!=null){
                stmt.setInt(11, material.get(10).getId_material());
            }else{
                stmt.setNull(11, java.sql.Types.INTEGER);
            }
            if(material.get(11)!=null){
                stmt.setInt(12, material.get(11).getId_material());
            }else{
                stmt.setNull(12, java.sql.Types.INTEGER);
            }
            if(material.get(12)!=null){
                stmt.setInt(13, material.get(12).getId_material());
            }else{
                stmt.setNull(13, java.sql.Types.INTEGER);
            }
            if(material.get(13)!=null){
                stmt.setInt(14, material.get(13).getId_material());
            }else{
                stmt.setNull(14, java.sql.Types.INTEGER);
            }
            if(material.get(14)!=null){
                stmt.setInt(15, material.get(14).getId_material());
            }else{
                stmt.setNull(15, java.sql.Types.INTEGER);
            }
            stmt.setInt(16, proyecto.getIdMateriales());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
               if (rs != null) rs.close();
               if (stmt != null) stmt.close(); 
                conex.close();
                con.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
    }
    
    //**************************ELIMINAR PROYECTO**************************
    public int eliminarProyecto() throws SQLException{
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        PreparedStatement st = null;
        Statement stmt= null;
        ResultSet rs = null;
        boolean boleano = false;
        int val = 0, idInt, idMaterial = 0;
        String patron = "^\\d+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(idProyecto.getText());
        String sql1 = "DELETE FROM partes WHERE id_partes = ?";
        String sql2 = "DELETE FROM proyecto WHERE id_proyecto = ?";
        String sql3 = "SELECT id_proyecto FROM proyecto";
        String sql4 = "SELECT materiales FROM proyecto WHERE id_proyecto = ?";
        try {
            if(!matcher.matches()){
                val = 1; // si no cumple con el patron de solo poseer numeros
            }else{
                idInt = Integer.parseInt(idProyecto.getText());
                stmt = conex.createStatement();
                rs = stmt.executeQuery(sql3);
                while(rs.next()){
                    if(idInt == rs.getInt("id_proyecto")){
                        boleano = true;
                    }
                }
                if(boleano){
                    st = conex.prepareStatement(sql4);
                    st.setInt(1,idInt);
                    rs = st.executeQuery();
                    if(rs.next()){
                        idMaterial = rs.getInt("materiales");
                    }
                    //aqui eliminamos
                    st = conex.prepareStatement(sql1);
                    st.setInt(1, idMaterial);
                    st.executeUpdate();
                    st = conex.prepareStatement(sql2);
                    st.setInt(1, idInt);
                    st.executeUpdate();
                }else{
                    val = 2; //si ese id no existe
                }   
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProyec.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(stmt!=null) stmt.close();
            if(rs!=null) rs.close();
            if(st!=null) st.close();
            conex.close();
            con.desconectar();
        }
        return val;
    }
    
}
