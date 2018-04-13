/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.dominio;

/**
 *
 * @author Lore
 */
public class Circulo {
    private double radio;
    private String color;
    
    public Circulo(){
        
    }
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularSuperficie(){
        return Math.pow(radio, 2);
    }
}
