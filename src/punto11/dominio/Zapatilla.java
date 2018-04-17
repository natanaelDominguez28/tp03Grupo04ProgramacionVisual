/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11.dominio;

/**
 *
 * @author Lore
 */
public class Zapatilla {
    
    private int talle;
    private String marca;
    private String calidad;
    private double precio;

    public Zapatilla() {
        
    }

    public Zapatilla(int talle, String marca, String calidad, double precio) {
        this.talle = talle;
        this.marca = marca;
        this.calidad = calidad;
        this.precio = precio;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

   
    
    
}
