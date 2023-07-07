/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;
import com.mycompany.ruedalibros2.DAOBooksImpl;
import com.mycompany.ruedalibros2.DAOPrestamosImpl;
import com.mycompany.ruedalibros2.DAOUsersImpl;
import interfaces.DAOLibros;
import interfaces.DAOPrestamos;
import interfaces.DAOUsers;
import Utils.Utils;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class Prestamo extends javax.swing.JPanel {

    public Prestamo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtLibro = new javax.swing.JTextField();
        btnPrestar = new javax.swing.JButton();
        btnBuscarLibro = new javax.swing.JButton();
        btnBuscarUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsers = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableBooks = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 260, 270));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Usuario:");
        jPanel1.add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Libro:");
        jPanel1.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 10, 350));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nuevo Prestamo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 180, 30));
        jPanel1.add(txtLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 180, 30));

        btnPrestar.setBackground(new java.awt.Color(102, 102, 255));
        btnPrestar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPrestar.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestar.setText("Prestar");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 130, 40));

        btnBuscarLibro.setBackground(new java.awt.Color(102, 102, 255));
        btnBuscarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        btnBuscarUser.setBackground(new java.awt.Color(102, 102, 255));
        btnBuscarUser.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarUser.setText("Buscar");
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        TableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido P", "Apellido M"
            }
        ));
        jScrollPane1.setViewportView(TableUsers);
        if (TableUsers.getColumnModel().getColumnCount() > 0) {
            TableUsers.getColumnModel().getColumn(0).setMinWidth(30);
            TableUsers.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 270, 140));

        TableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Autor", "Categoria"
            }
        ));
        jScrollPane2.setViewportView(TableBooks);
        if (TableBooks.getColumnModel().getColumnCount() > 0) {
            TableBooks.getColumnModel().getColumn(0).setMinWidth(30);
            TableBooks.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 270, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        String folio = txtUsuario.getText();
        String bookId = txtLibro.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || bookId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtUsuario.requestFocus();
            return;
        } else if (!Utils.isNumeric(folio) || !Utils.isNumeric(bookId)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtUsuario.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(bookId) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtUsuario.requestFocus();
            return;
        }

        try {
            System.out.println("ppppp1");
            DAOUsers daoUsers = new DAOUsersImpl();
            modelos.usuarios currentUser = daoUsers.getusuariobById(Integer.parseInt(folio));
            if (currentUser == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                txtUsuario.requestFocus();
                return;
            }
            System.out.println("ppppp12");
            DAOLibros daoBooks = new DAOBooksImpl();
            System.out.println("ppppp13");
            // Validamos existencia del libro
            modelos.Libros currentBook = daoBooks.getBookById(Integer.parseInt(bookId));
            System.out.println("ppppp2");
            if (currentBook == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún libro con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                txtLibro.requestFocus();
                return;
            }
            // Validamos disponibilidad del libro.
            else if (currentBook.getDisponible() < 1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ya no hay más libros disponibles con esa ID para prestar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                txtLibro.requestFocus();
                return;
            }
            System.out.println("ppppp4");
            DAOPrestamos daoLendings = new DAOPrestamosImpl();
            System.out.println("ppppp5");
            // Validamos que el usuario no tenga ya ese libro prestado.
            modelos.Prestamo currentLending = daoLendings.getLending(currentUser, currentBook);
            //modelos.Prestamo currentLending = daoLendings;
            System.out.println("ppppp6");
            if (currentLending != null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Esa persona ya cuenta con el préstamo de ese mismo Libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                txtLibro.requestFocus();
                return;
            }
               System.out.println("ppppp7");
            // Todo OK: Prestamos libro.
            modelos.Prestamo lending = new modelos.Prestamo();
            System.out.println("ppppp8");
            lending.setId_libro(currentBook.getId());
            System.out.println("ppppp9");
            lending.setId_usuario(currentUser.getId());
            System.out.println("ppppp10");
            lending.setFecha_salida(Utils.getFechaActual());//Captura la fecha actual
            System.out.println("ppppp11");
            daoLendings.registrar(lending);
            System.out.println("ppppp12");
            // Modificamos el libro restandole 1 en disponibilidad.
            currentBook.setDisponible(currentBook.getDisponible() - 1);
            daoBooks.modificar(currentBook);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " prestado exitosamente a " + currentUser.getNombre() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtUsuario.setText("");
            txtLibro.setText("");
            System.out.println("ppppp8");
        } catch (Exception e) {
            System.out.println("ppppp");
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al prestar el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
        try {
            DAOUsers dao = new DAOUsersImpl();
            DefaultTableModel model = (DefaultTableModel) TableUsers.getModel();
            model.setRowCount(0);
            dao.listar(txtUsuario.getText()).forEach((u) -> model.addRow(new Object[] {u.getId(),u.getNombre(), u.getApellido1(), 
                u.getApellido2()}));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        try {
            DAOLibros dao = new DAOBooksImpl();
            DefaultTableModel model = (DefaultTableModel) TableBooks.getModel();
            model.setRowCount(0);
            dao.listar(txtLibro.getText()).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getTitulo(), u.getAutor(), 
                u.getCategoria()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableBooks;
    private javax.swing.JTable TableUsers;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
