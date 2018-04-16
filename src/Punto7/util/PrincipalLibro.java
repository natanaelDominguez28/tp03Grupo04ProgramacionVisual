/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7.util;

import Punto7.dominio.GestorLibro;
import Punto7.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author SONY
 */
public class PrincipalLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Libro unLibro = new Libro("TT1", "princesa", 165.10, "Vanesa");
        Libro unLibro1 = new Libro("TT2", "Princesa ", 123.10, "mary");
        Libro unLibro2 = new Libro("TT3", "Algebra I", 125.00, "clau");
        Libro unLibro3 = new Libro("TT4", "Algebra II ", 165.10, "leila");

        GestorLibro gestorLibro = new GestorLibro();
         System.out.println("--Lista de Autos--");
        gestorLibro.agregarLibros(unLibro);
        gestorLibro.agregarLibros(unLibro1);
        gestorLibro.agregarLibros(unLibro2);
        gestorLibro.agregarLibros(unLibro3);
        gestorLibro.mostrarLibros();
       // System.out.println("agrege un libro nuevo:");
       // String nuevo=scanner.next();
       
       // gestorLibro.agregarUnLibro();
       
        
        
       
    }

}
