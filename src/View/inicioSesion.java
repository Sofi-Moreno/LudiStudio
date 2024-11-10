/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.Controller;
import Model.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aquil
 */
public class inicioSesion extends javax.swing.JPanel {
    Usuario usuarioActual;
    Controller controller;
    /**
     * Creates new form inicioSesion
     */
    public inicioSesion() {
        initComponents();
        controller = new Controller(userTxt, passTxt,this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entrarButtom = new javax.swing.JPanel();
        entrarLabel = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jTextField2.setText("jTextField2");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Contraseña");
        jPanel3.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 170, -1));

        usuarioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel.setText("Usuario");
        usuarioLabel.setToolTipText("");
        jPanel3.add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("Iniciar Sesión");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(tituloLabel)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 620, -1));

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
        entrarLabel.setText("ENTRAR");

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

        jPanel3.add(entrarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 170, 60));

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
        jPanel3.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 310, -1));

        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
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
        jPanel3.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 320, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 190, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 170, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 617, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Ingrese su nombre de usuario")){
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("************")){
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void entrarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseClicked
        usuarioActual = new Usuario();
        try {
            do{
                try {
                    if(!controller.validarUsuario(usuarioActual)){
                        JOptionPane.showMessageDialog(null, "El usuario que desea ingresar no existe en nuestro sistema, ingreselo nuevamente.");
                        break;
                    }else if(controller.validarClave(usuarioActual)){
                        JOptionPane.showMessageDialog(null, "La contraseña ingresada no coincide con el usuario, ingresela nuevamente.");
                        break;
                    }
                    else{
                        controller.iniciarSesion(usuarioActual);
                        MainMenu menu = new MainMenu(usuarioActual);
                        menu.setVisible(true);
                        this.setVisible(false);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }while(!controller.validarUsuario(usuarioActual) || controller.validarClave(usuarioActual));
        } catch (SQLException ex) {
            Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_entrarButtomMouseClicked

    private void entrarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseEntered
        entrarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_entrarButtomMouseEntered

    private void entrarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseExited
        entrarButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_entrarButtomMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel entrarButtom;
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField userTxt;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
