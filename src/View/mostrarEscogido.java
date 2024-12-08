/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ControllerProyec;
import Model.Material;
import Model.Proyecto;
import Model.Usuario;
import java.awt.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.util.List;



/**
 *
 * @author Riarb
 */
public class mostrarEscogido extends javax.swing.JPanel {
    ControllerProyec controller;
    Usuario usuarioActual;
    Proyecto proyecto;
    double presupuestoTotal;
    List<Material> proyec;
    String operacion;
    /**
     * Creates new form mostrarEscogido
     */
    public mostrarEscogido(Proyecto proyecto,java.util.List<Material> proyec, Usuario usuario,String operacion) {
        initComponents();
        controller=new ControllerProyec(this);
        usuarioActual = usuario;
        this.proyecto = proyecto;
        this.proyec = proyec;
        this.operacion =operacion;
        nombreDato.setText(proyecto.getNombreProyecto());
        presupuestoDato.setText(String.valueOf(proyecto.getPresupuesto()));
        autorDato.setText(usuario.getNombreUsuario()+" "+usuario.getApellidoUsuario()+" ("+usuario.getUsuario()+").");
        presupuestoTotal = controller.calculoPresupuestoTotal(proyec, presupuestoTotal);
        if("Dolares ($)".equals(usuario.getMonedaUsuario())){
            costoDato.setText(String.valueOf(presupuestoTotal)+" $");
        }else if("Bolivares (Bs)".equals(usuario.getMonedaUsuario())){
            costoDato.setText(String.valueOf(presupuestoTotal)+" Bs");
        }
        proyecto.setPresupuestoTotal(presupuestoTotal);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        contentVista = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mostrarDatosButtom = new javax.swing.JPanel();
        entrarLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        autorDato = new javax.swing.JLabel();
        nombreDato = new javax.swing.JLabel();
        costoDato = new javax.swing.JLabel();
        presupuestoDato = new javax.swing.JLabel();
        entrarButtom2 = new javax.swing.JPanel();
        entrarLabel2 = new javax.swing.JLabel();

        contentVista.setBackground(new java.awt.Color(0, 153, 153));
        contentVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("VISTA PREVIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tituloLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        contentVista.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 613, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del proyecto:");
        contentVista.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Autor: ");
        contentVista.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Costo total: ");
        contentVista.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Presupuesto: ");
        contentVista.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        mostrarDatosButtom.setBackground(new java.awt.Color(0, 102, 102));
        mostrarDatosButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarDatosButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarDatosButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarDatosButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarDatosButtomMouseExited(evt);
            }
        });

        entrarLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        entrarLabel1.setForeground(new java.awt.Color(255, 255, 255));
        entrarLabel1.setText("MOSTRAR DATOS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo blanco.png"))); // NOI18N

        javax.swing.GroupLayout mostrarDatosButtomLayout = new javax.swing.GroupLayout(mostrarDatosButtom);
        mostrarDatosButtom.setLayout(mostrarDatosButtomLayout);
        mostrarDatosButtomLayout.setHorizontalGroup(
            mostrarDatosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarDatosButtomLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(entrarLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(mostrarDatosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrarDatosButtomLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mostrarDatosButtomLayout.setVerticalGroup(
            mostrarDatosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarDatosButtomLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(entrarLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(mostrarDatosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mostrarDatosButtomLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        contentVista.add(mostrarDatosButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 230, 230));

        String aux;
        aux="Pepe";
        autorDato.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        autorDato.setForeground(new java.awt.Color(242, 242, 242));
        autorDato.setText(aux);
        contentVista.add(autorDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 30));

        nombreDato.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombreDato.setForeground(new java.awt.Color(242, 242, 242));
        nombreDato.setText("Kiosco 69");
        contentVista.add(nombreDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 30));

        costoDato.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoDato.setForeground(new java.awt.Color(242, 242, 242));
        costoDato.setText("4500$");
        contentVista.add(costoDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 30));

        presupuestoDato.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        presupuestoDato.setForeground(new java.awt.Color(242, 242, 242));
        presupuestoDato.setText("5000$");
        contentVista.add(presupuestoDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 30));

        entrarButtom2.setBackground(new java.awt.Color(0, 102, 102));
        entrarButtom2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarButtom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarButtom2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarButtom2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarButtom2MouseExited(evt);
            }
        });

        entrarLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        entrarLabel2.setForeground(new java.awt.Color(255, 255, 255));
        entrarLabel2.setText("GUARDAR");

        javax.swing.GroupLayout entrarButtom2Layout = new javax.swing.GroupLayout(entrarButtom2);
        entrarButtom2.setLayout(entrarButtom2Layout);
        entrarButtom2Layout.setHorizontalGroup(
            entrarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entrarButtom2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(entrarLabel2)
                .addGap(50, 50, 50))
        );
        entrarButtom2Layout.setVerticalGroup(
            entrarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entrarButtom2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(entrarLabel2)
                .addContainerGap())
        );

        contentVista.add(entrarButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentVista, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatosButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarDatosButtomMouseClicked
        vistaPrevia vista;
        vista = new vistaPrevia(proyecto,proyec);
        vista.setVisible(true);
    }//GEN-LAST:event_mostrarDatosButtomMouseClicked

    private void mostrarDatosButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarDatosButtomMouseEntered
        mostrarDatosButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_mostrarDatosButtomMouseEntered

    private void mostrarDatosButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarDatosButtomMouseExited
        mostrarDatosButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_mostrarDatosButtomMouseExited

    private void entrarButtom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtom2MouseClicked
        try {
            if(operacion == "Crear"){
                controller.guardarInformacion(proyecto, proyec);
                JOptionPane.showMessageDialog(null, "El proyecto ha sido guardado con exito");
            }else if(operacion == "Modificar"){
               controller.modificarProyecto(proyecto, proyec);
               JOptionPane.showMessageDialog(null, "El proyecto ha sido modificado con exito");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(mostrarEscogido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "El proyecto no ha sido guardado");
        }
        //volver a main menu
    }//GEN-LAST:event_entrarButtom2MouseClicked

    private void entrarButtom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtom2MouseEntered
        entrarButtom2.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_entrarButtom2MouseEntered

    private void entrarButtom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtom2MouseExited
        entrarButtom2.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_entrarButtom2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autorDato;
    private javax.swing.JPanel contentVista;
    private javax.swing.JLabel costoDato;
    private javax.swing.JPanel entrarButtom2;
    private javax.swing.JLabel entrarLabel1;
    private javax.swing.JLabel entrarLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPanel mostrarDatosButtom;
    private javax.swing.JLabel nombreDato;
    private javax.swing.JLabel presupuestoDato;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
