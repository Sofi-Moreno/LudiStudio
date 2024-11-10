/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Riarb
 */
public class eliminarMateriales extends javax.swing.JPanel {

    /**
     * Creates new form eliminarMateriales
     */
    public eliminarMateriales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentEliminarMateriales = new javax.swing.JPanel();
        nombreElimTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        usuarioLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        entrarButtom = new javax.swing.JPanel();
        entrarLabel = new javax.swing.JLabel();

        contentEliminarMateriales.setBackground(new java.awt.Color(0, 153, 153));

        nombreElimTxt.setBackground(new java.awt.Color(0, 153, 153));
        nombreElimTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        nombreElimTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreElimTxt.setText("Ingrese el nombre del material");
        nombreElimTxt.setToolTipText("");
        nombreElimTxt.setBorder(null);
        nombreElimTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreElimTxtMousePressed(evt);
            }
        });
        nombreElimTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreElimTxtActionPerformed(evt);
            }
        });

        usuarioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel.setText("Nombre del material");
        usuarioLabel.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELIMINAR MATERIAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        entrarButtom.setBackground(new java.awt.Color(0, 102, 102));
        entrarButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarButtomMouseExited(evt);
            }
        });

        entrarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        entrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrarLabel.setText("ELIMINAR");

        javax.swing.GroupLayout entrarButtomLayout = new javax.swing.GroupLayout(entrarButtom);
        entrarButtom.setLayout(entrarButtomLayout);
        entrarButtomLayout.setHorizontalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarButtomLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(entrarLabel)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        entrarButtomLayout.setVerticalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entrarButtomLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(entrarLabel)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout contentEliminarMaterialesLayout = new javax.swing.GroupLayout(contentEliminarMateriales);
        contentEliminarMateriales.setLayout(contentEliminarMaterialesLayout);
        contentEliminarMaterialesLayout.setHorizontalGroup(
            contentEliminarMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentEliminarMaterialesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(entrarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(contentEliminarMaterialesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(contentEliminarMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(nombreElimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentEliminarMaterialesLayout.setVerticalGroup(
            contentEliminarMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentEliminarMaterialesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreElimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(entrarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentEliminarMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentEliminarMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreElimTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreElimTxtMousePressed
        if (nombreElimTxt.getText().equals("Ingrese el nombre del material")){
            nombreElimTxt.setText("");
            nombreElimTxt.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_nombreElimTxtMousePressed

    private void nombreElimTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreElimTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreElimTxtActionPerformed

    private void entrarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseClicked
        int option = JOptionPane.showConfirmDialog( null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION );
        if (option == JOptionPane.YES_OPTION) { 
            //ELIMINAR MATERIAL
        } else if (option == JOptionPane.NO_OPTION) {
            //SEGUIMOS CON NUESTRAS VIDAS
        }
    }//GEN-LAST:event_entrarButtomMouseClicked

    private void entrarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseEntered
        entrarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_entrarButtomMouseEntered

    private void entrarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseExited
        entrarButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_entrarButtomMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentEliminarMateriales;
    private javax.swing.JPanel entrarButtom;
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreElimTxt;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
