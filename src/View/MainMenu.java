/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Riarb
 */
public class MainMenu extends javax.swing.JFrame {
    static Usuario usuarioActual = new Usuario();
    /**
     * Creates new form MainMenu
     * @param us
     */
    public MainMenu(Usuario us) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/appLogo-removebg-preview.png")).getImage());
        usuarioActual = us;
        this.setResizable(false);
        this.setLocation(200, 80);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salirButom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gestionarUsuarioButtom1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gestionarMaterialesButom = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        gestionarProyectosButtom = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        content2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(92, 225, 230));
        jPanel1.setForeground(new java.awt.Color(92, 225, 230));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirButom.setBackground(new java.awt.Color(0, 153, 153));
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

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cerrar sesión");

        javax.swing.GroupLayout salirButomLayout = new javax.swing.GroupLayout(salirButom);
        salirButom.setLayout(salirButomLayout);
        salirButomLayout.setHorizontalGroup(
            salirButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirButomLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        salirButomLayout.setVerticalGroup(
            salirButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirButomLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.add(salirButom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 340, 90));

        gestionarUsuarioButtom1.setBackground(new java.awt.Color(0, 153, 153));
        gestionarUsuarioButtom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionarUsuarioButtom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarUsuarioButtom1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarUsuarioButtom1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarUsuarioButtom1MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestionar usuario");

        javax.swing.GroupLayout gestionarUsuarioButtom1Layout = new javax.swing.GroupLayout(gestionarUsuarioButtom1);
        gestionarUsuarioButtom1.setLayout(gestionarUsuarioButtom1Layout);
        gestionarUsuarioButtom1Layout.setHorizontalGroup(
            gestionarUsuarioButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarUsuarioButtom1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        gestionarUsuarioButtom1Layout.setVerticalGroup(
            gestionarUsuarioButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarUsuarioButtom1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );

        jPanel2.add(gestionarUsuarioButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 100));

        gestionarMaterialesButom.setBackground(new java.awt.Color(0, 153, 153));
        gestionarMaterialesButom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionarMaterialesButom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarMaterialesButomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarMaterialesButomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarMaterialesButomMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestionar materiales");

        javax.swing.GroupLayout gestionarMaterialesButomLayout = new javax.swing.GroupLayout(gestionarMaterialesButom);
        gestionarMaterialesButom.setLayout(gestionarMaterialesButomLayout);
        gestionarMaterialesButomLayout.setHorizontalGroup(
            gestionarMaterialesButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionarMaterialesButomLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(46, 46, 46))
        );
        gestionarMaterialesButomLayout.setVerticalGroup(
            gestionarMaterialesButomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarMaterialesButomLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.add(gestionarMaterialesButom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 340, 100));

        gestionarProyectosButtom.setBackground(new java.awt.Color(0, 153, 153));
        gestionarProyectosButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionarProyectosButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarProyectosButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarProyectosButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarProyectosButtomMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestionar proyectos");

        javax.swing.GroupLayout gestionarProyectosButtomLayout = new javax.swing.GroupLayout(gestionarProyectosButtom);
        gestionarProyectosButtom.setLayout(gestionarProyectosButtomLayout);
        gestionarProyectosButtomLayout.setHorizontalGroup(
            gestionarProyectosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarProyectosButtomLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        gestionarProyectosButtomLayout.setVerticalGroup(
            gestionarProyectosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionarProyectosButtomLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.add(gestionarProyectosButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 340, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 55)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ludi");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 55)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Studio");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        content2.setBackground(new java.awt.Color(92, 225, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bigLogo.png"))); // NOI18N

        javax.swing.GroupLayout content2Layout = new javax.swing.GroupLayout(content2);
        content2.setLayout(content2Layout);
        content2Layout.setHorizontalGroup(
            content2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        content2Layout.setVerticalGroup(
            content2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
            .addComponent(content2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirButomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButomMouseClicked
        int confirmacion = JOptionPane.showOptionDialog(
            null,"¿Desea salir del sistema?", " ",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
        if (confirmacion==0){
            Inicio menu = new Inicio();
            menu.setVisible(true);
            this.setVisible(false);
        }
            
    }//GEN-LAST:event_salirButomMouseClicked

    private void salirButomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButomMouseEntered
        salirButom.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_salirButomMouseEntered

    private void salirButomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButomMouseExited
        salirButom.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_salirButomMouseExited

    private void gestionarUsuarioButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarUsuarioButtom1MouseClicked
        gestionarUsuario p3 = new gestionarUsuario(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        content2.removeAll();
        content2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        content2.revalidate();
        content2.repaint();
    }//GEN-LAST:event_gestionarUsuarioButtom1MouseClicked

    private void gestionarUsuarioButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarUsuarioButtom1MouseEntered
        gestionarUsuarioButtom1.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_gestionarUsuarioButtom1MouseEntered

    private void gestionarUsuarioButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarUsuarioButtom1MouseExited
        gestionarUsuarioButtom1.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_gestionarUsuarioButtom1MouseExited

    private void gestionarMaterialesButomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarMaterialesButomMouseClicked
        gestionarMateriales p4 = new gestionarMateriales(usuarioActual);
        p4.setSize(613,530);
        p4.setLocation(0,0);

        content2.removeAll();
        content2.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        content2.revalidate();
        content2.repaint();
    }//GEN-LAST:event_gestionarMaterialesButomMouseClicked

    private void gestionarMaterialesButomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarMaterialesButomMouseEntered
        gestionarMaterialesButom.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_gestionarMaterialesButomMouseEntered

    private void gestionarMaterialesButomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarMaterialesButomMouseExited
        gestionarMaterialesButom.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_gestionarMaterialesButomMouseExited

    private void gestionarProyectosButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarProyectosButtomMouseClicked
        gestionarProyectos p5 = new gestionarProyectos(usuarioActual);
        p5.setSize(613,530);
        p5.setLocation(0,0);

        content2.removeAll();
        content2.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        content2.revalidate();
        content2.repaint();
    }//GEN-LAST:event_gestionarProyectosButtomMouseClicked

    private void gestionarProyectosButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarProyectosButtomMouseEntered
        gestionarProyectosButtom.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_gestionarProyectosButtomMouseEntered

    private void gestionarProyectosButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarProyectosButtomMouseExited
        gestionarProyectosButtom.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_gestionarProyectosButtomMouseExited

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(usuarioActual).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content2;
    private javax.swing.JPanel gestionarMaterialesButom;
    private javax.swing.JPanel gestionarProyectosButtom;
    private javax.swing.JPanel gestionarUsuarioButtom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel salirButom;
    // End of variables declaration//GEN-END:variables
}
