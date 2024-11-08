/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ControllerProyec;
import Model.Proyecto;
import Model.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Riarb
 */
public class SelectorDePartes extends javax.swing.JPanel {
    ControllerProyec controller;
    Usuario usuarioActual;
    Proyecto proyecto;
    /**
     * Creates new form SelectorDePartes
     * @param user
     */
    public SelectorDePartes(Usuario user) {
        initComponents();
        usuarioActual = user;
        controller = new ControllerProyec(nombreTxt, presupuestTxt, sustentabilidadBox, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentSelector = new javax.swing.JPanel();
        ingresarButtom = new javax.swing.JPanel();
        ingresarLabel = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        presupuestoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelTitle = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        sustentabilidadBox = new javax.swing.JComboBox<>();
        sustentabilidadLabel = new javax.swing.JLabel();
        presupuestTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nombreLabel = new javax.swing.JLabel();

        contentSelector.setBackground(new java.awt.Color(0, 153, 153));

        ingresarButtom.setBackground(new java.awt.Color(0, 102, 102));
        ingresarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarButtomMouseClicked(evt);
            }
        });

        ingresarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        ingresarLabel.setForeground(new java.awt.Color(255, 255, 255));
        ingresarLabel.setText("Ingresar");

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

        nombreTxt.setBackground(new java.awt.Color(0, 153, 153));
        nombreTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreTxt.setText("Ingrese el nombre del proyecto");
        nombreTxt.setToolTipText("");
        nombreTxt.setBorder(null);
        nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxtMousePressed(evt);
            }
        });
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        presupuestoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        presupuestoLabel.setForeground(new java.awt.Color(255, 255, 255));
        presupuestoLabel.setText("Presupuesto");
        presupuestoLabel.setToolTipText("");

        panelTitle.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("CREAR NUEVO PROYECTO");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(tituloLabel)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(37, 37, 37))
        );

        sustentabilidadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sustentabilidadLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        sustentabilidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        sustentabilidadLabel.setText("Sustentabilidad");
        sustentabilidadLabel.setToolTipText("");

        presupuestTxt.setBackground(new java.awt.Color(0, 153, 153));
        presupuestTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        presupuestTxt.setForeground(new java.awt.Color(204, 204, 204));
        presupuestTxt.setText("Ingrese el presupuesto del proyecto");
        presupuestTxt.setToolTipText("");
        presupuestTxt.setBorder(null);
        presupuestTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                presupuestTxtMousePressed(evt);
            }
        });
        presupuestTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presupuestTxtActionPerformed(evt);
            }
        });

        nombreLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre ");
        nombreLabel.setToolTipText("");

        javax.swing.GroupLayout contentSelectorLayout = new javax.swing.GroupLayout(contentSelector);
        contentSelector.setLayout(contentSelectorLayout);
        contentSelectorLayout.setHorizontalGroup(
            contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentSelectorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(contentSelectorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addGroup(contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombreTxt)
                        .addComponent(presupuestoLabel)
                        .addComponent(jSeparator1)
                        .addComponent(presupuestTxt)
                        .addComponent(jSeparator2))
                    .addGroup(contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sustentabilidadBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sustentabilidadLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentSelectorLayout.setVerticalGroup(
            contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentSelectorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presupuestoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(presupuestTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sustentabilidadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sustentabilidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(ingresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseClicked
        proyecto = new Proyecto();
        proyecto.setIdUsuario(usuarioActual.getId_usuario());
        if(controller.validarNombre(proyecto)){
            JOptionPane.showMessageDialog(null, "El nombre ingresado no tiene el tamaño correcto (1-25)");
        }else{
            if(controller.validarPresupuesto(proyecto)){
                JOptionPane.showMessageDialog(null, "El presupuesto no cuenta con el patron de solo contener nuemeros y punto(.), para marcar el decimal.");
            }else{
                try {
                    if(controller.guardarInformacion(proyecto)){
                        fundamentosYcimentacion p3 = new fundamentosYcimentacion(proyecto,usuarioActual);
                        p3.setSize(613,530);
                        p3.setLocation(0,0);

                        contentSelector.removeAll();
                        contentSelector.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
                        contentSelector.revalidate();
                        contentSelector.repaint();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SelectorDePartes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_ingresarButtomMouseClicked

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        if (nombreTxt.getText().equals("Ingrese el nombre del proyecto")){
            nombreTxt.setText("");
            nombreTxt.setForeground(Color.black);
        }
        if (presupuestTxt.getText().isEmpty()){
            presupuestTxt.setText("Ingrese el presupuesto del proyecto");
            presupuestTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_nombreTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void presupuestTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presupuestTxtMousePressed
        if(presupuestTxt.getText().equals("Ingrese el presupuesto del proyecto")){
            presupuestTxt.setText("");
            presupuestTxt.setForeground(Color.black);
        }
        if (nombreTxt.getText().isEmpty()){
            nombreTxt.setText("Ingrese el nombre del proyecto");
            nombreTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_presupuestTxtMousePressed

    private void presupuestTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presupuestTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presupuestTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentSelector;
    private javax.swing.JPanel ingresarButtom;
    private javax.swing.JLabel ingresarLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JTextField presupuestTxt;
    private javax.swing.JLabel presupuestoLabel;
    private javax.swing.JComboBox<String> sustentabilidadBox;
    private javax.swing.JLabel sustentabilidadLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
