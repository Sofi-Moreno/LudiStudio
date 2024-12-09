/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ControllerProyec;
import Model.Material;
import Model.Proyecto;
import Model.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Riarb
 */
public class Resumen extends javax.swing.JPanel {
    ControllerProyec controller;
    Usuario usuarioActual;
    Proyecto proyecto;
    double presupuestoTotal;
    List<Material> proyec;
    String operacion;
    public Resumen(Proyecto proyecto,java.util.List<Material> proyec, Usuario usuario,String operacion) {
        initComponents();
        controller=new ControllerProyec(this);
        usuarioActual = usuario;
        this.proyecto = proyecto;
        this.proyec = proyec;
        this.operacion =operacion;
        if(operacion == "Modificar"){
            textArea1.setText(proyecto.getResumen());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentResumen = new javax.swing.JPanel();
        ingresarButtom = new javax.swing.JPanel();
        ingresarLabel = new javax.swing.JLabel();
        panelTitle = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentResumen.setBackground(new java.awt.Color(0, 153, 153));
        contentResumen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarButtom.setBackground(new java.awt.Color(0, 102, 102));
        ingresarButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarButtomMouseExited(evt);
            }
        });

        ingresarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        ingresarLabel.setForeground(new java.awt.Color(255, 255, 255));
        ingresarLabel.setText("Guardar");

        javax.swing.GroupLayout ingresarButtomLayout = new javax.swing.GroupLayout(ingresarButtom);
        ingresarButtom.setLayout(ingresarButtomLayout);
        ingresarButtomLayout.setHorizontalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarButtomLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ingresarLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ingresarButtomLayout.setVerticalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarButtomLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(ingresarLabel)
                .addGap(18, 18, 18))
        );

        contentResumen.add(ingresarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        panelTitle.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("CREAR RESUMEN DEL KIOSCO");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(tituloLabel)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(tituloLabel)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        contentResumen.add(panelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 630, -1));
        contentResumen.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 540, 190));

        add(contentResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 527));
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseExited
        ingresarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_ingresarButtomMouseExited

    private void ingresarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseEntered
        ingresarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_ingresarButtomMouseEntered

    private void ingresarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseClicked
        if(textArea1.getText().length()<1){
            JOptionPane.showMessageDialog(null, "Debes escribir un resumen de tu proyecto.");
        }else if(textArea1.getText().length()>300){
            JOptionPane.showMessageDialog(null, "Debes escribir un resumen de 1-300 caracteres.");
        }else{
            proyecto.setResumen(textArea1.getText());
            mostrarEscogido p = new mostrarEscogido(proyecto,proyec,usuarioActual,operacion);
            p.setSize(613,530);
            p.setLocation(0,0);
            contentResumen.removeAll();
            contentResumen.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
            contentResumen.revalidate();
            contentResumen.repaint(); 
        }
        
    }//GEN-LAST:event_ingresarButtomMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentResumen;
    private javax.swing.JPanel ingresarButtom;
    private javax.swing.JLabel ingresarLabel;
    private javax.swing.JPanel panelTitle;
    private java.awt.TextArea textArea1;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
