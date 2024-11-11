/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author Riarb
 */
public class verProyectoMenu extends javax.swing.JPanel {

    /**
     * Creates new form verProyectoMenu
     */
    public verProyectoMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        contentVista = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        ingresarButtom = new javax.swing.JPanel();
        ingresarLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del proyecto:");

        contentVista.setBackground(new java.awt.Color(0, 153, 153));
        contentVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("VER PROYECTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
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
        ingresarLabel.setText("BUSCAR");

        javax.swing.GroupLayout ingresarButtomLayout = new javax.swing.GroupLayout(ingresarButtom);
        ingresarButtom.setLayout(ingresarButtomLayout);
        ingresarButtomLayout.setHorizontalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarButtomLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(ingresarLabel)
                .addGap(36, 36, 36))
        );
        ingresarButtomLayout.setVerticalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarButtomLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ingresarLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        contentVista.add(ingresarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        jScrollPane4.setViewportView(table);

        contentVista.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 340));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        contentVista.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        nombreTxt.setBackground(new java.awt.Color(0, 153, 153));
        nombreTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreTxt.setText("Ingresar el ID del proyecto a buscar");
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
        contentVista.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 250, -1));
        contentVista.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 230, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo blanco.png"))); // NOI18N
        contentVista.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentVista, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseClicked
        verProyecto p3 = new verProyecto();
        p3.setSize(613,530);
        p3.setLocation(0,0);
        contentVista.removeAll();
        contentVista.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentVista.revalidate();
        contentVista.repaint();
    }//GEN-LAST:event_ingresarButtomMouseClicked

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        if (nombreTxt.getText().equals("Ingresar el ID del proyecto a buscar")){
            nombreTxt.setText("");
            nombreTxt.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_nombreTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void ingresarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseEntered
        ingresarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_ingresarButtomMouseEntered

    private void ingresarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseExited
        ingresarButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_ingresarButtomMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentVista;
    private javax.swing.JPanel ingresarButtom;
    private javax.swing.JLabel ingresarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTable table;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}