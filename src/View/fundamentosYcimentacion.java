/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ControllerProyec;
import Model.Material;
import Model.Proyecto;
import Model.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Riarb
 */
public class fundamentosYcimentacion extends javax.swing.JPanel {
    boolean zap, mur;
    ControllerProyec controller;
    Usuario usuarioActual;
    Proyecto proyecto;
    List<Material> materiales;
    List<Material> proyec;
    List<Material> escogido;
    String operacion;

    /**
     * Creates new form fundamentosYcimentacion
     */
    public fundamentosYcimentacion(Proyecto proyecto,List<Material> proyec, Usuario usuario,List<Material> mat, String operacion) {
        initComponents();
        controller=new ControllerProyec(this);
        this.proyecto = proyecto;
        this.proyec = proyec;
        usuarioActual=usuario;
        materiales = mat;
        controller.llenarBoxMateriales(materialBox1, mat);
        controller.llenarBoxMateriales(materialBox2, mat);
        this.operacion=operacion;
        zap=true;
        mur=true;
    }
    
    public fundamentosYcimentacion(Proyecto proyecto,List<Material> proyec, Usuario usuario,List<Material> mat,List<Material> escogido, String operacion) {
        initComponents();
        controller=new ControllerProyec(this);
        this.proyecto = proyecto;
        this.proyec = proyec;
        this.escogido = escogido;
        usuarioActual=usuario;
        materiales = mat;
        controller.llenarBoxMateriales(materialBox1, mat);
        controller.llenarBoxMateriales(materialBox2, mat);
        this.operacion=operacion;
        zap=true;
        mur=true;
        if(escogido.get(0)!=null){
            materialBox1.setSelectedItem(escogido.get(0).getNombreMaterial());
        }
        if(escogido.get(1)!=null){
            materialBox2.setSelectedItem(escogido.get(1).getNombreMaterial());
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

        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        contentFundamentos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deshabilitarButtom1 = new javax.swing.JPanel();
        deshabilitarLabel1 = new javax.swing.JLabel();
        habilitarButtom1 = new javax.swing.JPanel();
        habilitarLabel1 = new javax.swing.JLabel();
        materialBox1 = new javax.swing.JComboBox<>();
        habilitarButtom2 = new javax.swing.JPanel();
        habilitarLabel2 = new javax.swing.JLabel();
        deshabilitarButtom2 = new javax.swing.JPanel();
        deshabilitarLabel2 = new javax.swing.JLabel();
        materialBox2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        zapataLabel = new javax.swing.JLabel();
        murosLabel = new javax.swing.JLabel();
        guardarButtom = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        contentFundamentos.setBackground(new java.awt.Color(0, 153, 153));
        contentFundamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNDAMENTOS Y CIMENTACIÓN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );

        contentFundamentos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 613, -1));

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

        contentFundamentos.add(deshabilitarButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 194, -1, -1));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        habilitarButtom1Layout.setVerticalGroup(
            habilitarButtom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(habilitarButtom1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(habilitarLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentFundamentos.add(habilitarButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 153, 141, -1));

        materialBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material" }));
        materialBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialBox1MouseClicked(evt);
            }
        });
        materialBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialBox1ActionPerformed(evt);
            }
        });
        contentFundamentos.add(materialBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 209, -1, -1));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        habilitarButtom2Layout.setVerticalGroup(
            habilitarButtom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, habilitarButtom2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(habilitarLabel2)
                .addContainerGap())
        );

        contentFundamentos.add(habilitarButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 277, 136, -1));

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
            .addGroup(deshabilitarButtom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deshabilitarLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentFundamentos.add(deshabilitarButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 315, -1, -1));

        materialBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material" }));
        materialBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialBox2MouseClicked(evt);
            }
        });
        contentFundamentos.add(materialBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 367, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        contentFundamentos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 261, 613, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        contentFundamentos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 402, 601, 12));

        zapataLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        zapataLabel.setForeground(new java.awt.Color(255, 255, 255));
        zapataLabel.setText("Zapata");
        contentFundamentos.add(zapataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 151, 174, -1));

        murosLabel.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        murosLabel.setForeground(new java.awt.Color(255, 255, 255));
        murosLabel.setText("Muros de Contención");
        contentFundamentos.add(murosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 294, -1, -1));

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
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(48, 48, 48))
        );
        guardarButtomLayout.setVerticalGroup(
            guardarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarButtomLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        contentFundamentos.add(guardarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentFundamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentFundamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void materialBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialBox1ActionPerformed

    private void deshabilitarButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom1MouseClicked
        habilitarButtom1.setEnabled(true);
        habilitarLabel1.setEnabled(true);
        deshabilitarButtom1.setEnabled(false);
        deshabilitarLabel1.setEnabled(false);
        zapataLabel.setEnabled(false);
        materialBox1.setEnabled(false);
        zap=false;
    }//GEN-LAST:event_deshabilitarButtom1MouseClicked

    private void habilitarButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom1MouseClicked
        habilitarButtom1.setEnabled(false);
        habilitarLabel1.setEnabled(false);
        deshabilitarButtom1.setEnabled(true);
        deshabilitarLabel1.setEnabled(true);
        zapataLabel.setEnabled(true);
        materialBox1.setEnabled(true);
        zap=true;
    }//GEN-LAST:event_habilitarButtom1MouseClicked

    private void habilitarButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom1MouseEntered
        habilitarButtom1.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_habilitarButtom1MouseEntered

    private void habilitarButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom1MouseExited
        habilitarButtom1.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_habilitarButtom1MouseExited

    private void deshabilitarButtom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom1MouseEntered
        deshabilitarButtom1.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_deshabilitarButtom1MouseEntered

    private void deshabilitarButtom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom1MouseExited
        deshabilitarButtom1.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_deshabilitarButtom1MouseExited

    private void habilitarButtom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom2MouseClicked
        habilitarButtom2.setEnabled(false);
        habilitarLabel2.setEnabled(false);
        deshabilitarButtom2.setEnabled(true);
        deshabilitarLabel2.setEnabled(true);
        murosLabel.setEnabled(true);
        materialBox2.setEnabled(true);
        mur=true;
    }//GEN-LAST:event_habilitarButtom2MouseClicked

    private void deshabilitarButtom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshabilitarButtom2MouseClicked
        habilitarButtom2.setEnabled(true);
        habilitarLabel2.setEnabled(true);
        deshabilitarButtom2.setEnabled(false);
        deshabilitarLabel2.setEnabled(false);
        murosLabel.setEnabled(false);
        materialBox2.setEnabled(false);
        mur=false;
    }//GEN-LAST:event_deshabilitarButtom2MouseClicked

    private void habilitarButtom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom2MouseEntered
        habilitarButtom2.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_habilitarButtom2MouseEntered

    private void habilitarButtom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_habilitarButtom2MouseExited
        habilitarButtom2.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_habilitarButtom2MouseExited

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
        if(zap && materialBox1.getSelectedItem().equals("Material")){
            JOptionPane.showMessageDialog(null, "La parte llamada 'Zapata' esta habilitada y no has escogido un material para ella.");
        }else if(mur && materialBox2.getSelectedItem().equals("Material")){
            JOptionPane.showMessageDialog(null, "La parte llamada 'Muros de Contención' esta habilitada y no has escogido un material para ella.");
        }else{
                if(zap && !materialBox1.getSelectedItem().equals("Material")){
                    controller.guardarMateriales(proyecto, materialBox1, proyec, materiales);
                }
                else{
                    proyec.add(null);
                }
                if(mur && !materialBox2.getSelectedItem().equals("Material")){
                    controller.guardarMateriales(proyecto, materialBox2, proyec, materiales);
                }
                else{
                    proyec.add(null);
                }
            Estructura p3 =null;
            if(operacion == "Crear"){
                p3 = new Estructura(proyecto,proyec,usuarioActual,materiales,operacion);
            }else if(operacion == "Modificar"){
                p3 = new Estructura(proyecto,proyec,usuarioActual,materiales,escogido,operacion);
            }
            p3.setSize(613,530);
            p3.setLocation(0,0);
            contentFundamentos.removeAll();
            contentFundamentos.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
            contentFundamentos.revalidate();
            contentFundamentos.repaint();
        }
    }//GEN-LAST:event_guardarButtomMouseClicked

    private void materialBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialBox1MouseClicked
     
    }//GEN-LAST:event_materialBox1MouseClicked

    private void materialBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialBox2MouseClicked
     
    }//GEN-LAST:event_materialBox2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentFundamentos;
    private javax.swing.JPanel deshabilitarButtom1;
    private javax.swing.JPanel deshabilitarButtom2;
    private javax.swing.JLabel deshabilitarLabel1;
    private javax.swing.JLabel deshabilitarLabel2;
    private javax.swing.JPanel guardarButtom;
    private javax.swing.JPanel habilitarButtom1;
    private javax.swing.JPanel habilitarButtom2;
    private javax.swing.JLabel habilitarLabel1;
    private javax.swing.JLabel habilitarLabel2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> materialBox1;
    private javax.swing.JComboBox<String> materialBox2;
    private javax.swing.JLabel murosLabel;
    private javax.swing.JLabel zapataLabel;
    // End of variables declaration//GEN-END:variables
}
