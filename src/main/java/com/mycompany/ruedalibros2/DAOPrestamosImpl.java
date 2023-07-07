/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruedalibros2;

import BaseDeDatos.Conexion;
import interfaces.DAOPrestamos;
import modelos.Libros;
import modelos.Prestamo;
import modelos.usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class DAOPrestamosImpl extends Conexion implements DAOPrestamos{

    @Override
    public void registrar(Prestamo prestam) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO prestamo(id_usuario, id_libro, fecha_salida) VALUES(?,?,?);");//"INSERT INTO prestamo(id_usuario, id_libro, fecha_salida) VALUES(?,?,?);"
            st.setInt(1, prestam.getId_usuario());
            st.setInt(2, prestam.getId_libro());
            st.setString(3, prestam.getFecha_salida());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    
    
    @Override
    public void modificar(Prestamo prestam) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE prestamo SET id_usuario = ?, is_libro = ?, fecha_salida = ?, fecha_regreso = ? WHERE id = ?");
            st.setInt(1, prestam.getId_usuario());
            st.setInt(2, prestam.getId_libro());
            st.setString(3, prestam.getFecha_salida());
            st.setString(4, prestam.getFecha_regreso());
            st.setInt(5, prestam.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    @Override
    public Prestamo getLending(usuarios user, Libros book) throws Exception {
        Prestamo lending = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM prestamo WHERE id_usuario = ? AND id_libro = ? AND fecha_regreso IS NULL ORDER BY id DESC LIMIT 1");
            st.setInt(1, user.getId());
            st.setInt(2, book.getId());
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lending = new Prestamo();
                lending.setId(rs.getInt("id"));
                lending.setId_usuario(rs.getInt("id_usuario"));
                lending.setId_libro(rs.getInt("id_libro"));
                lending.setFecha_salida(rs.getString("fecha_salida"));
                lending.setFecha_regreso(rs.getString("fecha_regreso"));
            }
            
            st.close();
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return lending;
    }
   @Override
    public List<Prestamo> listar() throws Exception {
        List<Prestamo> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM prestamo ORDER BY id DESC");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Prestamo lending = new Prestamo();
                lending.setId(rs.getInt("id"));
                lending.setId_usuario(rs.getInt("id_usuario"));
                lending.setId_libro(rs.getInt("id_libro"));
                lending.setFecha_salida(rs.getString("fecha_salida"));
                lending.setFecha_regreso(rs.getString("fecha_regreso"));
                lista.add(lending);
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

    /*@Override
    public List<Prestamo> listar(String user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
}
