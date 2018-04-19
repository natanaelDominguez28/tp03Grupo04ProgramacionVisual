/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10.inicio;

import java.util.Scanner;
import punto10.dominio.Producto;
import punto10.utilidad.GestorCuota;

/**
 *
 * @author Lore
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Producto producto=new Producto(234, "televisor", 6000.00);
        
        System.out.println("datos del producto");
        System.out.println("codigo: "+producto.getCodigo());
        System.out.println("nombre: "+producto.getNombre());
        System.out.println("precio: "+producto.getPrecioUnitario());
        
        System.out.println("en cuantas cuotas quiere pagar(3/6/12)");
        int nroCuota=entrada.nextInt();
        
        double cuota=producto.getPrecioUnitario()/nroCuota;
        System.out.println(cuota);
        
        GestorCuota listaDeCuotas=new GestorCuota(nroCuota);
        
        switch(nroCuota){
            case 3:
                listaDeCuotas.cargarCuotas(cuota);
                listaDeCuotas.mostrarCuotas();
            break;
            case 6:
                listaDeCuotas.cargarCuotas(cuota);
                listaDeCuotas.mostrarCuotas();
            break;
            case 12:
                listaDeCuotas.cargarCuotas(cuota);
                listaDeCuotas.mostrarCuotas();
            break;
        /*default:

        sentencias;

        break;*/
        }
        
        
    }
}
