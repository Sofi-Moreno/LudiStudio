/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerProyec;
import Model.Proyecto;
import Model.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Riarb
 */
public class buscarProyecto extends javax.swing.JFrame {
    ControllerProyec controller;
    Usuario usuarioActual;
    static Proyecto proyecto;
    /**
     * Creates new form buscarProyecto
     */
    public buscarProyecto(Proyecto proyec) throws SQLException {
        initComponents();
        controller = new ControllerProyec(this);
        proyecto = proyec;
        tablita.setModel(controller.llenarVistaPrevia(proyecto));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/appLogo-removebg-preview.png")).getImage());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tablita.setBackground(new java.awt.Color(0, 153, 153));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ZAPATA", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"MUROS DE CONTENCION", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"COLUMNAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"VIGAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"LOSAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"ENTREPISOS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"ESTRUCT CUBIERTA", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"CUBIERTA", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"MUROS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"VENTANAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"PUERTAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"ESCALERAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"RAMPAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"BARANDAS", null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"TECHOS", null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PARTE", "RUBRO", "NOMBRE MATERIAL", "UNIDAD", "PRECIO MATERIAL", "SUSTENTABILIDAD", "PROVEEDOR", "TRANSPORTE", "PRECIO TRANSPORTE", "MANO DE OBRA", "PRECIO MANO", "HERRAMIENTAS", "COSTO HERRAMIENTAS", "COSTO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablita.setToolTipText("");
        jScrollPane2.setViewportView(tablita);

        jButton1.setText("Volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(918, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(335, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(buscarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new buscarProyecto(proyecto).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(buscarProyecto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}
