/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author Veronica Martínez
 */
public class AltaProducto extends javax.swing.JFrame {

    
    
    void registrar() {
        
    }
    /**
     * Creates new form Producto
     */
    public AltaProducto() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCaducidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtExist = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Producto");

        jLabel1.setText("Producto");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Caducidad:");

        jLabel6.setText("Id:");

        jLabel7.setText("Precio:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setText("Existencia");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtNombre)
                            .addComponent(txtMarca)
                            .addComponent(txtTipo)
                            .addComponent(txtCaducidad, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtPrecio)
                            .addComponent(txtExist)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))
                            .addComponent(jLabel1))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtExist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String id = txtId.getText();
        String nombre_P = txtNombre.getText();
        String marca = txtMarca.getText();
        String tipo = txtTipo.getText();
        String caducidad = txtCaducidad.getText();
        String precio = txtPrecio.getText();
        String existencia = txtExist.getText();
        //Convertirlos para mandarlos
        
        boolean verNombre = false, verMarca = false, verTipo = false; 
        //faltan mas if solo para pruebas es esto
        
        if(id.isEmpty() || nombre_P.isEmpty() || marca.isEmpty() || tipo.isEmpty() || caducidad.isEmpty()|| precio.isEmpty() || existencia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo o campos vacíos");
        } else {
            verNombre = verificadorNombre(nombre_P);
            verMarca = verificadorMarca(marca);
            verTipo = verificadorTipo(tipo);
            if(verNombre == true && verMarca == true && verTipo == true && verificadorPrecio(precio)==true ) {
                
                try {
                    float prec = Float.parseFloat(txtPrecio.getText());
                    int exist = Integer.parseInt(txtExist.getText());
                    Connection con = Conexion.Entrar();
                    String insertar = "insert into Producto (IdP,Nombre_P,Marca_P,Tipo_P,FechaCaducidad,Existencia,Precio)values(?,?,?,?,?,?,?)";
                    PreparedStatement ps=con.prepareStatement(insertar);
                    ps.setString(1,id);
                    ps.setString(2, nombre_P);
                    ps.setString(3, marca);
                    ps.setString(4, tipo);
                    ps.setString(5, caducidad);
                    ps.setInt(6, exist);
                    ps.setFloat(7, prec);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
                    ps.close();
                    con.close();
                    
                    this.dispose();
                    Opciones opc = new Opciones();
                    opc.setVisible(true);
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                } 
            } else {
                JOptionPane.showMessageDialog(null, "Solo se aceptan letras en Nombre, Marca y Tipo");
            }
           
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        Producto opc = new Producto();
        opc.setVisible(true);
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
    
    public static boolean verificadorMarca(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    
    public static boolean verificadorTipo(String cadena) {
        boolean nombre = false;
        for(int x=0; x<cadena.length(); x++) {
            if((cadena.charAt(x) >= 'a' && cadena.charAt(x) <= 'z') || cadena.charAt(x) == ' ' || (cadena.charAt(x) >= 'A' && cadena.charAt(x) <= 'Z')) {
                nombre = true;
            }
        }
        return nombre;
    }
    public static boolean verificadorPrecio(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
         } catch (NumberFormatException nfe) {
            return false;
         }

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCaducidad;
    private javax.swing.JTextField txtExist;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}