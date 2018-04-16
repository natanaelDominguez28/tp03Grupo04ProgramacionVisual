/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8.util;

import Punto8.dominio.ArregloDeAuto;
import Punto8.dominio.Auto;
import java.util.Scanner;

/**
 *
 * @author SONY
 */
public class PrincipalAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Auto auto = new Auto();
        Scanner scanner=new Scanner(System.in);
        
        Auto toyota = new Auto("j3467", "toyota", "mediano", "verde", "gas");
        Auto fitito = new Auto("kehs", "fitito", "grannde", "rojo", "nafta");
        Auto chebrolet = new Auto("ehwd", "chebrolet", "mediano", "blanco", "nafta");

        ArregloDeAuto arregloDeAutos = new ArregloDeAuto(3);
        arregloDeAutos.agregarAuto(toyota, 0);
        arregloDeAutos.agregarAuto(fitito, 1);
        arregloDeAutos.agregarAuto(chebrolet, 2);

        arregloDeAutos.mostrarArreglo();
        System.out.println("Elija una posicin amodifica: ");
        int  posicion=scanner.nextInt();
        arregloDeAutos.modificarAuto(posicion);
         arregloDeAutos.mostrarArreglo();
        
    }
}
