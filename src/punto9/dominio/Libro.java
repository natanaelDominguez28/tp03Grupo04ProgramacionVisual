/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto9.dominio;

/**
 *
 * @author SONY
 */
public class Libro {
    private String isbn;
    private String titulo;
    private double precio;
    private String autor;

    public Libro(String isbn, String titulo, double precio, String autor) {
        this.isbn= isbn;
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

    public Libro() {
    }
    
    //metodo que me permite mostrar los libros
       public  void mostrarDatos() {
        System.out.println( "ISBN:" + getisbn() + " |Titulo:" + getTitulo() + " |Autor:" + getAutor()
              + " |Precio" + getPrecio());   
    }

  

    /**
     * @return the ISBN
     */
    public String getisbn() {
        return isbn;
    }

    /**
     * @param isbn the ISBN to set
     */
    public void setisbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

}

