/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import modelos.usuarios;



/**
 *
 * @author Usuario
 */
public interface DAOUsers {
    public void registrar (usuarios user) throws Exception;
    public void modificar (usuarios user) throws Exception;
    public void sancionar(usuarios user) throws Exception;
    public void eliminar (int userId) throws Exception;
    public List<usuarios> listar(String nombre) throws Exception;
    public usuarios getusuariobById (int userId) throws Exception;

      
}
