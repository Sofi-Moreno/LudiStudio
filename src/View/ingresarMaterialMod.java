/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;
import Controller.ControlMateriales;
import Model.Material;
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
public class ingresarMaterialMod extends javax.swing.JPanel {
    ControlMateriales controller;
    Material nombreModi;
    Usuario usuarioActual;
    /**
     * Creates new form crearMateriales
     * @param user
     */
    public ingresarMaterialMod(Usuario user) {
        initComponents();
        usuarioActual = user;
        controller = new ControlMateriales(nombreMaterialTxt);
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
        contentModMaterial = new javax.swing.JPanel();
        ingresarButtom = new javax.swing.JPanel();
        ingresarLabel = new javax.swing.JLabel();
        nombreMaterialTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        panelTitle = new javax.swing.JPanel();
        tituloLabel1 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        contentModMaterial.setBackground(new java.awt.Color(0, 153, 153));
        contentModMaterial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarButtom.setBackground(new java.awt.Color(0, 102, 102));
        ingresarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarButtomMouseClicked(evt);
            }
        });

        ingresarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        ingresarLabel.setForeground(new java.awt.Color(255, 255, 255));
        ingresarLabel.setText("Ingresar");

        javax.swing.GroupLayout ingresarButtomLayout = new javax.swing.GroupLayout(ingresarButtom);
        ingresarButtom.setLayout(ingresarButtomLayout);
        ingresarButtomLayout.setHorizontalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarButtomLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ingresarLabel)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        ingresarButtomLayout.setVerticalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarButtomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresarLabel)
                .addGap(18, 18, 18))
        );

        contentModMaterial.add(ingresarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 130, 50));

        nombreMaterialTxt.setBackground(new java.awt.Color(0, 153, 153));
        nombreMaterialTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nombreMaterialTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreMaterialTxt.setText("Ingrese el nombre del material");
        nombreMaterialTxt.setToolTipText("");
        nombreMaterialTxt.setBorder(null);
        nombreMaterialTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMaterialTxtMousePressed(evt);
            }
        });
        nombreMaterialTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreMaterialTxtActionPerformed(evt);
            }
        });
        contentModMaterial.add(nombreMaterialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 229, -1));
        contentModMaterial.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 350, 20));

        panelTitle.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        tituloLabel1.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel1.setText("MODIFICAR MATERIAL");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(tituloLabel1)
                .addGap(180, 180, 180))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(tituloLabel1)
                .addGap(41, 41, 41))
        );

        contentModMaterial.add(panelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 630, -1));

        nombreLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Ingresa el nombre del material a modificar");
        nombreLabel.setToolTipText("");
        contentModMaterial.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modMateriales.png"))); // NOI18N
        contentModMaterial.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentModMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentModMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMaterialTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMaterialTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMaterialTxtActionPerformed

    private void nombreMaterialTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMaterialTxtMousePressed
        if (nombreMaterialTxt.getText().equals("Ingrese el nombre del material")){
            nombreMaterialTxt.setText("");
            nombreMaterialTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_nombreMaterialTxtMousePressed

    private void ingresarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseClicked
        nombreModi= new Material();
        int salida = 0;
        try{
            do{
                switch (controller.validarNombreModi(nombreModi)){
                    case 1:
                        if (salida==0){
                            JOptionPane.showMessageDialog(null, "El material ingresado no existe por favor ingrese otro nombre.");
                            salida=1;
                            break;
                        }
                        break;                       
                    case 2:
                        if(salida==0){
                            JOptionPane.showMessageDialog(null, "El nombre cuenta con caracteres no validos y no posee la "
                                    + "longitud correcta (3-25 caracteres)");
                            salida=1;
                            break;
                        }                   
                        break;
                    case 3:
                        if(salida==0){
                            JOptionPane.showMessageDialog(null, "El nombre cuenta con caracteres no validos.");
                            salida=1;
                            break;
                        }          
                        break;
                    case 4:
                        if(salida==0){
                            JOptionPane.showMessageDialog(null, "El nombre no posee longitud correcta (3-25 caracteres)");
                            salida=1;
                            break;
                        }          
                        break;
                    default:
                    }    
                }while(controller.validarNombreModi(nombreModi)!=0);
        }catch(SQLException ex){
                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);      
        }
        modificarMateriales p2 = new modificarMateriales(usuarioActual,nombreModi);
        p2.setSize(617,530);
        p2.setLocation(0,0);
        
        contentModMaterial.removeAll();
        contentModMaterial.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contentModMaterial.revalidate();
        contentModMaterial.repaint();
    }//GEN-LAST:event_ingresarButtomMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentModMaterial;
    private javax.swing.JPanel ingresarButtom;
    private javax.swing.JLabel ingresarLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreMaterialTxt;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel tituloLabel1;
    // End of variables declaration//GEN-END:variables
}
