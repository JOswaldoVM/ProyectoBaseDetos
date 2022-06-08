/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica Martínez
 */
public class ModCliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public ModCliente() {
        initComponents();
        
        GpoBtn.add(btnEmpresarial);
        GpoBtn.add(btnNormal);
        jLabel15.setVisible(false);
        txtAsesor.setVisible(false);
        jLabel17.setVisible(false);
        ComboBoxPago.setVisible(false);
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GpoBtn = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTelCasa = new javax.swing.JTextField();
        txtTelCel = new javax.swing.JTextField();
        txtTelTrab = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtCol = new javax.swing.JTextField();
        txtCd = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        ComboBoxEstado = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtAsesor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnEmpresarial = new javax.swing.JRadioButton();
        btnNormal = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ComboBoxPago = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Cliente");

        jLabel1.setText("Cliente");

        jLabel2.setText("Id");

        jLabel3.setText("Nombres");

        jLabel4.setText("Telefono Casa");

        jLabel5.setText("Domicilio");

        jLabel6.setText("Datos Personales:");

        txtNombres.setEnabled(false);

        jLabel7.setText("Apellido Paterno");

        txtAP.setEnabled(false);

        jLabel8.setText("Apellido Materno");

        txtAM.setEnabled(false);

        jLabel9.setText("Telefono Celular");

        jLabel10.setText("Telefono Trabajo");

        txtTelCasa.setEnabled(false);

        txtTelCel.setEnabled(false);

        txtTelTrab.setEnabled(false);

        jLabel11.setText("Calle");

        jLabel12.setText("Colonia");

        jLabel13.setText("Ciudad");

        jLabel14.setText("Estado");

        txtCalle.setEnabled(false);

        txtCol.setEnabled(false);

        txtCd.setEnabled(false);

        ComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila ", "Colima", "Distrito Federal", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán ", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz e", "Yucatán", "Zacatecas", " " }));
        ComboBoxEstado.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel15.setText("Asesor");

        txtAsesor.setEnabled(false);

        jLabel16.setText("Tipo");

