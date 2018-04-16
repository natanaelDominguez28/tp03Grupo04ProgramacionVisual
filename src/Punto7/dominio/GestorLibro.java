package Punto7.dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SONY
 */
public class GestorLibro {
    private List<Libro> listaLibros;//la lista de los libros 
    private Libro libro;

    public GestorLibro() {
        listaLibros = new ArrayList<>();
        libro = new Libro();
    }

    public GestorLibro(List<Libro> listaLibros, Libro libro) {
        this.listaLibros = listaLibros;
        this.libro = libro;
    }
    
    
      
     public void mostrarLibros(){
        for(Libro a:listaLibros){
            a.mostrarDatos();
        }
    }

   
    //libro que elijo entre los libros
    public void asignarLibro(Libro libroSeleccionado) {
        List<Libro> librosBuscado=new ArrayList<>();
        for (int i = 0; i < listaLibros.size(); i++) {
            if(libro.getTitulo().equals(libroSeleccionado)){
               // librosBuscado=libro.getTitulo();
                // setLibro(libroSeleccionado);
            }
        }
       
    }

    //metodo para agregar el libro a la lista de libros
    public void agregarLibros(Libro esteLibro) {
        getListaLibros().add(esteLibro);
    }
    //metodo para agregar un nuevo libro
    public void agregarUnLibro() {
        agregarLibros(getLibro());
        setLibro(null);

    }

    public void addUnLibro(Libro unLibroIng) {
        listaLibros.add(unLibroIng);
    }

   

    /**
     * @return the listaLibros
     */
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    /**
     * @param listaLibros the listaLibros to set
     */
    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
