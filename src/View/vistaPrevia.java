/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerProyec;
<<<<<<< HEAD
import Model.Proyecto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
=======
import javax.swing.ImageIcon;
>>>>>>> b0cb520fb555facd21d6959fa0114ca3f90d5b18

/**
 *
 * @author Riarb
 */
public class vistaPrevia extends javax.swing.JFrame {
    ControllerProyec controller;
    DefaultTableModel modelo;
    static Proyecto proyecto;
    /**
     * Creates new form vistaPrevia
     */
    public vistaPrevia(Proyecto proyecto) throws SQLException {
        initComponents();
<<<<<<< HEAD
        this.proyecto = proyecto;
        modelo = new DefaultTableModel();
        tablita = new JTable();
        controller = new ControllerProyec(this,modelo);
        modelo = controller.llenarVistaPrevia(proyecto,"Zapata");
        tablita.setModel(modelo);
=======
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/appLogo-removebg-preview.png")).getImage());
>>>>>>> b0cb520fb555facd21d6959fa0114ca3f90d5b18
        
//        controller.llenarVistaPrevia(proyecto,"MurosDeContención",tablita);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(vistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new vistaPrevia(proyecto).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(vistaPrevia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}
