/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.mycompany.ruedalibros2.DAOUsersImpl;
import interfaces.DAOUsers;
import java.util.Calendar;
//import java.sql.Date;
import modelos.usuarios;
import org.jdatepicker.JDatePicker;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class SubirUsuario extends javax.swing.JPanel {
    
    boolean isEdition = false;
    modelos.usuarios userEdition;
    
    public SubirUsuario() {
        initComponents();
        InitStyles();
    }
    
/*private String getDateAsString(Date date) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    return dateFormat.format(date);
}*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text8 = new javax.swing.JLabel();
        Text9 = new javax.swing.JLabel();
        Text10 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        Text11 = new javax.swing.JLabel();
        Text12 = new javax.swing.JLabel();
        Text13 = new javax.swing.JLabel();
        Text14 = new javax.swing.JLabel();
        Text15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        Text18 = new javax.swing.JLabel();
        Text19 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        Text20 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        Text16 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        Text17 = new javax.swing.JLabel();
        EstadoCivil = new javax.swing.JComboBox<>();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Subir nuevo Libro");

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Libro ID");

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Título");

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Fecha de Publicación");

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Autor");

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Categoría");

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Edición");

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Idioma");

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Páginas");

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Descripción");

        Text13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text13.setText("Stock");

        Text14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text14.setText("Ejemplares");

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Disponibles");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Registrar nuevo Usuario");
        jPanel2.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text18.setText("Nombre");
        jPanel2.add(Text18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Text19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text19.setText("Cedula");
        jPanel2.add(Text19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Apellido Materno");
        jPanel2.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Estado Civil");
        jPanel2.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Domicilio");
        jPanel2.add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));
        jPanel2.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 260, 30));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 30));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));
        jPanel2.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 260, 30));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 10, 310));

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 250, 50));

        Text20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text20.setText("Apellido Paterno");
        jPanel2.add(Text20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel2.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 30));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Teléfono");
        jPanel2.add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 260, 30));

        Text17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text17.setText("Fecha de Nacimiento");
        jPanel2.add(Text17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        EstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Otros" }));
        EstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoCivilActionPerformed(evt);
            }
        });
        jPanel2.add(EstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 260, 30));

        txtFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 250, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public SubirUsuario(modelos.usuarios user){
        initComponents();
        isEdition = true;
        userEdition = user;
        InitStyles();
    }
    private void InitStyles (){
        if (isEdition) {
        Title1.setText("Editar Usuario");
        btnRegistrar.setText("Guardar");

        if (userEdition != null) {
            txtNombre.setText(userEdition.getNombre());
            txtApellido1.setText(userEdition.getApellido1());
            txtApellido2.setText(userEdition.getApellido2());
            txtCedula.setText(userEdition.getCedula());
            txtDomicilio.setText(userEdition.getDomicilio());
            //txtFechaNacimiento.setString(userEdition.getEdad());            
            EstadoCivil = new javax.swing.JComboBox<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a", "Otros" });
            txtTelefono.setText(userEdition.getTelefono());
        } else {
            Title.setText("Registrar nuevo usuario");
        }
    }
}
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText();
        String ape1 = txtApellido1.getText();
        String ape2 = txtApellido2.getText();
        String ced = txtCedula.getText();
        String dom = txtDomicilio.getText();
        String tel = txtTelefono.getText();
        String date = ((JTextField)txtFechaNacimiento.getDateEditor().getUiComponent()).getText();
        String fechaNacimiento = ((JTextField)txtFechaNacimiento.getDateEditor().getUiComponent()).getText();
        String estcivil = (String) EstadoCivil.getSelectedItem();
        
        //validacion de los campos
        if(nombre.isEmpty() || ape1.isEmpty() || ape2.isEmpty() || dom.isEmpty() || tel.isEmpty() || ced.isEmpty() || fechaNacimiento.isEmpty() || estcivil.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocus();
            return;
        }
        
        // Si es una edicion
        modelos.usuarios usu = isEdition ? userEdition : new modelos.usuarios();
        usu.setNombre(nombre);
        usu.setApellido1(ape1);
        usu.setApellido2(ape2);
        usu.setCedula(ced);
        //usu.setEdad(fechaNacimiento);
        usu.setEdad(date);
        usu.setEstado_civil(estcivil);
        usu.setDomicilio(dom);
        usu.setTelefono(tel);
        try{
            DAOUsers dao = new DAOUsersImpl();
            
            if(!isEdition){
                dao.registrar(usu);
            }else{
                dao.modificar(usu);
            }
            
           String succesMsg = isEdition ? "modificado" : "registrado"; 
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario "+ succesMsg +" exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            
           if(!isEdition){
            txtNombre.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            txtCedula.setText("");
            txtDomicilio.setText("");
            //txtFechaNacimiento.setDate();
            EstadoCivil.setSelectedIndex(0);
            txtTelefono.setText("");
           } 
            
        }catch(Exception e){
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al "+ errorMsg +" el usuario. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void EstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoCivilActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_EstadoCivilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EstadoCivil;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text13;
    private javax.swing.JLabel Text14;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text17;
    private javax.swing.JLabel Text18;
    private javax.swing.JLabel Text19;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text20;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDomicilio;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
