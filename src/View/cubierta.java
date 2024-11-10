/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ControllerProyec;
import Model.Proyecto;
import Model.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Riarb
 */
public class cubierta extends javax.swing.JPanel {
    boolean estructCubierta, cubiert;
    ControllerProyec controller;
    Usuario usuarioActual;
    Proyecto proyecto;
    double presupuestoTotal;
    /**
     * Creates new form cubierta
     */
    public cubierta(Proyecto proyec, Usuario usuario,double presupuesto) {
        initComponents();
        estructCubierta=true;
        cubiert= true;
        controller=new ControllerProyec(this);
        usuarioActual = usuario;
        proyecto = proyec;
        presupuestoTotal = presupuesto;
        try {
            controller.llenarBoxMateriales(materialBox1);
            controller.llenarBoxMateriales(materialBox2);
        } catch (SQLException ex) {
            Logger.getLogger(fundamentosYcimentacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentCubierta = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deshabilitarButtom1 = new javax.swing.JPanel();
        deshabilitarLabel1 = new javax.swing.JLabel();
        habilitarButtom1 = new javax.swing.JPanel();
        habilitarLabel1 = new javax.swing.JLabel();
        materialBox1 = new javax.swing.JComboBox<>();
        precio1 = new javax.swing.JPanel();
        precio1Label = new javax.swing.JLabel();
        habilitarButtom2 = new javax.swing.JPanel();
        habilitarLabel2 = new javax.swing.JLabel();
        deshabilitarButtom2 = new javax.swing.JPanel();
        deshabilitarLabel2 = new javax.swing.JLabel();
        precioPanel2 = new javax.swing.JPanel();
        precioLabel2 = new javax.swing.JLabel();
        materialBox2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        estructuraLabel = new javax.swing.JLabel();
        cubiertaLabel = new javax.swing.JLabel();
        guardarButtom = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        entrarButtom = new javax.swing.JPanel();
        entrarLabel = new javax.swing.JLabel();

        contentCubierta.setBackground(new java.awt.Color(0, 204, 204));
        contentCubierta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUBIERTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        contentCubierta.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 619, -1));

        deshabilitarButtom1.setBackground(new java.awt.Color(0, 102, 102));
        deshabilitarButtom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deshabilitarButtom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deshabilitarButtom1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deshabilitarButtom1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deshabilitarButtom1MouseExited(evt);
            }
        });

        deshabilitarLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        deshabilitarLabel1.setForeground(new java.awt.Color(255, 255, 255));
        deshabilitarLabel1.setText("Deshabilitar");

        javax.swing.GroupLayout deshabilitarButtom1Layout = new javax.swing.GroupLayout(deshabilitarButtom1);
        deshabilitarButtom1.setLayout(deshabilitarButtom1Layout);
        deshabilitarButtom1Layout.setHorizontalGroup(
            deshabilitarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deshabilitarButtom1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(deshabilitarLabel1)
                .addGap(36, 36, 36))
        );
        deshabilitarButtom1Layout.setVerticalGroup(
            deshabilitarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deshabilitarButtom1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(deshabilitarLabel1)
                .addContainerGap())
        );

        contentCubierta.add(deshabilitarButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 194, -1, -1));

        habilitarButtom1.setBackground(new java.awt.Color(0, 102, 102));
        habilitarButtom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarButtom1.setEnabled(false);
        habilitarButtom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarButtom1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarButtom1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarButtom1MouseExited(evt);
            }
        });

        habilitarLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        habilitarLabel1.setForeground(new java.awt.Color(255, 255, 255));
        habilitarLabel1.setText("Habilitar");
        habilitarLabel1.setEnabled(false);

        javax.swing.GroupLayout habilitarButtom1Layout = new javax.swing.GroupLayout(habilitarButtom1);
        habilitarButtom1.setLayout(habilitarButtom1Layout);
        habilitarButtom1Layout.setHorizontalGroup(
            habilitarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(habilitarButtom1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(habilitarLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        habilitarButtom1Layout.setVerticalGroup(
            habilitarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(habilitarButtom1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(habilitarLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentCubierta.add(habilitarButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 153, -1, -1));

        materialBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material" }));
        materialBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialBox1ActionPerformed(evt);
            }
        });
        contentCubierta.add(materialBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 209, -1, -1));

        precio1Label.setText("Precio");

        javax.swing.GroupLayout precio1Layout = new javax.swing.GroupLayout(precio1);
        precio1.setLayout(precio1Layout);
        precio1Layout.setHorizontalGroup(
            precio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, precio1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(precio1Label)
                .addGap(29, 29, 29))
        );
        precio1Layout.setVerticalGroup(
            precio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(precio1Layout.createSequentialGroup()
                .addComponent(precio1Label)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        contentCubierta.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 209, -1, -1));

        habilitarButtom2.setBackground(new java.awt.Color(0, 102, 102));
        habilitarButtom2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarButtom2.setEnabled(false);
        habilitarButtom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarButtom2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarButtom2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarButtom2MouseExited(evt);
            }
        });

        habilitarLabel2.setForeground(new java.awt.Color(255, 255, 255));
        habilitarLabel2.setText("Habilitar");
        habilitarLabel2.setEnabled(false);

        javax.swing.GroupLayout habilitarButtom2Layout = new javax.swing.GroupLayout(habilitarButtom2);
        habilitarButtom2.setLayout(habilitarButtom2Layout);
        habilitarButtom2Layout.setHorizontalGroup(
            habilitarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(habilitarLabel2)
                .addGap(44, 44, 44))
        );
        habilitarButtom2Layout.setVerticalGroup(
            habilitarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(habilitarLabel2)
                .addContainerGap())
        );

        contentCubierta.add(habilitarButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 277, -1, -1));

        deshabilitarButtom2.setBackground(new java.awt.Color(0, 102, 102));
        deshabilitarButtom2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deshabilitarButtom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deshabilitarButtom2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deshabilitarButtom2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deshabilitarButtom2MouseExited(evt);
            }
        });

        deshabilitarLabel2.setForeground(new java.awt.Color(255, 255, 255));
        deshabilitarLabel2.setText("Deshabilitar");

        javax.swing.GroupLayout deshabilitarButtom2Layout = new javax.swing.GroupLayout(deshabilitarButtom2);
        deshabilitarButtom2.setLayout(deshabilitarButtom2Layout);
        deshabilitarButtom2Layout.setHorizontalGroup(
            deshabilitarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deshabilitarButtom2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(deshabilitarLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        deshabilitarButtom2Layout.setVerticalGroup(
            deshabilitarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deshabilitarButtom2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deshabilitarLabel2)
                .addContainerGap())
        );

        contentCubierta.add(deshabilitarButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 315, -1, -1));

        precioLabel2.setText("Precio");

        javax.swing.GroupLayout precioPanel2Layout = new javax.swing.GroupLayout(precioPanel2);
        precioPanel2.setLayout(precioPanel2Layout);
        precioPanel2Layout.setHorizontalGroup(
            precioPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, precioPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(precioLabel2)
                .addGap(29, 29, 29))
        );
        precioPanel2Layout.setVerticalGroup(
            precioPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(precioPanel2Layout.createSequentialGroup()
                .addComponent(precioLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contentCubierta.add(precioPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 367, -1, 22));

        materialBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material" }));
        contentCubierta.add(materialBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 367, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        contentCubierta.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 261, 619, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        contentCubierta.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 401, 613, 27));

        estructuraLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        estructuraLabel.setForeground(new java.awt.Color(0, 102, 102));
        estructuraLabel.setText("Estructura de Cubierta");
        contentCubierta.add(estructuraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 151, 367, -1));

        cubiertaLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        cubiertaLabel.setForeground(new java.awt.Color(0, 102, 102));
        cubiertaLabel.setText("Cubierta");
        contentCubierta.add(cubiertaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 294, -1, -1));

        guardarButtom.setBackground(new java.awt.Color(0, 102, 102));
        guardarButtom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarButtomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarButtomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarButtomMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GUARDAR");

        javax.swing.GroupLayout guardarButtomLayout = new javax.swing.GroupLayout(guardarButtom);
        guardarButtom.setLayout(guardarButtomLayout);
        guardarButtomLayout.setHorizontalGroup(
            guardarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarButtomLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(52, 52, 52))
        );
        guardarButtomLayout.setVerticalGroup(
            guardarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarButtomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        contentCubierta.add(guardarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 436, 220, -1));

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

        entrarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        entrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrarLabel.setText("VOLVER");

        javax.swing.GroupLayout entrarButtomLayout = new javax.swing.GroupLayout(entrarButtom);
        entrarButtom.setLayout(entrarButtomLayout);
        entrarButtomLayout.setHorizontalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarButtomLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(entrarLabel)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        entrarButtomLayout.setVerticalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarButtomLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(entrarLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        contentCubierta.add(entrarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentCubierta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentCubierta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deshabilitarButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom1MouseClicked
        habilitarButtom1.setEnabled(true);
        habilitarLabel1.setEnabled(true);
        deshabilitarButtom1.setEnabled(false);
        deshabilitarLabel1.setEnabled(false);
        estructuraLabel.setEnabled(false);
        precio1Label.setEnabled(false);
        precio1.setEnabled(false);
        materialBox1.setEnabled(false);
        estructCubierta=false;
    }//GEN-LAST:event_deshabilitarButtom1MouseClicked

    private void deshabilitarButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom1MouseEntered
        deshabilitarButtom1.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_deshabilitarButtom1MouseEntered

    private void deshabilitarButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom1MouseExited
        deshabilitarButtom1.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_deshabilitarButtom1MouseExited

    private void habilitarButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom1MouseClicked
        habilitarButtom1.setEnabled(false);
        habilitarLabel1.setEnabled(false);
        deshabilitarButtom1.setEnabled(true);
        deshabilitarLabel1.setEnabled(true);
        estructuraLabel.setEnabled(true);
        precio1Label.setEnabled(true);
        precio1.setEnabled(true);
        materialBox1.setEnabled(true);
        estructCubierta=true;
        
    }//GEN-LAST:event_habilitarButtom1MouseClicked

    private void habilitarButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom1MouseEntered
        habilitarButtom1.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_habilitarButtom1MouseEntered

    private void habilitarButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom1MouseExited
        habilitarButtom1.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_habilitarButtom1MouseExited

    private void materialBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialBox1ActionPerformed

    private void habilitarButtom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom2MouseClicked
        habilitarButtom2.setEnabled(false);
        habilitarLabel2.setEnabled(false);
        deshabilitarButtom2.setEnabled(true);
        deshabilitarLabel2.setEnabled(true);
        cubiertaLabel.setEnabled(true);
        precioLabel2.setEnabled(true);
        precioPanel2.setEnabled(true);
        materialBox2.setEnabled(true);
        cubiert=true;
    }//GEN-LAST:event_habilitarButtom2MouseClicked

    private void habilitarButtom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom2MouseEntered
        habilitarButtom2.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_habilitarButtom2MouseEntered

    private void habilitarButtom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom2MouseExited
        habilitarButtom2.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_habilitarButtom2MouseExited

    private void deshabilitarButtom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom2MouseClicked
        habilitarButtom2.setEnabled(true);
        habilitarLabel2.setEnabled(true);
        deshabilitarButtom2.setEnabled(false);
        deshabilitarLabel2.setEnabled(false);
        cubiertaLabel.setEnabled(false);
        precioLabel2.setEnabled(false);
        precioPanel2.setEnabled(false);
        materialBox2.setEnabled(false);
        cubiert=false;
    }//GEN-LAST:event_deshabilitarButtom2MouseClicked

    private void deshabilitarButtom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom2MouseEntered
        deshabilitarButtom2.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_deshabilitarButtom2MouseEntered

    private void deshabilitarButtom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom2MouseExited
        deshabilitarButtom2.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_deshabilitarButtom2MouseExited

    private void guardarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseEntered
        guardarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_guardarButtomMouseEntered

    private void guardarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseExited
        guardarButtom.setBackground(new Color(0,102,102));

        
    }//GEN-LAST:event_guardarButtomMouseExited

    private void guardarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseClicked
        if(estructCubierta && materialBox1.getSelectedItem().equals("Material")){
            JOptionPane.showMessageDialog(null, "La parte llamada 'Estructura Cubierta' esta habilitada y no has escogido un material para ella.");
        }else if(cubiert && materialBox2.getSelectedItem().equals("Material")){
            JOptionPane.showMessageDialog(null, "La parte llamada 'Cubierta' esta habilitada y no has escogido un material para ella.");
        }else{
            try{
                if(estructCubierta && !materialBox1.getSelectedItem().equals("Material")){
                    controller.guardarMateriales(proyecto,materialBox1,"UPDATE partes SET EstructuraDeCubierta = ? WHERE id_partes = ?");
//                    presupuestoTotal = presupuestoTotal + Double.parseDouble(precio1Label.getText());
                }
                if(cubiert && !materialBox2.getSelectedItem().equals("Material")){
                    controller.guardarMateriales(proyecto,materialBox2,"UPDATE partes SET Cubierta = ? WHERE id_partes = ?");
//                    presupuestoTotal = presupuestoTotal + Double.parseDouble(precioLabel2.getText());
                }
            }catch (SQLException ex) {
                Logger.getLogger(fundamentosYcimentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            Cerramientos p3 = new Cerramientos(proyecto,usuarioActual,presupuestoTotal);
            p3.setSize(613,530);
            p3.setLocation(0,0);
            contentCubierta.removeAll();
            contentCubierta.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
            contentCubierta.revalidate();
            contentCubierta.repaint();
        }
        
    }//GEN-LAST:event_guardarButtomMouseClicked

    private void entrarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseClicked
        Estructura p3 = new Estructura(proyecto,usuarioActual,presupuestoTotal);
        p3.setSize(613,530);
        p3.setLocation(0,0);
        contentCubierta.removeAll();
        contentCubierta.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentCubierta.revalidate();
        contentCubierta.repaint();
    }//GEN-LAST:event_entrarButtomMouseClicked

    private void entrarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseEntered
        entrarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_entrarButtomMouseEntered

    private void entrarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseExited
        entrarButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_entrarButtomMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentCubierta;
    private javax.swing.JLabel cubiertaLabel;
    private javax.swing.JPanel deshabilitarButtom1;
    private javax.swing.JPanel deshabilitarButtom2;
    private javax.swing.JLabel deshabilitarLabel1;
    private javax.swing.JLabel deshabilitarLabel2;
    private javax.swing.JPanel entrarButtom;
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JLabel estructuraLabel;
    private javax.swing.JPanel guardarButtom;
    private javax.swing.JPanel habilitarButtom1;
    private javax.swing.JPanel habilitarButtom2;
    private javax.swing.JLabel habilitarLabel1;
    private javax.swing.JLabel habilitarLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> materialBox1;
    private javax.swing.JComboBox<String> materialBox2;
    private javax.swing.JPanel precio1;
    private javax.swing.JLabel precio1Label;
    private javax.swing.JLabel precioLabel2;
    private javax.swing.JPanel precioPanel2;
    // End of variables declaration//GEN-END:variables
}
