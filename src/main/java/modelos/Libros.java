/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Usuario
 */
public class Libros {
    private int id;
    private String titulo;
    private String fecha;
    private String autor;
    private String categoria;
    private String edicion;
    private String idioma;
    private String paginas;
    private String descripcion;
    private String ejemplares;
    private int stock;
    private int disponible;

    /*public Libros(int id, String titulo, String fecha, String autor, String categoria, String edicion, String idioma, String paginas, String descripcion, String ejemplares, int stock, int disponible) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.autor = autor;
        this.categoria = categoria;
        this.edicion = edicion;
        this.idioma = idioma;
        this.paginas = paginas;
        this.descripcion = descripcion;
        this.ejemplares = ejemplares;
        this.stock = stock;
        this.disponible = disponible;
    }

    public Libros() {
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(String ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
    
}
