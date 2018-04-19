/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.util;

import java.util.Scanner;
import punto8.dominio.GestorLibroo;
import punto8.dominio.Libroo;



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

        Libroo unLibro = new Libroo("TT1", "princesa", 165.10, "Vanesa");
        Libroo unLibro1 = new Libroo("TT2", "Princesa ", 123.10, "mary");
        Libroo unLibro2 = new Libroo("TT3", "Algebra I", 125.00, "clau");
        Libroo unLibro3 = new Libroo("TT4", "Algebra II ", 165.10, "leila");

       GestorLibroo gestorLibro = new GestorLibroo();
        System.out.println("--Lista de Autos--");
        gestorLibro.agregarLibros(unLibro);
        gestorLibro.agregarLibros(unLibro1);
        gestorLibro.agregarLibros(unLibro2);
        gestorLibro.agregarLibros(unLibro3);
        gestorLibro.mostrarLibros();

        gestorLibro.agregarUnLibro();
        gestorLibro.mostrarLibros();

    }

}
