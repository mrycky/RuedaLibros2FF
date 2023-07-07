/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruedalibros2;

import BaseDeDatos.Conexion;
import interfaces.DAOUsers;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelos.usuarios;

/**
 *
 * @author Usuario
 */
public class DAOUsersImpl extends Conexion implements DAOUsers{

    @Override
    public void registrar(usuarios user) throws Exception {
       
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios(id, nombre, apellido1, apellido2, cedula, edad, estado_civil, domicilio, telefono, sancion, sancion_dinero) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
            st.setInt(1, user.getId());
            st.setString(2, user.getNombre());
            st.setString(3, user.getApellido1());
            st.setString(4, user.getApellido2());
            st.setString(5, user.getCedula());
            st.setString(6, user.getEdad());
            st.setString(7, user.getEstado_civil());
            st.setString(8, user.getDomicilio());
            st.setString(9, user.getTelefono());
            st.setInt(10, user.getSancion());
            st.setInt(11, user.getSancion_dinero());
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(usuarios user) throws Exception {
            try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE usuarios SET nombre = ?, apellido1 = ?, apellido2 = ?, cedula = ?, edad= ?, estado_civil=?, domicilio=?, telefono=? WHERE id = ?");
            
            st.setString(1, user.getNombre());
            st.setString(2, user.getApellido1());
            st.setString(3, user.getApellido2());
            st.setString(4, user.getCedula());
            st.setString(6, String.valueOf(user.getEdad()));
            st.setString(6, user.getEstado_civil());
            st.setString(7, user.getDomicilio());
            st.setString(8, user.getTelefono());
            st.setInt(9, user.getId());
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int userId) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM usuarios WHERE id = ?;");
            st.setInt(1, userId);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public List<usuarios> listar(String nombre) throws Exception {
        List<usuarios> lista = null;
        try{
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM usuarios;":"SELECT * FROM usuarios WHERE nombre LIKE '%"+nombre+"%';";
            System.out.println(Query);
            
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                usuarios user = new usuarios();
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido1(rs.getString("apellido1"));
                user.setApellido2(rs.getString("apellido2"));
                user.setCedula(rs.getString("cedula"));
                user.setDomicilio(rs.getString("domicilio"));
                user.setEdad(rs.getString("edad"));
                user.setEstado_civil(rs.getString("estado_civil"));
                user.setTelefono(rs.getString("telefono"));
                user.setSancion(rs.getInt("sancion"));
                user.setSancion_dinero(rs.getInt("sancion_dinero"));
                lista.add(user);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public usuarios getusuariobById(int userId) throws Exception {
        usuarios user = new usuarios();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios WHERE id = ? LIMIT 1;");
            st.setInt(1, userId);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido1(rs.getString("apellido1"));
                user.setApellido2(rs.getString("apellido2"));
                user.setCedula(rs.getString("cedula"));
                user.setDomicilio(rs.getString("domicilio"));
                user.setEdad(rs.getString("edad"));
                user.setEstado_civil(rs.getString("estado_civil"));
                user.setTelefono(rs.getString("telefono"));
                user.setSancion(rs.getInt("sancion"));
                user.setSancion_dinero(rs.getInt("sancion_dinero"));
                }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.Cerrar();
        }
        return user;
    }

    @Override
    public void sancionar(usuarios user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET sanctions = ?, sanc_money = ? WHERE id = ?");
            st.setInt(1, user.getSancion());
            st.setInt(2, user.getSancion_dinero());
            st.setInt(3, user.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    
}
