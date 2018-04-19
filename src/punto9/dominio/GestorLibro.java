/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto9.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
      //  librosBuscado = new ArrayList<>();
    }

    //metodo para agregar el libro precargado a la lista de libros
    public void agregarLibros(Libro esteLibro) {
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

    public void mostrarLibros() {
        for (Libro aLibro : listaLibros) {
            aLibro.mostrarDatos();
        }
    }

   

    public void buscarV(String buscado) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(buscado)) {
               // System.out.println(listaLibros.get(i).getTitulo() + buscado);
                // this.librosBuscado.add(unLibro);
               libro.mostrarDatos();
            }
        }    
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

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
