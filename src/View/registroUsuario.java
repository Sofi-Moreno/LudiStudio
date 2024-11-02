/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author aquil
 */
public class registroUsuario extends javax.swing.JPanel {

    /**
     * Creates new form registoUsuario
     */
    public registroUsuario() {
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

        jPanel6 = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        carreraLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        entrarButtom = new javax.swing.JPanel();
        entrarLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        userTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre");
        jPanel6.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        apellidoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        apellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidoLabel.setText("Apellido");
        jPanel6.add(apellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        usuarioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel.setText("Usuario");
        jPanel6.add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Moneda");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Institución");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        paisLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        paisLabel.setForeground(new java.awt.Color(255, 255, 255));
        paisLabel.setText("País");
        jPanel6.add(paisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        carreraLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        carreraLabel.setForeground(new java.awt.Color(255, 255, 255));
        carreraLabel.setText("Carrera");
        jPanel6.add(carreraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Bolivares (Bs)", "Dolares ($)", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 150, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Ingenieria Civil", "Ingenieria Informatica", "Arquitectura" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("Crea tu perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(tituloLabel)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(30, 30, 30))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 100));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 260, 250));

        entrarButtom.setBackground(new java.awt.Color(0, 102, 102));
        entrarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarButtomMouseClicked(evt);
            }
        });

        entrarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        entrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrarLabel.setText("REGISTRAR");

        javax.swing.GroupLayout entrarButtomLayout = new javax.swing.GroupLayout(entrarButtom);
        entrarButtom.setLayout(entrarButtomLayout);
        entrarButtomLayout.setHorizontalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarButtomLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(entrarLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        entrarButtomLayout.setVerticalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entrarButtomLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(entrarLabel)
                .addGap(17, 17, 17))
        );

        jPanel6.add(entrarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 170, 60));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 190, 20));

        nombreTxt.setBackground(new java.awt.Color(0, 153, 153));
        nombreTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreTxt.setText("Ingrese su nombre");
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
        jPanel6.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        apellidoTxt.setBackground(new java.awt.Color(0, 153, 153));
        apellidoTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(204, 204, 204));
        apellidoTxt.setText("Ingrese su apellido");
        apellidoTxt.setToolTipText("");
        apellidoTxt.setBorder(null);
        apellidoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoTxtMousePressed(evt);
            }
        });
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        jPanel6.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setToolTipText("");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel6.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        passTxt.setBackground(new java.awt.Color(0, 153, 153));
        passTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("************");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        jPanel6.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, 20));
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 20));
        jPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "UCA", "UCAB", "PUCEM" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 150, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Ecuador", "Venezuela", "El Salvador" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseClicked
        String user, pass;
        user=userTxt.getText();
        pass=String.valueOf(passTxt.getPassword());
        inicioSesion inicio = new inicioSesion();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_entrarButtomMouseClicked

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        if (nombreTxt.getText().equals("Ingrese su nombre")){
            nombreTxt.setText("");
            nombreTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(new Color(204,204,204));
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(new Color(204,204,204));
        }
        if (apellidoTxt.getText().isEmpty()){
            apellidoTxt.setText("Ingrese su apellido");
            apellidoTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_nombreTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void apellidoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoTxtMousePressed
        if (apellidoTxt.getText().equals("Ingrese su apellido")){
            apellidoTxt.setText("");
            apellidoTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(new Color(204,204,204));
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(new Color(204,204,204));
        }
        if (nombreTxt.getText().isEmpty()){
            nombreTxt.setText("Ingrese su nombre");
            nombreTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_apellidoTxtMousePressed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese su nombre de usuario")){
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(new Color(204,204,204));
        }
        if (nombreTxt.getText().isEmpty()){
            nombreTxt.setText("Ingrese su nombre");
            nombreTxt.setForeground(new Color(204,204,204));
        }
        if (apellidoTxt.getText().isEmpty()){
            apellidoTxt.setText("Ingrese su apellido");
            apellidoTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("************")){
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (nombreTxt.getText().isEmpty()){
            nombreTxt.setText("Ingrese su nombre");
            nombreTxt.setForeground(new Color(204,204,204));
        }
        if (apellidoTxt.getText().isEmpty()){
            apellidoTxt.setText("Ingrese su apellido");
            apellidoTxt.setForeground(new Color(204,204,204));
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_passTxtMousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JPanel entrarButtom;
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField userTxt;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
