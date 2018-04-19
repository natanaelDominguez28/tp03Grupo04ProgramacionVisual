/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.inicio;

import punto5.dominio.Circulo;
import punto5.utilidad.ListaDeCirculo;

/**
 *
 * @author Lore
 */
public class PrincipalCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3.4, "Rojo");
        Circulo c2 = new Circulo(5.4, "Verde"); 
        
        ListaDeCirculo lista=new ListaDeCirculo();
        
        lista.agregarCirculo(c1);
        lista.agregarCirculo(c2);
      
         for(Circulo circulo: lista.getCirculos()){
            System.out.println("Radio: " + circulo.getRadio());
            System.out.println("Color: " + circulo.getColor());
            System.out.println("Superficie: "+circulo.calcularSuperficie());
        }
        
    }
    
}
