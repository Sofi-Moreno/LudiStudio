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
public class registroUsuario extends javax.swing.JPanel {
    Usuario usuarioActual;
    Controller controller;
    /**
     * Creates new form registoUsuario
     */
    public registroUsuario() {
        initComponents();
        controller = new Controller(userTxt,passTxt,nombreTxt,apellidoTxt,monedaBox,paisBox,institucionBox,carreraBox,this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        carreraLabel = new javax.swing.JLabel();
        monedaBox = new javax.swing.JComboBox<>();
        carreraBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        entrarButtom = new javax.swing.JPanel();
        entrarLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        userTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        institucionBox = new javax.swing.JComboBox<>();
        paisBox = new javax.swing.JComboBox<>();

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre");
        jPanel6.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        apellidoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        apellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidoLabel.setText("Apellido");
        jPanel6.add(apellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        usuarioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel.setText("Usuario");
        jPanel6.add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Moneda");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Institución");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        paisLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        paisLabel.setForeground(new java.awt.Color(255, 255, 255));
        paisLabel.setText("País");
        jPanel6.add(paisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        carreraLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        carreraLabel.setForeground(new java.awt.Color(255, 255, 255));
        carreraLabel.setText("Carrera");
        jPanel6.add(carreraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        monedaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Bolivares (Bs)", "Dolares ($)" }));
        monedaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaBoxActionPerformed(evt);
            }
        });
        jPanel6.add(monedaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 150, -1));

        carreraBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Ingenieria Civil", "Ingenieria Informatica", "Arquitectura" }));
        carreraBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraBoxActionPerformed(evt);
            }
        });
        jPanel6.add(carreraBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("Crea tu perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(tituloLabel)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(30, 30, 30))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 100));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 260, 250));

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
        entrarLabel.setText("REGISTRAR");

        javax.swing.GroupLayout entrarButtomLayout = new javax.swing.GroupLayout(entrarButtom);
        entrarButtom.setLayout(entrarButtomLayout);
        entrarButtomLayout.setHorizontalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entrarButtomLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(entrarLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        entrarButtomLayout.setVerticalGroup(
            entrarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entrarButtomLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(entrarLabel)
                .addGap(17, 17, 17))
        );

        jPanel6.add(entrarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 170, 60));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 340, 20));

        nombreTxt.setBackground(new java.awt.Color(0, 153, 153));
        nombreTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreTxt.setText("Ingrese su nombre (Primera letra en mayuscula)");
        nombreTxt.setToolTipText("");
        nombreTxt.setBorder(null);
        nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxtMousePressed(evt);
            }
        });
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        jPanel6.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, -1));

        apellidoTxt.setBackground(new java.awt.Color(0, 153, 153));
        apellidoTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(204, 204, 204));
        apellidoTxt.setText("Ingrese su apellido (Primera letra en mayuscula)");
        apellidoTxt.setToolTipText("");
        apellidoTxt.setBorder(null);
        apellidoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoTxtMousePressed(evt);
            }
        });
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        jPanel6.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, -1));

        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setText("Nombre de usuario (Usar un caracter !&$._*-  y Mayuscula )");
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
        jPanel6.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 350, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("(Usar un caracter !&$._*-  y una mayuscula )");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        passTxt.setBackground(new java.awt.Color(0, 153, 153));
        passTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("************");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        jPanel6.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 330, 20));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 320, 20));
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 320, 20));
        jPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 320, 20));

        institucionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "UCA", "UCAB", "PUCEM" }));
        institucionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institucionBoxActionPerformed(evt);
            }
        });
        jPanel6.add(institucionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 150, -1));

        paisBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Ecuador", "Venezuela", "El Salvador" }));
        paisBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisBoxActionPerformed(evt);
            }
        });
        jPanel6.add(paisBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseClicked
        usuarioActual=new Usuario();
        int salida = 0;
        try{
            do{
                switch (controller.validarNombreApellidoRegistro(usuarioActual,"nombre")){
                    case 1:
                        if (salida==0){
                            JOptionPane.showMessageDialog(null, "El nombre ingresado no cumple con el patron de iniciar "
                            + "con mayuscula y continuar con minuscula y no tienen el tamaño correcto (1-25).");
                            salida=1;
                            break;
                        }
                        break;                       
                    case 2:
                        if(salida==0){
                            JOptionPane.showMessageDialog(null, "El nombre ingresado no cumple con el patron de iniciar "
                            + "con mayuscula y continuar con minuscula.");
                            salida=1;
                            break;
                        }                   
                        break;
                    case 3:
                        if(salida==0){
                            JOptionPane.showMessageDialog(null, "El nombre ingresado no tiene el tamaño correcto (1-25)");
                            salida=1;
                            break;
                        }          
                        break;
                    default:
                        switch (controller.validarNombreApellidoRegistro(usuarioActual,"apellido")){
                            case 1:
                                if(salida==0){
                                   JOptionPane.showMessageDialog(null, "El apellido ingresado no cumple con el patron de iniciar "
                                    + "con mayuscula y continuar con minuscula y no tienen el tamaño correcto (1-25).");
                                   salida=1;
                                   break; 
                                }
                                break;
                            case 2:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El apellido ingresado no cumple con el patron de iniciar "
                                    + "con mayuscula y continuar con minuscula.");
                                    salida=1;
                                    break;
                                }     
                                break;
                            case 3:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El apellido ingresado no tiene el tamaño correcto (1-25).");
                                    salida=1;
                                    break;
                                }
                                break;
                                
                            default:   
                                switch(controller.validarUsuarioRegistro(usuarioActual)){
                                    case 1:
                                        if(salida==0){
                                           JOptionPane.showMessageDialog(null, "El usuario que esta ingresando ya existe, ingreselo nuevamente.");
                                           salida=1;
                                           break;
                                        }
                                        
                                        break;
                                    case 2:
                                        if(salida==0){
                                            JOptionPane.showMessageDialog(null, "El usuario no cumple con el patron de tener almenos una letra mayuscula, "
                                            + "almenos una letra minuscula y alguno de estos caracteres !&$._*- y no cumple con el tamaño "
                                            + "correcto (3-10).");
                                            salida=1;
                                            break;
                                        }
                                        break;
                                        
                                        //refrescar
                                    case 3:
                                        if(salida==0){
                                            JOptionPane.showMessageDialog(null, "El usuario no cumple con el patron de tener almenos una letra mayuscula, "
                                            + "almenos una letra minuscula y alguno de estos caracteres !&$._*-");
                                            salida=1;
                                            break;   
                                        }
                                        break; 
                                        
                                    case 4:
                                        if(salida==0){
                                            JOptionPane.showMessageDialog(null, "El usuario no cumple con el tamaño correcto (3-10).");
                                            salida=1;
                                            break;
                                        }
                                        break;
                                        
                                    default:
                                        switch(controller.validarContraseña(usuarioActual)){
                                            case 1:
                                                if(salida==0){
                                                    JOptionPane.showMessageDialog(null, "La contraseña que esta ingresando ya existe, ingresela nuevamente.");
                                                    salida=1;
                                                    break;
                                                }                                                
                                                break;
                                            case 2:
                                                if(salida==0){
                                                    JOptionPane.showMessageDialog(null, "La contraseña no cumple con el patron de tener almenos una letra mayuscula, "
                                                    + "almenos una letra minuscula, almenos un numero(0-9) y alguno de estos caracteres !&$._*- "
                                                    + "y no cumple con el tamaño correcto (3-10).");
                                                    //refrescar
                                                    salida=1;
                                                    break;
                                                }
                                                break;
                                                
                                            case 3:
                                                if(salida==0){
                                                    JOptionPane.showMessageDialog(null, "La contraseña no cumple con el patron de tener almenos una letra mayuscula, "
                                                    + "almenos una letra minuscula, almenos un numero(0-9) y alguno de estos caracteres !&$._*- ");
                                                    //refrescar
                                                    salida=1;
                                                    break;
                                                }
                                                break;
                                                
                                            case 4:
                                                if(salida==0){
                                                    JOptionPane.showMessageDialog(null, "La contraseña no cumple con el tamaño correcto (3-10).");
                                                    salida=1;
                                                    break;
                                                }
                                                break;
                                               
                                                
                                            default:
                                                controller.guardarRegistroDB(usuarioActual);
                                                JOptionPane.showMessageDialog(null, "El usuario ha sido registrado con exito.");
                                                MainMenu main = new MainMenu(usuarioActual);
                                                main.setVisible(true);
                                                this.setVisible(false);
                                                //decir ya se registro el usuario
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
            }while(controller.validarNombreApellidoRegistro(usuarioActual,"nombre")!=0 
                    || controller.validarNombreApellidoRegistro(usuarioActual,"apellido")!=0
                    || controller.validarUsuarioRegistro(usuarioActual)!=0
                    || controller.validarContraseña(usuarioActual)!=0);
        }catch(SQLException ex){
                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                
        }
    }//GEN-LAST:event_entrarButtomMouseClicked

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        if (nombreTxt.getText().equals("Ingrese su nombre (Primera letra en mayuscula)")){
            nombreTxt.setText("");
            nombreTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(new Color(204,204,204));
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Nombre de usuario (Usar un caracter !&$._*-  y Mayuscula )");
            userTxt.setForeground(new Color(204,204,204));
        }
        if (apellidoTxt.getText().isEmpty()){
            apellidoTxt.setText("Ingrese su apellido (Primera letra en mayuscula)");
            apellidoTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_nombreTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void apellidoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoTxtMousePressed
        if (apellidoTxt.getText().equals("Ingrese su apellido (Primera letra en mayuscula)")){
            apellidoTxt.setText("");
            apellidoTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(new Color(204,204,204));
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Nombre de usuario (Usar un caracter !&$._*-  y Mayuscula )");
            userTxt.setForeground(new Color(204,204,204));
        }
        if (nombreTxt.getText().isEmpty()){
            nombreTxt.setText("Ingrese su nombre (Primera letra en mayuscula)");
            nombreTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_apellidoTxtMousePressed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if (userTxt.getText().equals("Nombre de usuario (Usar un caracter !&$._*-  y Mayuscula )")){
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(new Color(204,204,204));
        }
        if (nombreTxt.getText().isEmpty()){
            nombreTxt.setText("Ingrese su nombre (Primera letra en mayuscula)");
            nombreTxt.setForeground(new Color(204,204,204));
        }
        if (apellidoTxt.getText().isEmpty()){
            apellidoTxt.setText("Ingrese su apellido (Primera letra en mayuscula)");
            apellidoTxt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("************")){
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (nombreTxt.getText().isEmpty()){
            nombreTxt.setText("Ingrese su nombre (Primera letra en mayuscula)");
            nombreTxt.setForeground(new Color(204,204,204));
        }
        if (apellidoTxt.getText().isEmpty()){
            apellidoTxt.setText("Ingrese su apellido (Primera letra en mayuscula)");
            apellidoTxt.setForeground(new Color(204,204,204));
        }
        if (userTxt.getText().isEmpty()){
            userTxt.setText("Nombre de usuario (Usar un caracter !&$._*-  y Mayuscula )");
            userTxt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_passTxtMousePressed

    private void monedaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedaBoxActionPerformed

    private void institucionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institucionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institucionBoxActionPerformed

    private void carreraBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carreraBoxActionPerformed

    private void paisBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisBoxActionPerformed

    private void entrarButtomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseEntered
        entrarButtom.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_entrarButtomMouseEntered

    private void entrarButtomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtomMouseExited
        entrarButtom.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_entrarButtomMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JComboBox<String> carreraBox;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JPanel entrarButtom;
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JComboBox<String> institucionBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> monedaBox;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> paisBox;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField userTxt;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
