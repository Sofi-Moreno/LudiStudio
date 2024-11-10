/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Usuario;
import java.awt.Color;

/**
 *
 * @author aquil
 */
public class gestionarMateriales extends javax.swing.JPanel {
    Usuario usuarioActual;
    /**
     * Creates new form gestionarMateriales
     */
    public gestionarMateriales(Usuario user) {
        initComponents();
        usuarioActual = user;
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
        eliminarMaterialesButtom = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        verMaterialesButtom = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        crearMaterialesButtom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        modificarMaterialesButtom = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        contentSelector.setBackground(new java.awt.Color(0, 204, 204));

        eliminarMaterialesButtom.setBackground(new java.awt.Color(0, 102, 102));
        eliminarMaterialesButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarMaterialesButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMaterialesButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMaterialesButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMaterialesButtomMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar Materiales");

        javax.swing.GroupLayout eliminarMaterialesButtomLayout = new javax.swing.GroupLayout(eliminarMaterialesButtom);
        eliminarMaterialesButtom.setLayout(eliminarMaterialesButtomLayout);
        eliminarMaterialesButtomLayout.setHorizontalGroup(
            eliminarMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarMaterialesButtomLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        eliminarMaterialesButtomLayout.setVerticalGroup(
            eliminarMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarMaterialesButtomLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        verMaterialesButtom.setBackground(new java.awt.Color(0, 102, 102));
        verMaterialesButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verMaterialesButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMaterialesButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verMaterialesButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verMaterialesButtomMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ver Materiales");

        javax.swing.GroupLayout verMaterialesButtomLayout = new javax.swing.GroupLayout(verMaterialesButtom);
        verMaterialesButtom.setLayout(verMaterialesButtomLayout);
        verMaterialesButtomLayout.setHorizontalGroup(
            verMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verMaterialesButtomLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(54, 54, 54))
        );
        verMaterialesButtomLayout.setVerticalGroup(
            verMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verMaterialesButtomLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        crearMaterialesButtom.setBackground(new java.awt.Color(0, 102, 102));
        crearMaterialesButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearMaterialesButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMaterialesButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearMaterialesButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearMaterialesButtomMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Materiales");

        javax.swing.GroupLayout crearMaterialesButtomLayout = new javax.swing.GroupLayout(crearMaterialesButtom);
        crearMaterialesButtom.setLayout(crearMaterialesButtomLayout);
        crearMaterialesButtomLayout.setHorizontalGroup(
            crearMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearMaterialesButtomLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        crearMaterialesButtomLayout.setVerticalGroup(
            crearMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearMaterialesButtomLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        modificarMaterialesButtom.setBackground(new java.awt.Color(0, 102, 102));
        modificarMaterialesButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarMaterialesButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMaterialesButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarMaterialesButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarMaterialesButtomMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificar Materiales");

        javax.swing.GroupLayout modificarMaterialesButtomLayout = new javax.swing.GroupLayout(modificarMaterialesButtom);
        modificarMaterialesButtom.setLayout(modificarMaterialesButtomLayout);
        modificarMaterialesButtomLayout.setHorizontalGroup(
            modificarMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarMaterialesButtomLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modificarMaterialesButtomLayout.setVerticalGroup(
            modificarMaterialesButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarMaterialesButtomLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentSelectorLayout = new javax.swing.GroupLayout(contentSelector);
        contentSelector.setLayout(contentSelectorLayout);
        contentSelectorLayout.setHorizontalGroup(
            contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentSelectorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearMaterialesButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarMaterialesButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarMaterialesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verMaterialesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        contentSelectorLayout.setVerticalGroup(
            contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentSelectorLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verMaterialesButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearMaterialesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarMaterialesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarMaterialesButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
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

    private void crearMaterialesButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMaterialesButtomMouseEntered
        crearMaterialesButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_crearMaterialesButtomMouseEntered

    private void crearMaterialesButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMaterialesButtomMouseExited
        crearMaterialesButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_crearMaterialesButtomMouseExited

    private void verMaterialesButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMaterialesButtomMouseEntered
        verMaterialesButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_verMaterialesButtomMouseEntered

    private void verMaterialesButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMaterialesButtomMouseExited
        verMaterialesButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_verMaterialesButtomMouseExited

    private void modificarMaterialesButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMaterialesButtomMouseEntered
        modificarMaterialesButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_modificarMaterialesButtomMouseEntered

    private void modificarMaterialesButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMaterialesButtomMouseExited
        modificarMaterialesButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_modificarMaterialesButtomMouseExited

    private void eliminarMaterialesButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMaterialesButtomMouseEntered
        eliminarMaterialesButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_eliminarMaterialesButtomMouseEntered

    private void eliminarMaterialesButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMaterialesButtomMouseExited
        eliminarMaterialesButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_eliminarMaterialesButtomMouseExited

    private void crearMaterialesButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMaterialesButtomMouseClicked
        crearMateriales p3 = new crearMateriales(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        contentSelector.removeAll();
        contentSelector.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentSelector.revalidate();
        contentSelector.repaint();
    }//GEN-LAST:event_crearMaterialesButtomMouseClicked

    private void eliminarMaterialesButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMaterialesButtomMouseClicked
        eliminarMateriales p3 = new eliminarMateriales(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        contentSelector.removeAll();
        contentSelector.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentSelector.revalidate();
        contentSelector.repaint();
    }//GEN-LAST:event_eliminarMaterialesButtomMouseClicked

    private void modificarMaterialesButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMaterialesButtomMouseClicked
        // TODO add your handling code here:
        ingresarMaterialMod p3 = new ingresarMaterialMod(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        contentSelector.removeAll();
        contentSelector.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentSelector.revalidate();
        contentSelector.repaint();
    }//GEN-LAST:event_modificarMaterialesButtomMouseClicked

    private void verMaterialesButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMaterialesButtomMouseClicked
        // TODO add your handling code here:
        buscarMaterial vista = new buscarMaterial();
        vista.setVisible(true);
    }//GEN-LAST:event_verMaterialesButtomMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentSelector;
    private javax.swing.JPanel crearMaterialesButtom;
    private javax.swing.JPanel eliminarMaterialesButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel modificarMaterialesButtom;
    private javax.swing.JPanel verMaterialesButtom;
    // End of variables declaration//GEN-END:variables
}