        btnEmpresarial.setText("Empresarial");
        btnEmpresarial.setEnabled(false);
        btnEmpresarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresarialActionPerformed(evt);
            }
        });

        btnNormal.setText("Normal");
        btnNormal.setEnabled(false);
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel17.setText("Plazo Pago");

        ComboBoxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1 mes", "2 meses", "3 meses ", "4 meses ", "5 meses ", "6 meses ", "7 meses ", "8 meses ", "9 meses ", "10 meses", "11 meses ", "1 año ", "2 años" }));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(191, 191, 191)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAsesor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addContainerGap(567, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEmpresarial)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(btnNormal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(btnBuscar)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel17))
                        .addGap(0, 48, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpresarial)
                    .addComponent(btnNormal)
                    .addComponent(jLabel16))
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String id = txtID.getText();
        String nom = txtNombres.getText();
        String AP = txtAP.getText();
        String AM = txtAM.getText();
        String casa = txtTelCasa.getText();
        String trabajo = txtTelTrab.getText();
        String cel = txtTelCel.getText();
        String calle = txtCalle.getText();
        String col = txtCol.getText();
        String cd = txtCd.getText();
        String edo = (String)ComboBoxEstado.getSelectedItem();
        String idAsesor = txtAsesor.getText();
        
        String plazoPago = (String)ComboBoxPago.getSelectedItem();
        boolean verNom = false, verAp = false, verAm = false, verCalle = false, verCol = false, 
                verCd = false, verAsesor = false;
        if(nom.isEmpty() || AP.isEmpty() || AM.isEmpty() || casa.isEmpty()
          || trabajo.isEmpty() || cel.isEmpty() || calle.isEmpty() || col.isEmpty() || cd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo o campos vacíos");
        } else {
            verNom = verificadorNombre(nom);
            verAp = verificadorAp(AP);
            verAm = verificadorAm(AM);
            verCalle = verificadorCalle(calle);
            verCol = verificadorCol(col);
            verCd = verificadorCd(cd);
            if(verNom == true && verAp == true && verAm == true&& verificadorCasa(casa)==true
            && verificadorTrabajo(trabajo)==true && verificadorCel(cel)==true && verCalle == true 
            && verCol == true && verCd== true) {
                try {
                    Connection con = Conexion.Entrar();
                    String insertar = "update Cliente set Nom = '" + nom +"',AP = '" + AP + "',AM= '" + AM +"',Casa= '" + casa + "',Cel = '" + cel + "',Trabajo = '" + trabajo + "',Calle = '" + calle + "',Col='" + col + "',Cd = '" + cd + "',Edo = '" + edo + "',PlazoPago = '" + plazoPago + "',IdAsesor = '" + idAsesor + "' where IdCliente = '" + txtID.getText() + "'";
                    PreparedStatement ps=con.prepareStatement(insertar);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Producto actualizado");
                    ps.close();
                    con.close();
                    this.dispose();
                    Opciones opc = new Opciones();
                    opc.setVisible(true);
                }catch (Exception e) {
                    System.out.println("Error." + e.getMessage());
                }               
            } else {
                JOptionPane.showMessageDialog(null, "Solo se aceptan letras en Nombres, Apellidos, Calle, Colonia, "
                        + "Ciudad y Asesor");
            }
           
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEmpresarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresarialActionPerformed
        jLabel15.setVisible(true);
        txtAsesor.setVisible(true);
        jLabel17.setVisible(true);
        ComboBoxPago.setVisible(true);
    }//GEN-LAST:event_btnEmpresarialActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        jLabel15.setVisible(false);
        txtAsesor.setVisible(false);
        jLabel17.setVisible(false);
        ComboBoxPago.setVisible(false);
        btnNormal = null;
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String comboEdo;
        String comboPago;
        try {
            Connection con = Conexion.Entrar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Cliente.nom,Cliente.AP,Cliente.AM,Casa,Cel,Trabajo,Calle,Col,Cliente.Cd,Edo,PlazoPago,Cliente.IdAsesor from Cliente,Asesor where IdCliente ='" +txtID.getText() +"' and Cliente.IdAsesor = Asesor.IdAsesor" );
            rs.next();
            txtNombres.setText(rs.getString(1));
            txtAP.setText(rs.getString(2));
            txtAM.setText(rs.getString(3));
            txtTelCasa.setText(rs.getString(4));
            txtTelCel.setText(rs.getString(5));
            txtTelTrab.setText(rs.getString(6));
            txtCalle.setText(rs.getString(7));
            txtCol.setText(rs.getString(8));
            txtCd.setText(rs.getString(9));
            comboEdo=rs.getString(10);
            comboPago=rs.getString(11);
            txtAsesor.setText(rs.getString(12));
            
            btnBuscar.setEnabled(false);
            txtID.setEditable(false);
            btnGuardar.setEnabled(true);
            btnNormal.setEnabled(true);
            btnEmpresarial.setEnabled(true);
            
            txtNombres.setEnabled(true);
            txtAP.setEnabled(true);
            txtAM.setEnabled(true);
            txtTelCasa.setEnabled(true);
            txtTelCel.setEnabled(true);
            txtTelTrab.setEnabled(true);
            txtCalle.setEnabled(true);
            txtCol.setEnabled(true);
            txtCd.setEnabled(true);
            ComboBoxEstado.setEnabled(true);
            ComboBoxPago.setEnabled(true);
            txtAsesor.setEnabled(true);
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Id no encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    public static boolean verificadorNombre(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    
    public static boolean verificadorAp(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    
    public static boolean verificadorAm(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    public static boolean verificadorCasa(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
         } catch (NumberFormatException nfe) {
            return false;
         }
    }
    public static boolean verificadorTrabajo(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
         } catch (NumberFormatException nfe) {
            return false;
         }
    }
    public static boolean verificadorCel(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
         } catch (NumberFormatException nfe) {
            return false;
         }
    }
    public static boolean verificadorCalle(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    public static boolean verificadorCol(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    public static boolean verificadorCd(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    public static boolean verificadorAsesor(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxEstado;
    private javax.swing.JComboBox<String> ComboBoxPago;
    private javax.swing.ButtonGroup GpoBtn;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnEmpresarial;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JRadioButton btnNormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtAsesor;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCd;
    private javax.swing.JTextField txtCol;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelCasa;
    private javax.swing.JTextField txtTelCel;
    private javax.swing.JTextField txtTelTrab;
    // End of variables declaration//GEN-END:variables
}