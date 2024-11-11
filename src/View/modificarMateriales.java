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
 * @author Riarb
 */
public class modificarMateriales extends javax.swing.JPanel {
    ControlMateriales controller;
    Material materiales;
    Usuario usuarioActual;
    /**
     * Creates new form crearMateriales
     * @param user
     * @param nombreModi
     */
    public modificarMateriales(Usuario user,Material nombreModi) {
        initComponents();
        materiales = nombreModi;
        usuarioActual = user;
        controller = new ControlMateriales(rubroTxt, nombreMaterialTxt, cantidadTxt, costoMaterialTxt, nombreProveedorTxt, transporteTxt, costoManoTxt, costoHerramientaTxt, unidadesBox, SustentabilidadBox, ManoDeObraBox, transporteBox, herramientasBox, this);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentSelectorMateriales = new javax.swing.JPanel();
        ingresarButtom = new javax.swing.JPanel();
        ingresarLabel = new javax.swing.JLabel();
        nombreMaterialTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        panelTitle = new javax.swing.JPanel();
        tituloLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreLabel = new javax.swing.JLabel();
        rubroLabel = new javax.swing.JLabel();
        rubroTxt = new javax.swing.JTextField();
        cantidadLabel = new javax.swing.JLabel();
        costoMaterialTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        costoLabel = new javax.swing.JLabel();
        cantidadTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        nombreProveedorLabel = new javax.swing.JLabel();
        nombreProveedorTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        costoTansporteLabel = new javax.swing.JLabel();
        transporteTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        costoManoLabel = new javax.swing.JLabel();
        costoManoTxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        costoHerramientaLabel = new javax.swing.JLabel();
        costoHerramientaTxt = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        unidadesBox = new javax.swing.JComboBox<>();
        SustentabilidadBox = new javax.swing.JComboBox<>();
        transporteBox = new javax.swing.JComboBox<>();
        ManoDeObraBox = new javax.swing.JComboBox<>();
        herramientasBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 204));

        contentSelectorMateriales.setBackground(new java.awt.Color(0, 153, 153));
        contentSelectorMateriales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarButtom.setBackground(new java.awt.Color(0, 102, 102));
        ingresarButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarButtomMouseClicked(evt);
            }
        });

        ingresarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        ingresarLabel.setForeground(new java.awt.Color(255, 255, 255));
        ingresarLabel.setText("Modificar");

        javax.swing.GroupLayout ingresarButtomLayout = new javax.swing.GroupLayout(ingresarButtom);
        ingresarButtom.setLayout(ingresarButtomLayout);
        ingresarButtomLayout.setHorizontalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarButtomLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ingresarLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        ingresarButtomLayout.setVerticalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarButtomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresarLabel)
                .addGap(18, 18, 18))
        );

        contentSelectorMateriales.add(ingresarButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 130, 50));

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
        contentSelectorMateriales.add(nombreMaterialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 181, 229, -1));
        contentSelectorMateriales.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 203, 229, 20));

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

        contentSelectorMateriales.add(panelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 630, -1));
        contentSelectorMateriales.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 282, 229, 20));

        nombreLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre");
        nombreLabel.setToolTipText("");
        contentSelectorMateriales.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 150, -1, -1));

        rubroLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rubroLabel.setForeground(new java.awt.Color(255, 255, 255));
        rubroLabel.setText("Rubro");
        rubroLabel.setToolTipText("");
        contentSelectorMateriales.add(rubroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 229, -1, -1));

        rubroTxt.setBackground(new java.awt.Color(0, 153, 153));
        rubroTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        rubroTxt.setForeground(new java.awt.Color(204, 204, 204));
        rubroTxt.setText("Ingrese el rubro del material");
        rubroTxt.setToolTipText("");
        rubroTxt.setBorder(null);
        rubroTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rubroTxtMousePressed(evt);
            }
        });
        rubroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubroTxtActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(rubroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 260, 229, -1));

        cantidadLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        cantidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadLabel.setText("Cantidad");
        cantidadLabel.setToolTipText("");
        contentSelectorMateriales.add(cantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 308, -1, -1));

        costoMaterialTxt.setBackground(new java.awt.Color(0, 153, 153));
        costoMaterialTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        costoMaterialTxt.setForeground(new java.awt.Color(204, 204, 204));
        costoMaterialTxt.setText("Ingrese el costo material");
        costoMaterialTxt.setToolTipText("");
        costoMaterialTxt.setBorder(null);
        costoMaterialTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                costoMaterialTxtMousePressed(evt);
            }
        });
        costoMaterialTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoMaterialTxtActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(costoMaterialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 421, 144, -1));
        contentSelectorMateriales.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 361, 229, 20));

        costoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoLabel.setText("Costo Material");
        costoLabel.setToolTipText("");
        contentSelectorMateriales.add(costoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 387, -1, -1));

        cantidadTxt.setBackground(new java.awt.Color(0, 153, 153));
        cantidadTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cantidadTxt.setForeground(new java.awt.Color(204, 204, 204));
        cantidadTxt.setText("Ingrese la cantidad de material");
        cantidadTxt.setToolTipText("");
        cantidadTxt.setBorder(null);
        cantidadTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cantidadTxtMousePressed(evt);
            }
        });
        cantidadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTxtActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(cantidadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 339, 229, -1));
        contentSelectorMateriales.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 446, 133, 20));

        nombreProveedorLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombreProveedorLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreProveedorLabel.setText("Nombre Proveedor");
        nombreProveedorLabel.setToolTipText("");
        contentSelectorMateriales.add(nombreProveedorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 150, -1, -1));

        nombreProveedorTxt.setBackground(new java.awt.Color(0, 153, 153));
        nombreProveedorTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        nombreProveedorTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreProveedorTxt.setText("Ingrese el nombre del proveedor ");
        nombreProveedorTxt.setToolTipText("");
        nombreProveedorTxt.setBorder(null);
        nombreProveedorTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreProveedorTxtMousePressed(evt);
            }
        });
        nombreProveedorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProveedorTxtActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(nombreProveedorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 181, 238, -1));
        contentSelectorMateriales.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 446, 196, 20));

        costoTansporteLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoTansporteLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoTansporteLabel.setText("Costo Transporte");
        costoTansporteLabel.setToolTipText("");
        contentSelectorMateriales.add(costoTansporteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 229, -1, -1));

        transporteTxt.setBackground(new java.awt.Color(0, 153, 153));
        transporteTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        transporteTxt.setForeground(new java.awt.Color(204, 204, 204));
        transporteTxt.setText("Ingrese el costo del transporte");
        transporteTxt.setToolTipText("");
        transporteTxt.setBorder(null);
        transporteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transporteTxtMousePressed(evt);
            }
        });
        transporteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transporteTxtActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(transporteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 260, 178, -1));
        contentSelectorMateriales.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 203, 181, 20));

        costoManoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoManoLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoManoLabel.setText("Costo Mano de Obra");
        costoManoLabel.setToolTipText("");
        contentSelectorMateriales.add(costoManoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 308, -1, -1));

        costoManoTxt.setBackground(new java.awt.Color(0, 153, 153));
        costoManoTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        costoManoTxt.setForeground(new java.awt.Color(204, 204, 204));
        costoManoTxt.setText("Ingrese el costo de la mano de obra");
        costoManoTxt.setToolTipText("");
        costoManoTxt.setBorder(null);
        costoManoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                costoManoTxtMousePressed(evt);
            }
        });
        costoManoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoManoTxtActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(costoManoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 339, 316, -1));
        contentSelectorMateriales.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 282, 178, 20));

        costoHerramientaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoHerramientaLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoHerramientaLabel.setText("Costo Herramientas");
        costoHerramientaLabel.setToolTipText("");
        contentSelectorMateriales.add(costoHerramientaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 387, -1, -1));

        costoHerramientaTxt.setBackground(new java.awt.Color(0, 153, 153));
        costoHerramientaTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        costoHerramientaTxt.setForeground(new java.awt.Color(204, 204, 204));
        costoHerramientaTxt.setText("Ingrese el costo de herramientas");
        costoHerramientaTxt.setToolTipText("");
        costoHerramientaTxt.setBorder(null);
        costoHerramientaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                costoHerramientaTxtMousePressed(evt);
            }
        });
        costoHerramientaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoHerramientaTxtActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(costoHerramientaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 421, 316, -1));
        contentSelectorMateriales.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 361, 200, 20));

        unidadesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidades" }));
        unidadesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesBoxActionPerformed(evt);
            }
        });
        contentSelectorMateriales.add(unidadesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 418, -1, -1));

        SustentabilidadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sustentabilidad", "Item 2", "Item 3", "Item 4" }));
        contentSelectorMateriales.add(SustentabilidadBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 153, -1, -1));

        transporteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transporte", "Item 2", "Item 3", "Item 4" }));
        contentSelectorMateriales.add(transporteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 232, -1, -1));

        ManoDeObraBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mano de obra", "Item 2", "Item 3", "Item 4" }));
        contentSelectorMateriales.add(ManoDeObraBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 311, -1, -1));

        herramientasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herramientas", "Item 2", "Item 3", "Item 4" }));
        contentSelectorMateriales.add(herramientasBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentSelectorMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentSelectorMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseClicked
        int salida = 0;
        try{
            do{
                switch (controller.validarMaterialNombre(materiales)){
                    case 1:
                        if (salida==0){
                            JOptionPane.showMessageDialog(null, "El material ingresado ya existe por favor ingrese otro nombre.");
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
                        switch (controller.validarRubroProveedorRegistro(materiales,"rubro_material")){
                            case 1:
                                if(salida==0){
                                   JOptionPane.showMessageDialog(null, "El rubro ingresado no cumple con el patron de iniciar "
                                    + "con mayuscula y continuar con minuscula y no tiene el tamaño correcto (1-25). Ingresar una sola palabra.");
                                   salida=1;
                                   break; 
                                }
                                break;
                            case 2:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El rubro ingresado no cumple con el patron de iniciar "
                                    + "con mayuscula y continuar con minuscula. Ingresar una sola palabra.");
                                    salida=1;
                                    break;
                                }     
                                break;
                            case 3:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El rubro ingresado no tiene el tamaño correcto (1-25).");
                                    salida=1;
                                    break;
                                }
                                break;
                                
                            default:   
                                switch (controller.validarRubroProveedorRegistro(materiales,"proveedor_material")){
                                    case 1:
                                        if(salida==0){
                                           JOptionPane.showMessageDialog(null, "El proveedor ingresado no cumple con el patron de iniciar "
                                            + "con mayuscula y continuar con minuscula y no tiene el tamaño correcto (1-25). Ingresar una sola palabra.");
                                           salida=1;
                                           break; 
                                        }
                                        break;
                                    case 2:
                                        if(salida==0){
                                            JOptionPane.showMessageDialog(null, "El proveedor ingresado no cumple con el patron de iniciar "
                                            + "con mayuscula y continuar con minuscula. Ingresar una sola palabra.");
                                            salida=1;
                                            break;
                                        }     
                                        break;
                                    case 3:
                                        if(salida==0){
                                            JOptionPane.showMessageDialog(null, "El proveedor ingresado no tiene el tamaño correcto (1-25).");
                                            salida=1;
                                            break;
                                        }
                                        break;
                            default:
                                //costo de material
                                switch(controller.validarCostos(materiales,"costo_material")){
                                    case 1:
                                        if(salida==0){
                                           JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero y su longitud es incorrecta (1-4 digitos)");
                                           salida=1;
                                           break;
                                        }
                                        
                                        break;
                                    case 2:
                                        if(salida==0){
                                            JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero");
                                            salida=1;
                                            break;
                                        }
                                        break;
                                    case 3:
                                        if(salida==0){
                                            JOptionPane.showMessageDialog(null, "El costo ingresado no posee la longitud correcta (1-4 digitos)");
                                            salida=1;
                                            break;   
                                        }
                                        break;    
                            default:
                                //cantidad de material
                                switch(controller.validarCostos(materiales,"cantidad_material")){
                            case 1:
                                if(salida==0){
                                   JOptionPane.showMessageDialog(null, "La cantidad ingresada no es un numero y su longitud es incorrecta (1-4 digitos)");
                                   salida=1;
                                   break;
                                }

                                break;
                            case 2:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "La cantidad ingresada no es un numero");
                                    salida=1;
                                    break;
                                }
                                break;
                            case 3:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "La cantidad ingresada no posee la longitud correcta (1-4 digitos)");
                                    salida=1;
                                    break;   
                                }
                                break;    
                            default:
                                //costo mano de obra
                                switch(controller.validarCostos(materiales,"costo_manodeobra")){
                            case 1:
                                if(salida==0){
                                   JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero y su longitud es incorrecta (1-4 digitos)");
                                   salida=1;
                                   break;
                                }

                                break;
                            case 2:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero");
                                    salida=1;
                                    break;
                                }
                                break;
                            case 3:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El costo ingresado no posee la longitud correcta (1-4 digitos)");
                                    salida=1;
                                    break;   
                                }
                                break;    
                            default:
                                //costo de herramientas
                        switch(controller.validarCostos(materiales,"costo_herramientas")){
                            case 1:
                                if(salida==0){
                                   JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero y su longitud es incorrecta (1-4 digitos)");
                                   salida=1;
                                   break;
                                }

                                break;
                            case 2:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero");
                                    salida=1;
                                    break;
                                }
                                break;
                            case 3:
                                if(salida==0){
                                    JOptionPane.showMessageDialog(null, "El costo ingresado no posee la longitud correcta (1-4 digitos)");
                                    salida=1;
                                    break;   
                                }
                                break;    
                            default:
                                    //costo de transporte
                            switch(controller.validarCostos(materiales,"costo_transporte")){
                                case 1:
                                    if(salida==0){
                                       JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero y su longitud es incorrecta (1-4 digitos)");
                                       salida=1;
                                       break;
                                    }
                                    break;
                                case 2:
                                    if(salida==0){
                                        JOptionPane.showMessageDialog(null, "El costo ingresado no es un numero");
                                        salida=1;
                                        break;
                                    }
                                    break;
                                case 3:
                                    if(salida==0){
                                        JOptionPane.showMessageDialog(null, "El costo ingresado no posee la longitud correcta (1-4 digitos)");
                                        salida=1;
                                        break;   
                                    }
                                    break;    
                                    default:   
                                        controller.modificarMaterial(materiales);
                                        JOptionPane.showMessageDialog(null, "El material ha sido modificado con exito.");
                                        MainMenu main = new MainMenu(usuarioActual);
                                        main.setVisible(true);
                                        this.setVisible(false);
                                        break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
            }
            }
            }
            }
            }while(controller.validarMaterialNombre(materiales)!=0 
                    || (controller.validarRubroProveedorRegistro(materiales,"rubro_material"))!=0
                    || (controller.validarRubroProveedorRegistro(materiales,"proveedor_material"))!=0
                    || (controller.validarCostos(materiales,"costo_material"))!=0
                    || (controller.validarCostos(materiales,"cantidad_material"))!=0
                    || (controller.validarCostos(materiales,"costo_manodeobra"))!=0
                    || (controller.validarCostos(materiales,"costo_herramientas"))!=0
                    || (controller.validarCostos(materiales,"costo_transporte"))!=0);
        }catch(SQLException ex){
                Logger.getLogger(inicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                
        }
    }//GEN-LAST:event_ingresarButtomMouseClicked

    private void nombreMaterialTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMaterialTxtMousePressed
        if (nombreMaterialTxt.getText().equals("Ingrese el nombre del material")){
            nombreMaterialTxt.setText("");
            nombreMaterialTxt.setForeground(Color.black);
        }

    }//GEN-LAST:event_nombreMaterialTxtMousePressed

    private void nombreMaterialTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMaterialTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMaterialTxtActionPerformed

    private void rubroTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rubroTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rubroTxtMousePressed

    private void rubroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rubroTxtActionPerformed

    private void costoMaterialTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costoMaterialTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoMaterialTxtMousePressed

    private void costoMaterialTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoMaterialTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoMaterialTxtActionPerformed

    private void cantidadTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTxtMousePressed

    private void cantidadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTxtActionPerformed

    private void nombreProveedorTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreProveedorTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProveedorTxtMousePressed

    private void nombreProveedorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProveedorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProveedorTxtActionPerformed

    private void transporteTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transporteTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_transporteTxtMousePressed

    private void transporteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transporteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transporteTxtActionPerformed

    private void costoManoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costoManoTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoManoTxtMousePressed

    private void costoManoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoManoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoManoTxtActionPerformed

    private void costoHerramientaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costoHerramientaTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoHerramientaTxtMousePressed

    private void costoHerramientaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoHerramientaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoHerramientaTxtActionPerformed

    private void unidadesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ManoDeObraBox;
    private javax.swing.JComboBox<String> SustentabilidadBox;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JPanel contentSelectorMateriales;
    private javax.swing.JLabel costoHerramientaLabel;
    private javax.swing.JTextField costoHerramientaTxt;
    private javax.swing.JLabel costoLabel;
    private javax.swing.JLabel costoManoLabel;
    private javax.swing.JTextField costoManoTxt;
    private javax.swing.JTextField costoMaterialTxt;
    private javax.swing.JLabel costoTansporteLabel;
    private javax.swing.JComboBox<String> herramientasBox;
    private javax.swing.JPanel ingresarButtom;
    private javax.swing.JLabel ingresarLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreMaterialTxt;
    private javax.swing.JLabel nombreProveedorLabel;
    private javax.swing.JTextField nombreProveedorTxt;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel rubroLabel;
    private javax.swing.JTextField rubroTxt;
    private javax.swing.JLabel tituloLabel1;
    private javax.swing.JComboBox<String> transporteBox;
    private javax.swing.JTextField transporteTxt;
    private javax.swing.JComboBox<String> unidadesBox;
    // End of variables declaration//GEN-END:variables
}
