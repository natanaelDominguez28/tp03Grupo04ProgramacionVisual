/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.inicio;

import java.util.Scanner;
import punto1.dominio.Punto;
import punto2.dominio.Rectangulo;

/**
 *
 * @author natan
 */
public class PrincipalRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setUnPunto(new Punto());
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese coordenada x: ");
        rectangulo.getUnPunto().setX(entrada.nextInt());
        
        System.out.println("Ingrese coordenada y: ");
        rectangulo.getUnPunto().setY(entrada.nextInt());
        
        System.out.println("Ingrese valor de la base: ");
        rectangulo.setBase(entrada.nextInt());
        
        System.out.println("Ingrese valor de la altura: ");
        rectangulo.setAltura(entrada.nextInt());
        
        System.out.println("Coordenadas del punto ingresado: "+rectangulo.getUnPunto().getX()+","+rectangulo.getUnPunto().getY());
        rectangulo.calcularUbicacionDePunto();
        System.out.println("La superficie es: "+rectangulo.calcularSuperficie());
        System.out.println("El perímetro es: "+rectangulo.calcularPerimetro());
    }
    
}
