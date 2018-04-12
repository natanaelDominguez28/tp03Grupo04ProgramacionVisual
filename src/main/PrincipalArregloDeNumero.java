/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dominio.ArregloDeNumero;
import java.util.Scanner;

/**
 *
 * @author Lore
 */
public class PrincipalArregloDeNumero {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        ArregloDeNumero arreglo=new ArregloDeNumero();
        int contador=0;
        while(contador<10){
            System.out.println("ingrese un numero");
            arreglo.getNumeros()[contador]=lectura.nextInt();
            contador++;
        }
        arreglo.mostrarArreglo();
        arreglo.mostrarMayor();
        arreglo.mostrarMenor();
        System.out.println("el promedio entre los elementos del arreglo es "+arreglo.calcularPromedio());
    }
}
