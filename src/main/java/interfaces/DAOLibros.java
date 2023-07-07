/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import modelos.Libros;

/**
 *
 * @author Usuario
 */
public interface DAOLibros {
    public void registrar(Libros book) throws Exception;
    public void modificar(Libros book) throws Exception;
    public void eliminar(int bookId) throws Exception;
    public List<Libros> listar(String title) throws Exception;
    public Libros getBookById(int bookId) throws Exception;
}
