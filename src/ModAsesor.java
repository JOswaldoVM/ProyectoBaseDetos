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
public class ModAsesor extends javax.swing.JFrame {

    /**
     * Creates new form AltaAsesor
     */
    public ModAsesor() {
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
        txtId = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAP = new javax.swing.JTextField();
        txtAM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Asesor");

        jLabel1.setText("Asesor");

        jLabel2.setText("Id");

        jLabel3.setText("Nombre");

        jLabel4.setText("Telefono");

        jLabel5.setText("Sueldo");

        txtNom.setEnabled(false);

        txtTel.setEnabled(false);

        txtSueldo.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido Paterno");

        txtAP.setEnabled(false);

        txtAM.setEnabled(false);

        jLabel7.setText("Apellido Materno");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAP, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(txtAM)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(btnBuscar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(32, 32, 32)
                                .addComponent(btnCancelar)
                                .addGap(82, 82, 82)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String id = txtId.getText();
        String nom = txtNom.getText();
        String AP = txtAP.getText();
        String AM = txtAM.getText();
        String Tel = txtTel.getText();
        String Sueldo = txtSueldo.getText();
        boolean verNom = false,verAp = false, verAm = false;
        if(id.isEmpty() || nom.isEmpty() || Tel.isEmpty() || Sueldo.isEmpty()|| AP.isEmpty()|| AM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo o campos vacíos");
        } else {
            verNom = verificadorNombre(nom);
            verAp = verificadorAp(AP);
            verAm = verificadorAm(AM);
            if(verNom == true && verAp == true && verAm == true&& verificadorTel(Tel) == true && verificadorSueldo(Sueldo) == true ) {
                try {
                    float sueld = Float.parseFloat(txtSueldo.getText());
                    Connection con = Conexion.Entrar();
                    String insertar = "update Asesor set Nom = '" + nom + "',AP = '" + AP + "',AM = '" + AM + "',Sueldo = " + sueld + ",Telefono_T = '" + Tel + "' where IdAsesor = '" + txtId.getText() + "'" ;
                    PreparedStatement ps=con.prepareStatement(insertar);
                    
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Asesor modificado correctamente");
                    ps.close();
                    con.close();
                    this.dispose();
                    Opciones opc = new Opciones();
                    opc.setVisible(true);
                    
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Asesor no modificado correctamente" + e.getMessage());
                }
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Solo se aceptan letras en Id y Nombre. Números en Telefono y Sueldo");
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Connection con = Conexion.Entrar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Nom,AP,AM,Sueldo,Telefono_T from Asesor where IdAsesor = '" +txtId.getText()+"'" );
            rs.next();
            txtNom.setText(rs.getString(1));
            txtAP.setText(rs.getString(2));
            txtAM.setText(rs.getString(3));
            txtSueldo.setText(String.valueOf(rs.getFloat(4)));
            txtTel.setText(rs.getString(5));
            
            btnBuscar.setEnabled(false);
            txtId.setEnabled(false);
            
            btnGuardar.setEnabled(true);
            txtNom.setEnabled(true);
            txtAP.setEnabled(true);
            txtAM.setEnabled(true);
            txtSueldo.setEnabled(true);
            txtTel.setEnabled(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Id no encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        Asesor ase = new Asesor();
        ase.setVisible(true);
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
    public static boolean verificadorTel(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
         } catch (NumberFormatException nfe) {
            return false;
         }
    }
    public static boolean verificadorSueldo(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
         } catch (NumberFormatException nfe) {
            return false;
         }
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
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
