/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SONY
 */
public class GestorLibroo {

    private List<Libroo> listaLibros;//la lista de los libros 
    private Libroo libro;

    public GestorLibroo() {
        listaLibros = new ArrayList<>();
        libro = new Libroo();
    }

    public GestorLibroo(List<Libroo> listaLibros, Libroo libro) {
        this.listaLibros = listaLibros;
        this.libro = libro;
    }

   
   
    public void mostrarLibros() {
        for (Libroo a : listaLibros) {
            a.mostrarDatos();
        }
    }

    //metodo para agregar el libro precargado a la lista de libros
    public void agregarLibros(Libroo esteLibro) {
        getListaLibros().add(esteLibro);
    }

    //metodo para agregar un nuevo libro
    public void agregarUnLibro() {
        // agregarLibros(getLibro());
        //setLibro(null);
        Scanner scanner = new Scanner(System.in);
        String res;
        do {
            System.out.println("Ingrese un isbn: ");
            String nuevoIsbn = scanner.next();
           getLibro().setisbn(nuevoIsbn);// agregarLibros(nuevoIsbn);
            System.out.println("Ingrese titulo: ");
            String nuevoTitulo = scanner.next();
             getLibro().setTitulo(nuevoTitulo);
            System.out.println("Ingrese precio: ");
            double nuevoPrecio = scanner.nextDouble();
             getLibro().setPrecio(nuevoPrecio);
            System.out.println("Ingrese autor: ");
            String nuevoAutor = scanner.next();
             getLibro().setAutor(nuevoAutor);
            // agregarLibros(nuevoIsbn);
            agregarLibros(getLibro());
            setLibro(null);
                     System.out.println("Desea ingresar unnuevo libro: ");
            res = scanner.next();
        } while (res.equals("S"));
    }

    /*   public void addUnLibro(Libro unLibroIng) {
        listaLibros.add(unLibroIng);
    }*/
    /**
     * @return the listaLibros
     */
    public List<Libroo> getListaLibros() {
        return listaLibros;
    }

    /**
     * @param listaLibros the listaLibros to set
     */
    public void setListaLibros(List<Libroo> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * @return the libro
     */
    public Libroo getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libroo libro) {
        this.libro = libro;
    }
}

