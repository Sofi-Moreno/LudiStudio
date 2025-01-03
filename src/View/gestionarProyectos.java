/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Proyecto;
import Model.Usuario;
import java.awt.Color;

/**
 *
 * @author aquil
 */
public class gestionarProyectos extends javax.swing.JPanel {
    Usuario usuarioActual;
    /**
     * Creates new form gestionarProyectos
     */
    public gestionarProyectos(Usuario user) {
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

        jButton1 = new javax.swing.JButton();
        contentProyectos = new javax.swing.JPanel();
        crearProyectoButtom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        verProyectosButtom = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminarProyectoButtom = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modificarProyectosButtom = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        contentProyectos.setBackground(new java.awt.Color(0, 153, 153));
        contentProyectos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearProyectoButtom.setBackground(new java.awt.Color(0, 102, 102));
        crearProyectoButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearProyectoButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearProyectoButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearProyectoButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearProyectoButtomMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Proyecto");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aquitecto.png"))); // NOI18N

        javax.swing.GroupLayout crearProyectoButtomLayout = new javax.swing.GroupLayout(crearProyectoButtom);
        crearProyectoButtom.setLayout(crearProyectoButtomLayout);
        crearProyectoButtomLayout.setHorizontalGroup(
            crearProyectoButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearProyectoButtomLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(crearProyectoButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        crearProyectoButtomLayout.setVerticalGroup(
            crearProyectoButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearProyectoButtomLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        contentProyectos.add(crearProyectoButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        verProyectosButtom.setBackground(new java.awt.Color(0, 102, 102));
        verProyectosButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verProyectosButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProyectosButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verProyectosButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verProyectosButtomMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ver Proyectos");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo blanco.png"))); // NOI18N

        javax.swing.GroupLayout verProyectosButtomLayout = new javax.swing.GroupLayout(verProyectosButtom);
        verProyectosButtom.setLayout(verProyectosButtomLayout);
        verProyectosButtomLayout.setHorizontalGroup(
            verProyectosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verProyectosButtomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(54, 54, 54))
            .addGroup(verProyectosButtomLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        verProyectosButtomLayout.setVerticalGroup(
            verProyectosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verProyectosButtomLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentProyectos.add(verProyectosButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 250));

        eliminarProyectoButtom.setBackground(new java.awt.Color(0, 102, 102));
        eliminarProyectoButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarProyectoButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarProyectoButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarProyectoButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarProyectoButtomMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar Proyecto");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N

        javax.swing.GroupLayout eliminarProyectoButtomLayout = new javax.swing.GroupLayout(eliminarProyectoButtom);
        eliminarProyectoButtom.setLayout(eliminarProyectoButtomLayout);
        eliminarProyectoButtomLayout.setHorizontalGroup(
            eliminarProyectoButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarProyectoButtomLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(eliminarProyectoButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        eliminarProyectoButtomLayout.setVerticalGroup(
            eliminarProyectoButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarProyectoButtomLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        contentProyectos.add(eliminarProyectoButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        modificarProyectosButtom.setBackground(new java.awt.Color(0, 102, 102));
        modificarProyectosButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarProyectosButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarProyectosButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarProyectosButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarProyectosButtomMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modificar Proyectos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plano blanco.png"))); // NOI18N

        javax.swing.GroupLayout modificarProyectosButtomLayout = new javax.swing.GroupLayout(modificarProyectosButtom);
        modificarProyectosButtom.setLayout(modificarProyectosButtomLayout);
        modificarProyectosButtomLayout.setHorizontalGroup(
            modificarProyectosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarProyectosButtomLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(modificarProyectosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        modificarProyectosButtomLayout.setVerticalGroup(
            modificarProyectosButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarProyectosButtomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        contentProyectos.add(modificarProyectosButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void crearProyectoButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearProyectoButtomMouseEntered
        crearProyectoButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_crearProyectoButtomMouseEntered

    private void crearProyectoButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearProyectoButtomMouseExited
        crearProyectoButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_crearProyectoButtomMouseExited

    private void verProyectosButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProyectosButtomMouseEntered
        verProyectosButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_verProyectosButtomMouseEntered

    private void verProyectosButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProyectosButtomMouseExited
        verProyectosButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_verProyectosButtomMouseExited

    private void eliminarProyectoButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarProyectoButtomMouseEntered
        eliminarProyectoButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_eliminarProyectoButtomMouseEntered

    private void eliminarProyectoButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarProyectoButtomMouseExited
        eliminarProyectoButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_eliminarProyectoButtomMouseExited

    private void modificarProyectosButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarProyectosButtomMouseEntered
        modificarProyectosButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_modificarProyectosButtomMouseEntered

    private void modificarProyectosButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarProyectosButtomMouseExited
        modificarProyectosButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_modificarProyectosButtomMouseExited

    private void crearProyectoButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearProyectoButtomMouseClicked
        SelectorDePartes p3 = new SelectorDePartes(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        contentProyectos.removeAll();
        contentProyectos.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentProyectos.revalidate();
        contentProyectos.repaint();
    }//GEN-LAST:event_crearProyectoButtomMouseClicked

    private void verProyectosButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProyectosButtomMouseClicked
        verProyectoMenu p3 = new verProyectoMenu(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        contentProyectos.removeAll();
        contentProyectos.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentProyectos.revalidate();
        contentProyectos.repaint();
    }//GEN-LAST:event_verProyectosButtomMouseClicked

    private void eliminarProyectoButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarProyectoButtomMouseClicked
        eliminarProyecto p3 = new eliminarProyecto(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        contentProyectos.removeAll();
        contentProyectos.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentProyectos.revalidate();
        contentProyectos.repaint();
    }//GEN-LAST:event_eliminarProyectoButtomMouseClicked

    private void modificarProyectosButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarProyectosButtomMouseClicked
        modificarProyecto p3 = new modificarProyecto(usuarioActual);
        p3.setSize(613,530);
        p3.setLocation(0,0);

        contentProyectos.removeAll();
        contentProyectos.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentProyectos.revalidate();
        contentProyectos.repaint();
    }//GEN-LAST:event_modificarProyectosButtomMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentProyectos;
    private javax.swing.JPanel crearProyectoButtom;
    private javax.swing.JPanel eliminarProyectoButtom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel modificarProyectosButtom;
    private javax.swing.JPanel verProyectosButtom;
    // End of variables declaration//GEN-END:variables
}
