/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dominio.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Lore
 */
public class PincipalTriangulo {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        
        System.out.println("ingrese el primer lado");
        double ladoA=lectura.nextDouble();
        System.out.println("ingrese el primer lado");
        double ladoB=lectura.nextDouble();
        System.out.println("ingrese el primer lado");
        double ladoC=lectura.nextDouble();
        
        Triangulo figura=new Triangulo(ladoA,ladoB,ladoC);
        
        if(figura.esTriangulo()==true){
            System.out.println("se formo un triangulo");
            System.out.println("el perimetro del triangulo es: "+figura.calcularPerimetro());    
        }else{
            System.out.println("no se formo un triangulo");
        }
    }
}
