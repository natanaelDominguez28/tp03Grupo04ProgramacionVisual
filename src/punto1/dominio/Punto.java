/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.dominio;

/**
 *
 * @author natan
 */
public class Punto {
    private int x;
    private int y;
    
    //constructor vacío
    public Punto() {
    }
    
    //constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    //Métodos accesores
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   
    public double calcularDistanciaEntrePuntos(Punto otroPunto){
        return Math.sqrt(Math.pow(otroPunto.getX()-x, 2)+Math.pow(otroPunto.getY()-y, 2));
    }
    
    
    
}
