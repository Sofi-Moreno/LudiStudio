/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author aquil
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Inicio() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        salirButom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iniciarSesionButtom1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        crearUsuarioButom = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Salir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel5)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 3, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SLAR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 250, -1));

        salirButom.setBackground(new java.awt.Color(102, 102, 102));
        salirButom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirButomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirButomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirButomMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salir");

        javax.swing.GroupLayout salirButomLayout = new javax.swing.GroupLayout(salirButom);
        salirButom.setLayout(salirButomLayout);
        salirButomLayout.setHorizontalGroup(
            salirButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirButomLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        salirButomLayout.setVerticalGroup(
            salirButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirButomLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.add(salirButom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 340, 120));

        iniciarSesionButtom1.setBackground(new java.awt.Color(102, 102, 102));
        iniciarSesionButtom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesionButtom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSesionButtom1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iniciarSesionButtom1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iniciarSesionButtom1MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");

        javax.swing.GroupLayout iniciarSesionButtom1Layout = new javax.swing.GroupLayout(iniciarSesionButtom1);
        iniciarSesionButtom1.setLayout(iniciarSesionButtom1Layout);
        iniciarSesionButtom1Layout.setHorizontalGroup(
            iniciarSesionButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciarSesionButtom1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(43, 43, 43))
        );
        iniciarSesionButtom1Layout.setVerticalGroup(
            iniciarSesionButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciarSesionButtom1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.add(iniciarSesionButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 130));

        crearUsuarioButom.setBackground(new java.awt.Color(51, 51, 51));
        crearUsuarioButom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearUsuarioButom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUsuarioButomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearUsuarioButomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearUsuarioButomMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Crear Usuario");

        javax.swing.GroupLayout crearUsuarioButomLayout = new javax.swing.GroupLayout(crearUsuarioButom);
        crearUsuarioButom.setLayout(crearUsuarioButomLayout);
        crearUsuarioButomLayout.setHorizontalGroup(
            crearUsuarioButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearUsuarioButomLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(43, 43, 43))
        );
        crearUsuarioButomLayout.setVerticalGroup(
            crearUsuarioButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearUsuarioButomLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2.add(crearUsuarioButom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 340, 130));

        content.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirButomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButomMouseClicked
        int confirmacion = JOptionPane.showOptionDialog(
                        null,"¿Desea salir del sistema?", " ",
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        if (confirmacion==0) 
            this.dispose();
    }//GEN-LAST:event_salirButomMouseClicked

    private void iniciarSesionButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionButtom1MouseClicked
        inicioSesion p2 = new inicioSesion();
        p2.setSize(617,530);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_iniciarSesionButtom1MouseClicked

    private void crearUsuarioButomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUsuarioButomMouseClicked
        registroUsuario p2 = new registroUsuario();
        p2.setSize(617,530);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_crearUsuarioButomMouseClicked

    private void iniciarSesionButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionButtom1MouseEntered
        iniciarSesionButtom1.setBackground(Color.gray);
    }//GEN-LAST:event_iniciarSesionButtom1MouseEntered

    private void iniciarSesionButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSesionButtom1MouseExited
        iniciarSesionButtom1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_iniciarSesionButtom1MouseExited

    private void crearUsuarioButomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUsuarioButomMouseEntered
        crearUsuarioButom.setBackground(Color.gray);
    }//GEN-LAST:event_crearUsuarioButomMouseEntered

    private void crearUsuarioButomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUsuarioButomMouseExited
        crearUsuarioButom.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_crearUsuarioButomMouseExited

    private void salirButomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButomMouseEntered
        salirButom.setBackground(Color.gray);
    }//GEN-LAST:event_salirButomMouseEntered

    private void salirButomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButomMouseExited
        salirButom.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_salirButomMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JPanel crearUsuarioButom;
    private javax.swing.JPanel iniciarSesionButtom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel salirButom;
    // End of variables declaration//GEN-END:variables
}
