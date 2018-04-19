/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11.inicio;

import java.util.Scanner;
import punto11.dominio.Zapatilla;
import punto11.utilidades.ListaDeZapatilla;

/**
 *
 * @author Lore
 */
public class PrincipalZapatilla {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        
        ListaDeZapatilla lista=new ListaDeZapatilla();
        char resp;
        
        do{
            System.out.println("ingrese talle");
            int talle=lectura.nextInt();
            System.out.println("ingrese marca");
            String marca=lectura.nextLine();
            System.out.println("ingrese calidad (original/copia)");
            String calidad=lectura.nextLine();
            System.out.println("ingrese precio");
            double precio=lectura.nextDouble();
            
            Zapatilla z=new Zapatilla(talle, marca, calidad, precio);
            lista.agregarZapatilla(z); 
            
            System.out.println("desea ingresar mas zapatillas (s/n) ");
            resp=lectura.next().charAt(0);
        }while(resp=='s'||resp=='S');
        
        lista.mostrarZapatilla();
    }      
        
    
    
    
}
