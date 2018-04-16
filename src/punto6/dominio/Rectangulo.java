/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.dominio;

import punto2.dominio.*;
import punto1.dominio.Punto;

/**
 *
 * @author natan
 */
public class Rectangulo {

    private Punto unPunto;
    private int base;
    private int altura;

    public Rectangulo(Punto unPunto, int base, int altura) {
        this.unPunto = unPunto;
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    
    public Punto getUnPunto() {
        return unPunto;
    }

    public void setUnPunto(Punto unPunto) {
        this.unPunto = unPunto;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularUbicacionDePunto() {
        int x2, y2, x3, y3, x4, y4;
        //si los valores ingresados de la base y altura son positivos
        if ((unPunto.getX() > 0) && (unPunto.getY() > 0)) {
            x2 = unPunto.getX() + getBase();
            y2 = unPunto.getY();
            System.out.println("Coordenadas del 2do Punto en x: " + x2 + ", en y: " + y2);

            x3 = unPunto.getX();
            y3 = unPunto.getY() + getAltura();
            System.out.println("Coordenadas del 3er Punto en x: " + x3 + ", en y: " + y3);

            x4 = unPunto.getX() + getBase();
            y4 = y3;
            System.out.println("Coordenadas del 4to Punto en x: " + x4 + ", en y: " + y4);
        } else {
            //si el valor de la base es negativo y el de la altura positivo
            if ((unPunto.getX() < 0) && (unPunto.getY() > 0)) {
                x2 = unPunto.getX() - getBase();
                y2 = unPunto.getY();
                System.out.println("Coordenadas del 2do Punto en x: " + x2 + ", en y: " + y2);

                x3 = unPunto.getX();
                y3 = unPunto.getY() + getAltura();
                System.out.println("Coordenadas del 3er Punto en x: " + x3 + ", en y: " + y3);

                x4 = unPunto.getX() - getBase();
                y4 = y3;
                System.out.println("Coordenadas del 4to Punto en x: " + x4 + ", en y: " + y4);
            } else {
                //si los valores de base y altura son negativos
                if ((unPunto.getX() < 0) && (unPunto.getY() < 0)) {
                    x2 = unPunto.getX() - getBase();
                    y2 = unPunto.getY();
                    System.out.println("Coordenadas del 2do Punto en x: " + x2 + ", en y: " + y2);

                    x3 = unPunto.getX();
                    y3 = unPunto.getY() - getAltura();
                    System.out.println("Coordenadas del 3er Punto en x: " + x3 + ", en y: " + y3);

                    x4 = unPunto.getX() - getBase();
                    y4 = y3;
                    System.out.println("Coordenadas del 4to Punto en x: " + x4 + ", en y: " + y4);
                } else {
                    //si la base es positiva y la altura negativa
                    if ((unPunto.getX() > 0) && (unPunto.getY() < 0)) {
                        x2 = unPunto.getX() + getBase();
                        y2 = unPunto.getY();
                        System.out.println("Coordenadas del 2do Punto en x: " + x2 + ", en y: " + y2);

                        x3 = unPunto.getX();
                        y3 = unPunto.getY() - getAltura();
                        System.out.println("Coordenadas del 3er Punto en x: " + x3 + ", en y: " + y3);

                        x4 = unPunto.getX() + getBase();
                        y4 = y3;
                        System.out.println("Coordenadas del 4to Punto en x: " + x4 + ", en y: " + y4);
                    }
                }
            }
        }
    }


    public int calcularSuperficie() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
}
