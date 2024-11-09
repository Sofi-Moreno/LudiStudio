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
public class Cerramientos extends javax.swing.JPanel {
    boolean mur, vent, puert;
    ControllerProyec controller;
    Usuario usuarioActual;
    Proyecto proyecto;
    double presupuestoTotal;
    /**
     * Creates new form Cerramientos
     */
    public Cerramientos(Proyecto proyec, Usuario usuario,double presupuesto) {
        initComponents();
        mur= true;
        vent=true;
        puert=true;
        controller=new ControllerProyec(this);
        usuarioActual = usuario;
        proyecto = proyec;
        presupuestoTotal = presupuesto;
        try {
            controller.llenarBoxMateriales(materialBox1);
            controller.llenarBoxMateriales(materialBox2);
            controller.llenarBoxMateriales(materialBox3);
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

        contentCerramientos = new javax.swing.JPanel();
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
        murosLabel = new javax.swing.JLabel();
        ventanaLabel = new javax.swing.JLabel();
        puertasLabel = new javax.swing.JLabel();
        habilitarButtom3 = new javax.swing.JPanel();
        habilitarLabel3 = new javax.swing.JLabel();
        deshabilitarButtom3 = new javax.swing.JPanel();
        deshabilitarLabel3 = new javax.swing.JLabel();
        materialBox3 = new javax.swing.JComboBox<>();
        precioPanel3 = new javax.swing.JPanel();
        precioLabel3 = new javax.swing.JLabel();
        guardarButtom = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        contentCerramientos.setBackground(new java.awt.Color(0, 204, 204));
        contentCerramientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CERRAMIENTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        contentCerramientos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 613, -1));

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
            .addGroup(deshabilitarButtom1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(deshabilitarLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        deshabilitarButtom1Layout.setVerticalGroup(
            deshabilitarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deshabilitarButtom1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(deshabilitarLabel1)
                .addContainerGap())
        );

        contentCerramientos.add(deshabilitarButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(habilitarLabel1)
                .addGap(26, 26, 26))
        );
        habilitarButtom1Layout.setVerticalGroup(
            habilitarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(habilitarLabel1)
                .addContainerGap())
        );

        contentCerramientos.add(habilitarButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, -1));

        materialBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material" }));
        materialBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialBox1ActionPerformed(evt);
            }
        });
        contentCerramientos.add(materialBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 214, -1, -1));

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

        contentCerramientos.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

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
            .addGroup(habilitarButtom2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(habilitarLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        habilitarButtom2Layout.setVerticalGroup(
            habilitarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(habilitarLabel2)
                .addContainerGap())
        );

        contentCerramientos.add(habilitarButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 110, -1));

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
            .addGroup(deshabilitarButtom2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(deshabilitarLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        deshabilitarButtom2Layout.setVerticalGroup(
            deshabilitarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deshabilitarButtom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deshabilitarLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentCerramientos.add(deshabilitarButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 110, -1));

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
                .addGap(0, 6, Short.MAX_VALUE))
        );

        contentCerramientos.add(precioPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        materialBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material" }));
        contentCerramientos.add(materialBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        contentCerramientos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 613, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        contentCerramientos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 382, 613, 38));

        murosLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        murosLabel.setForeground(new java.awt.Color(0, 102, 102));
        murosLabel.setText("Muros");
        contentCerramientos.add(murosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 152, 174, -1));

        ventanaLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        ventanaLabel.setForeground(new java.awt.Color(0, 102, 102));
        ventanaLabel.setText("Ventanas");
        contentCerramientos.add(ventanaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        puertasLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        puertasLabel.setForeground(new java.awt.Color(0, 102, 102));
        puertasLabel.setText("Puertas");
        contentCerramientos.add(puertasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        habilitarButtom3.setBackground(new java.awt.Color(0, 102, 102));
        habilitarButtom3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        habilitarButtom3.setEnabled(false);
        habilitarButtom3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarButtom3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                habilitarButtom3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                habilitarButtom3MouseExited(evt);
            }
        });

        habilitarLabel3.setForeground(new java.awt.Color(255, 255, 255));
        habilitarLabel3.setText("Habilitar");
        habilitarLabel3.setEnabled(false);

        javax.swing.GroupLayout habilitarButtom3Layout = new javax.swing.GroupLayout(habilitarButtom3);
        habilitarButtom3.setLayout(habilitarButtom3Layout);
        habilitarButtom3Layout.setHorizontalGroup(
            habilitarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(habilitarLabel3)
                .addGap(44, 44, 44))
        );
        habilitarButtom3Layout.setVerticalGroup(
            habilitarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(habilitarLabel3)
                .addContainerGap())
        );

        contentCerramientos.add(habilitarButtom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 136, -1));

        deshabilitarButtom3.setBackground(new java.awt.Color(0, 102, 102));
        deshabilitarButtom3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deshabilitarButtom3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deshabilitarButtom3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deshabilitarButtom3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deshabilitarButtom3MouseExited(evt);
            }
        });

        deshabilitarLabel3.setForeground(new java.awt.Color(255, 255, 255));
        deshabilitarLabel3.setText("Deshabilitar");

        javax.swing.GroupLayout deshabilitarButtom3Layout = new javax.swing.GroupLayout(deshabilitarButtom3);
        deshabilitarButtom3.setLayout(deshabilitarButtom3Layout);
        deshabilitarButtom3Layout.setHorizontalGroup(
            deshabilitarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deshabilitarButtom3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(deshabilitarLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        deshabilitarButtom3Layout.setVerticalGroup(
            deshabilitarButtom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deshabilitarButtom3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deshabilitarLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentCerramientos.add(deshabilitarButtom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        materialBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material" }));
        contentCerramientos.add(materialBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        precioLabel3.setText("Precio");

        javax.swing.GroupLayout precioPanel3Layout = new javax.swing.GroupLayout(precioPanel3);
        precioPanel3.setLayout(precioPanel3Layout);
        precioPanel3Layout.setHorizontalGroup(
            precioPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(precioPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(precioLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        precioPanel3Layout.setVerticalGroup(
            precioPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(precioPanel3Layout.createSequentialGroup()
                .addComponent(precioLabel3)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        contentCerramientos.add(precioPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

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
        jLabel2.setText("Guardar");

        javax.swing.GroupLayout guardarButtomLayout = new javax.swing.GroupLayout(guardarButtom);
        guardarButtom.setLayout(guardarButtomLayout);
        guardarButtomLayout.setHorizontalGroup(
            guardarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarButtomLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        guardarButtomLayout.setVerticalGroup(
            guardarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarButtomLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        contentCerramientos.add(guardarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentCerramientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentCerramientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deshabilitarButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom1MouseClicked
        habilitarButtom1.setEnabled(true);
        habilitarLabel1.setEnabled(true);
        deshabilitarButtom1.setEnabled(false);
        deshabilitarLabel1.setEnabled(false);
        murosLabel.setEnabled(false);
        precio1Label.setEnabled(false);
        precio1.setEnabled(false);
        materialBox1.setEnabled(false);
        mur= false;
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
        murosLabel.setEnabled(true);
        precio1Label.setEnabled(true);
        precio1.setEnabled(true);
        materialBox1.setEnabled(true);
        mur= true;
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
        ventanaLabel.setEnabled(true);
        precioLabel2.setEnabled(true);
        precioPanel2.setEnabled(true);
        materialBox2.setEnabled(true);
        vent=true;
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
        ventanaLabel.setEnabled(false);
        precioLabel2.setEnabled(false);
        precioPanel2.setEnabled(false);
        materialBox2.setEnabled(false);
        vent= false;
    }//GEN-LAST:event_deshabilitarButtom2MouseClicked

    private void deshabilitarButtom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom2MouseEntered
        deshabilitarButtom2.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_deshabilitarButtom2MouseEntered

    private void deshabilitarButtom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom2MouseExited
        deshabilitarButtom2.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_deshabilitarButtom2MouseExited

    private void habilitarButtom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom3MouseClicked
        habilitarButtom3.setEnabled(false);
        habilitarLabel3.setEnabled(false);
        deshabilitarButtom3.setEnabled(true);
        deshabilitarLabel3.setEnabled(true);
        puertasLabel.setEnabled(true);
        precioLabel3.setEnabled(true);
        precioPanel3.setEnabled(true);
        materialBox3.setEnabled(true);
        puert =true;
    }//GEN-LAST:event_habilitarButtom3MouseClicked

    private void habilitarButtom3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarButtom3MouseEntered

    private void habilitarButtom3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_habilitarButtom3MouseExited

    private void deshabilitarButtom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom3MouseClicked
        habilitarButtom3.setEnabled(true);
        habilitarLabel3.setEnabled(true);
        deshabilitarButtom3.setEnabled(false);
        deshabilitarLabel3.setEnabled(false);
        puertasLabel.setEnabled(false);
        precioLabel3.setEnabled(false);
        precioPanel3.setEnabled(false);
        materialBox3.setEnabled(false);
        puert =false;
    }//GEN-LAST:event_deshabilitarButtom3MouseClicked

    private void deshabilitarButtom3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deshabilitarButtom3MouseEntered

    private void deshabilitarButtom3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deshabilitarButtom3MouseExited

    private void guardarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseClicked
        if(mur && materialBox1.getSelectedItem().equals("Material")){
            JOptionPane.showMessageDialog(null, "La parte llamada 'Columnas' esta habilitada y no has escogido un material para ella.");
        }else if(vent && materialBox3.getSelectedItem().equals("Material")){
            JOptionPane.showMessageDialog(null, "La parte llamada 'Losas' esta habilitada y no has escogido un material para ella.");
        }else if(puert && materialBox2.getSelectedItem().equals("Material")){
            JOptionPane.showMessageDialog(null, "La parte llamada 'Vigas' esta habilitada y no has escogido un material para ella.");
        }else{
            try{
                if(mur && !materialBox1.getSelectedItem().equals("Material")){
                    controller.guardarMateriales(materialBox1,murosLabel);
                }
                if(vent && !materialBox3.getSelectedItem().equals("Material")){
                    controller.guardarMateriales(materialBox3, ventanaLabel);
                }
                if(puert && !materialBox2.getSelectedItem().equals("Material")){
                    controller.guardarMateriales(materialBox2,puertasLabel);
                }
                
            }catch (SQLException ex) {
                Logger.getLogger(fundamentosYcimentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            elementosComplementarios p = new elementosComplementarios(proyecto,usuarioActual,presupuestoTotal);
            p.setSize(613,530);
            p.setLocation(0,0);
            contentCerramientos.removeAll();
            contentCerramientos.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
            contentCerramientos.revalidate();
            contentCerramientos.repaint();
        }
    }//GEN-LAST:event_guardarButtomMouseClicked

    private void guardarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseEntered
        guardarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_guardarButtomMouseEntered

    private void guardarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarButtomMouseExited
        guardarButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_guardarButtomMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentCerramientos;
    private javax.swing.JPanel deshabilitarButtom1;
    private javax.swing.JPanel deshabilitarButtom2;
    private javax.swing.JPanel deshabilitarButtom3;
    private javax.swing.JLabel deshabilitarLabel1;
    private javax.swing.JLabel deshabilitarLabel2;
    private javax.swing.JLabel deshabilitarLabel3;
    private javax.swing.JPanel guardarButtom;
    private javax.swing.JPanel habilitarButtom1;
    private javax.swing.JPanel habilitarButtom2;
    private javax.swing.JPanel habilitarButtom3;
    private javax.swing.JLabel habilitarLabel1;
    private javax.swing.JLabel habilitarLabel2;
    private javax.swing.JLabel habilitarLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> materialBox1;
    private javax.swing.JComboBox<String> materialBox2;
    private javax.swing.JComboBox<String> materialBox3;
    private javax.swing.JLabel murosLabel;
    private javax.swing.JPanel precio1;
    private javax.swing.JLabel precio1Label;
    private javax.swing.JLabel precioLabel2;
    private javax.swing.JLabel precioLabel3;
    private javax.swing.JPanel precioPanel2;
    private javax.swing.JPanel precioPanel3;
    private javax.swing.JLabel puertasLabel;
    private javax.swing.JLabel ventanaLabel;
    // End of variables declaration//GEN-END:variables
}
