/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Material;
import Model.Proyecto;
import Model.Usuario;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Sofia Moreno
 */
public class ControllerPDF {
    //atributos imprimir proyecto
    Usuario usuario;
    Proyecto proyecto;
    List<Material> materiales;
    String nombrePDF;
    
    //Controlador imprimir Proyecto

    public ControllerPDF(Usuario usuario,Proyecto proyecto, List<Material> materiales, String nombrePDF) {
        this.usuario = usuario;
        this.proyecto = proyecto;
        this.materiales = materiales;
        this.nombrePDF = nombrePDF;
    }

    
    
    public void imprimirProyecto(){
            
        try {
            //abre documento y lo crea
            Rectangle pagesize = new Rectangle(PageSize.A4.rotate()); 
            Document document = new Document(pagesize);
            String dest = nombrePDF;
            PdfWriter.getInstance(document, new FileOutputStream("Pdfs\\"+dest));
            document.open();
            //pone margen
            float margin = 1f * 72 / 2.54f;
            document.setMargins(margin, margin, margin, margin);
            //coloca la imagen
            String im = "src\\imagenes\\appLogo-removebg-preview.png";
            Image img = Image.getInstance(im);
            img.setAbsolutePosition(margin, document.getPageSize().getHeight() - margin - img.getScaledHeight());
            document.add(img);
            //coloca el titulo
            BaseColor azulOscuro = new BaseColor(0, 0, 139);
            BaseColor negro = new BaseColor(0, 0, 0);
            com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.HELVETICA, 35, Font.BOLD, azulOscuro);
            Paragraph title = new Paragraph("Ludi Studio", font);
            title.setAlignment(Paragraph.ALIGN_RIGHT); 
            document.add(title);
            font = FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLD, negro);
            Paragraph title2 = new Paragraph("Reporte General de Proyecto", font);
            title2.setAlignment(Paragraph.ALIGN_CENTER); 
            title2.setLeading(35f);
            document.add(title2);
            //titulito
            font = FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, negro);
            Paragraph title3 = new Paragraph("Datos del Proyecto:", font);
            title3.setLeading(35f);
            document.add(title3);
            //datos del proyecto
            Phrase datos= new Phrase();
            datos.add(new Phrase("Identificador: "+proyecto.getIdProyecto()+".")); 
            datos.add(new Phrase("\n"));
            datos.add(new Phrase("Autor: "+usuario.getNombreUsuario()+" "+usuario.getApellidoUsuario()+".")); 
            datos.add(new Phrase("\n"));
            datos.add(new Phrase("Nombre: "+proyecto.getNombreProyecto()+".")); 
            datos.add(new Phrase("\n"));
            datos.add(new Phrase("Fecha de Creación: "+proyecto.getFechaDeCreacion()+".")); 
            datos.add(new Phrase("\n"));
            datos.add(new Phrase("Sustentabilidad: "+proyecto.getSustentabilidad()+".")); 
            datos.add(new Phrase("\n"));
            datos.add(new Phrase("Publico: "+proyecto.getPublico()+".")); 
            datos.add(new Phrase("\n"));
            datos.add(new Phrase("Actividad: "+proyecto.getActividad()+".")); 
            datos.add(new Phrase("\n"));
            if(usuario.getMonedaUsuario()=="Dolares ($)"){
                datos.add(new Phrase("Presupuesto Establecido: "+proyecto.getPresupuesto()+" $.")); 
                datos.add(new Phrase("\n"));
                datos.add(new Phrase("Presupuesto Total: "+proyecto.getPresupuestoTotal()+" $.")); 
                datos.add(new Phrase("\n"));
            }else if(usuario.getMonedaUsuario()=="Bolivares (Bs)"){
                datos.add(new Phrase("Presupuesto Establecido: "+proyecto.getPresupuesto()+" Bs.")); 
                datos.add(new Phrase("\n"));
                datos.add(new Phrase("Presupuesto Total: "+proyecto.getPresupuestoTotal()+" Bs.")); 
                datos.add(new Phrase("\n"));
            }
            datos.setLeading(20f);
            document.add(datos);
            
            //resumen del proyecto
            font = FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, negro);
            Paragraph title4 = new Paragraph("Resumen del proyecto:", font);
            title4.setLeading(35f);
            document.add(title4);
            if(proyecto.getResumen().length()>0){
                String res = proyecto.getResumen();
                Paragraph resumen = new Paragraph(res);
                
                resumen.setLeading(20f);
                document.add(resumen);
            }else{
                
                Paragraph resumen = new Paragraph("El proyecto no posee resumen.");
                resumen.setLeading(20f);
                document.add(resumen);
            }
            //tabla de materiales
            document.newPage();
            img = Image.getInstance(im);
            img.setAbsolutePosition(margin, document.getPageSize().getHeight() - margin - img.getScaledHeight());
            document.add(img);
            //coloca el titulo
            font = FontFactory.getFont(FontFactory.HELVETICA, 35, Font.BOLD, azulOscuro);
            title = new Paragraph("Ludi Studio", font);
            title.setAlignment(Paragraph.ALIGN_RIGHT); 
            document.add(title);
            font = FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, negro);
            title4 = new Paragraph("\n", font);
            title4.setLeading(35f);
            title4.add(new Phrase("Listado de Materiales:"));
            title4.add(new Phrase("\n"));
            title4.add(new Phrase("\n"));
            document.add(title4);
            
            List<String> partes = new ArrayList<>();
            partes.add("Zapata");partes.add("MurosDeContención");partes.add("Columnas");partes.add("Vigas");
            partes.add("Losas");partes.add("Entrepiso");partes.add("EstructuraDeCubierta");partes.add("Cubierta");partes.add("Muros");
            partes.add("Ventanas");partes.add("Puertas");partes.add("Escalera");partes.add("Rampas");partes.add("Barandas");partes.add("Techos");
            String [] columnas = {"PARTE","RUBRO", "NOMBRE", "UNIDAD", "PRECIO", "SUSTENTABILIDAD", "PROVEEDOR", 
                "TRANSPORTE", "PRECIO TRANSPORTE", "MANO DE OBRA", "PRECIO MANO", "HERRAMIENTAS", "COSTO HERRAMIENTAS", 
                "COSTO TOTAL"};
            PdfPTable table = new PdfPTable(14);
            table.setWidthPercentage(100);
            float[] columnWidths = {3f, 3f, 3f, 3f, 3f, 3f, 3f, 3f, 3f, 3f, 3f, 3f, 3f, 3f}; 
            table.setWidths(columnWidths);
            font = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.CENTER_BASELINE, BaseColor.BLACK);
            int cont =0;
            while(cont<columnas.length){
                PdfPCell cell = new PdfPCell(new Phrase(columnas[cont], font));
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY); 
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(cell);
                cont++;
            }
            cont = 0;
            com.itextpdf.text.Font font1 = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.BOLD, BaseColor.BLACK);
            com.itextpdf.text.Font font2 = FontFactory.getFont(FontFactory.HELVETICA, 8, BaseColor.BLACK);
            for (Material mat : materiales) {
                if(mat!=null){
                    table.addCell(new Phrase(partes.get(cont), font1));
                    table.addCell(new Phrase(mat.getRubro(),font2));
                    table.addCell(new Phrase(mat.getNombreMaterial(),font2));
                    table.addCell(new Phrase(mat.getUnidadMaterial(),font2));
                    table.addCell(new Phrase(String.valueOf(mat.getCostoMaterial()),font2));
                    table.addCell(new Phrase(mat.getSustentabilidad(),font2));
                    table.addCell(new Phrase(mat.getProveedor(),font2));
                    table.addCell(new Phrase(mat.getTransporte(),font2));
                    table.addCell(new Phrase(String.valueOf(mat.getCostoTransporte()),font2));
                    table.addCell(new Phrase(mat.getManoDeObra(),font2));
                    table.addCell(new Phrase(String.valueOf(mat.getCostoMDObra()),font2));
                    table.addCell(new Phrase(mat.getHerramientas(),font2));
                    table.addCell(new Phrase(String.valueOf(mat.getCostoHerramientas()),font2));
                    table.addCell(new Phrase(String.valueOf(mat.getCostoTotalMaterial()),font2));
                }
                cont++;
            }
            
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            document.add(table);
            
            document.close();
            
            JOptionPane.showMessageDialog(null, "PDF creado con exito.");
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(ControllerPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControllerPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
