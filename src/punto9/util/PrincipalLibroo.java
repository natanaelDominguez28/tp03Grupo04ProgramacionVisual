/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto9.util;

import java.util.Scanner;
import punto9.dominio.GestorLibro;
import punto9.dominio.Libro;


/**
 *
 * @author SONY
 */
public class PrincipalLibroo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        Libro unLibro = new Libro("TT1", "Princesa", 165.10, "Vanesa");
        Libro unLibro1 = new Libro("TT2", "Blancanieve ", 123.10, "mary");
        Libro unLibro2 = new Libro("TT3", "Algebra I", 125.00, "clau");
        Libro unLibro3 = new Libro("TT4", "Algebra II ", 165.10, "leila");

        GestorLibro gestorLibro = new GestorLibro();
        System.out.println("--Lista de Libros--");

        gestorLibro.agregarLibros(unLibro1);
        gestorLibro.agregarLibros(unLibro2);
        gestorLibro.agregarLibros(unLibro3);
        gestorLibro.agregarLibros(unLibro);
        gestorLibro.mostrarLibros();

        //gestorLibro.agregarUnLibro();
        //gestorLibro.mostrarLibros();
        System.out.println("Elija un titulo de un libro de la lista para buscar: ");
        String libroSelecionado = scanner.next();
        gestorLibro.buscarV(libroSelecionado);
        //  gestorLibro.mostrarLibroBuscado(libroSelecionado);

    }

}
