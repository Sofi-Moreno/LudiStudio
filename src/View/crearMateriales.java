/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author Riarb
 */
public class crearMateriales extends javax.swing.JPanel {

    /**
     * Creates new form crearMateriales
     */
    public crearMateriales() {
        initComponents();
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

        contentSelectorMateriales.setBackground(new java.awt.Color(0, 153, 153));

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
                .addGap(23, 23, 23)
                .addComponent(ingresarLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ingresarButtomLayout.setVerticalGroup(
            ingresarButtomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarButtomLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(ingresarLabel)
                .addGap(18, 18, 18))
        );

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

        panelTitle.setBackground(new java.awt.Color(0, 102, 102));

        tituloLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        tituloLabel1.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel1.setText("AGREGAR NUEVO MATERIAL");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(tituloLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitleLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(tituloLabel1)
                .addGap(37, 37, 37))
        );

        nombreLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre");
        nombreLabel.setToolTipText("");

        rubroLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rubroLabel.setForeground(new java.awt.Color(255, 255, 255));
        rubroLabel.setText("Rubro");
        rubroLabel.setToolTipText("");

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

        cantidadLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        cantidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadLabel.setText("Cantidad");
        cantidadLabel.setToolTipText("");

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

        costoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoLabel.setText("Costo Material");
        costoLabel.setToolTipText("");

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

        nombreProveedorLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombreProveedorLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreProveedorLabel.setText("Nombre Proveedor");
        nombreProveedorLabel.setToolTipText("");

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

        costoTansporteLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoTansporteLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoTansporteLabel.setText("Costo Transporte");
        costoTansporteLabel.setToolTipText("");

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

        costoManoLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoManoLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoManoLabel.setText("Costo Mano de Obra");
        costoManoLabel.setToolTipText("");

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

        costoHerramientaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        costoHerramientaLabel.setForeground(new java.awt.Color(255, 255, 255));
        costoHerramientaLabel.setText("Costo Herramientas");
        costoHerramientaLabel.setToolTipText("");

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

        unidadesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidades" }));
        unidadesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesBoxActionPerformed(evt);
            }
        });

        SustentabilidadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sustentabilidad", "Item 2", "Item 3", "Item 4" }));

        transporteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transporte", "Item 2", "Item 3", "Item 4" }));

        ManoDeObraBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mano de obra", "Item 2", "Item 3", "Item 4" }));

        herramientasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herramientas", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout contentSelectorMaterialesLayout = new javax.swing.GroupLayout(contentSelectorMateriales);
        contentSelectorMateriales.setLayout(contentSelectorMaterialesLayout);
        contentSelectorMaterialesLayout.setHorizontalGroup(
            contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                        .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costoLabel)
                            .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rubroTxt)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidadLabel)
                                    .addComponent(rubroLabel)
                                    .addComponent(nombreLabel)
                                    .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombreMaterialTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator2)))
                                .addComponent(jSeparator3)
                                .addComponent(cantidadTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                        .addComponent(costoMaterialTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidadesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                        .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                                .addComponent(nombreProveedorTxt)
                                .addGap(78, 78, 78))
                            .addComponent(costoManoTxt)
                            .addComponent(costoHerramientaTxt)
                            .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transporteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                                        .addComponent(costoTansporteLabel)
                                        .addGap(49, 49, 49)
                                        .addComponent(transporteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                        .addComponent(nombreProveedorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SustentabilidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                        .addComponent(costoManoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ManoDeObraBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                        .addComponent(costoHerramientaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(herramientasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentSelectorMaterialesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        contentSelectorMaterialesLayout.setVerticalGroup(
            contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentSelectorMaterialesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreProveedorLabel)
                    .addComponent(SustentabilidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreMaterialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProveedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rubroLabel)
                    .addComponent(costoTansporteLabel)
                    .addComponent(transporteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rubroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transporteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadLabel)
                    .addComponent(costoManoLabel)
                    .addComponent(ManoDeObraBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoManoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentSelectorMaterialesLayout.createSequentialGroup()
                        .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costoLabel)
                            .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(costoHerramientaLabel)
                                .addComponent(herramientasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentSelectorMaterialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costoMaterialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costoHerramientaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidadesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresarButtom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentSelectorMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentSelectorMateriales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtomMouseClicked
       
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
