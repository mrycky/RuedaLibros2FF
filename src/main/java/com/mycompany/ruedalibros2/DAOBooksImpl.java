/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruedalibros2;
import BaseDeDatos.Conexion;
import interfaces.DAOLibros;
import modelos.Libros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
//import java.util.Date;

/**
 *
 * @author Usuario
 */
public class DAOBooksImpl extends Conexion implements DAOLibros{
    
    @Override
    public void registrar(Libros book) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO libros(titulo, fecha, autor, categoria, edicion, idioma, paginas, descripcion, ejemplares, stock, disponible) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
            st.setString(1, book.getTitulo());
            st.setString(2, book.getFecha());
            st.setString(3, book.getAutor());
            st.setString(4, book.getCategoria());
            st.setString(5, book.getEdicion());
            st.setString(6, book.getIdioma());
            st.setString(7, book.getPaginas());
            st.setString(8, book.getDescripcion());
            st.setString(9, book.getEjemplares());
            st.setInt(10, book.getStock());
            st.setInt(11, book.getDisponible());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    @Override
    public void modificar(Libros book) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE libros SET titulo = ?, fecha = ?, autor = ?, categoria = ?, edicion = ?, idioma = ?, paginas = ?, descripcion = ?, ejemplares = ?, stock = ?, disponible = ? WHERE id = ?");
            st.setString(1, book.getTitulo());
            st.setString(2, book.getFecha());
            st.setString(3, book.getAutor());
            st.setString(4, book.getCategoria());
            st.setString(5, book.getEdicion());
            st.setString(6, book.getIdioma());
            st.setString(7, book.getPaginas());
            st.setString(8, book.getDescripcion());
            st.setString(9, book.getEjemplares());
            st.setInt(10, book.getStock());
            st.setInt(11, book.getDisponible());
            st.setInt(12, book.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    @Override
    public void eliminar(int bookId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM libros WHERE id = ?;");
            st.setInt(1, bookId);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    @Override
    public List<Libros> listar(String title) throws Exception {
        List<Libros> lista = null;
        try {
            this.Conectar();
            String Query = title.isEmpty() ? "SELECT * FROM libros;" : "SELECT * FROM libros WHERE titulo LIKE '%" + title + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Libros book = new Libros();
                book.setId(rs.getInt("id"));
                book.setTitulo(rs.getString("titulo"));
                book.setFecha(rs.getString("fecha"));
                book.setAutor(rs.getString("autor"));
                book.setCategoria(rs.getString("categoria"));
                book.setEdicion(rs.getString("edicion"));
                book.setIdioma(rs.getString("idioma"));
                book.setPaginas(rs.getString("paginas"));
                book.setDescripcion(rs.getString("descripcion"));
                book.setEjemplares(rs.getString("ejemplares"));
                book.setStock(rs.getInt("stock"));
                book.setDisponible(rs.getInt("disponible"));
                lista.add(book);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }
    @Override
    public Libros getBookById(int bookId) throws Exception {
        Libros book = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM libros WHERE id = ? LIMIT 1;");
            st.setInt(1, bookId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                book = new Libros();
                book.setId(rs.getInt("id"));
                book.setTitulo(rs.getString("titulo"));
                book.setFecha(rs.getString("fecha"));
                book.setAutor(rs.getString("autor"));
                book.setCategoria(rs.getString("categoria"));
                book.setEdicion(rs.getString("edicion"));
                book.setIdioma(rs.getString("idioma"));
                book.setPaginas(rs.getString("paginas"));
                book.setDescripcion(rs.getString("descripcion"));
                book.setEjemplares(rs.getString("ejemplares"));
                book.setStock(rs.getInt("stock"));
                book.setDisponible(rs.getInt("disponible"));
                
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return book;
    }

    
}
