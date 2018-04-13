/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.inicio;

import punto1.dominio.Punto;

/**
 *
 * @author natan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto(1, 2);
        Punto punto2 = new Punto(3, 4);
        
        double resultado = punto1.calcularDistanciaEntrePuntos(punto2);
        System.out.println("La distancia entre los puntos P1("+punto1.getX()+","+punto1.getY()+") y P2("+punto2.getX()+","+punto2.getY()+") es: "+resultado);
    }
    
}
