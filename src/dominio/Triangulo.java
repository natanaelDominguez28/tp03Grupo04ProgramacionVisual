/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Lore
 */
public class Triangulo {
    private double a;
    private double b;
    private double c;
    
    public Triangulo(){
        
    }
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public boolean esTriangulo(){
        return (a+b>c&&a+c>b&&b+c>a); 
    }
    public double calcularPerimetro(){
       return a+b+c; 
    }
}
