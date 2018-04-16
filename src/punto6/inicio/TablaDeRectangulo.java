/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.inicio;

import java.util.ArrayList;
import java.util.Scanner;
import punto1.dominio.Punto;
import punto6.dominio.Rectangulo;

/**
 *
 * @author natan
 */
public class TablaDeRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Rectangulo> tablaDeRectangulos = new ArrayList<Rectangulo>();
        Punto unPunto = new Punto(4, 3);
        Punto segundoPunto = new Punto(6, 3);
        Punto tercerPunto = new Punto(8, 3);
        Punto cuartoPunto = new Punto(9, 3);
        Punto quintoPunto = new Punto(7, 5);
        tablaDeRectangulos.add(new Rectangulo(unPunto, 3, 5));
        tablaDeRectangulos.add(new Rectangulo(segundoPunto, 4, 5));
        tablaDeRectangulos.add(new Rectangulo(tercerPunto, 5, 5));
        tablaDeRectangulos.add(new Rectangulo(cuartoPunto, 6, 5));
        tablaDeRectangulos.add(new Rectangulo(quintoPunto, 7, 5));

        for (int i = 0; i < tablaDeRectangulos.size(); i++) {
            System.out.println("Elemento en la posición " + (i + 1) + ": " + "Punto: (" + tablaDeRectangulos.get(i).getUnPunto().getX() + "," + tablaDeRectangulos.get(i).getUnPunto().getY() + ")"
                    + ". Base: " + tablaDeRectangulos.get(i).getBase() + ". Altura: " + tablaDeRectangulos.get(i).getAltura() + ". Superficie: " + tablaDeRectangulos.get(i).calcularSuperficie() + ". Perímetro: " + tablaDeRectangulos.get(i).calcularPerimetro());
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para borrar un rectangulo: ");
        int posicionAborrar = entrada.nextInt();
        System.out.println("Rectangulo a borrar: Punto (" + tablaDeRectangulos.get(posicionAborrar).getUnPunto().getX() + "," + tablaDeRectangulos.get(posicionAborrar).getUnPunto().getY() + "). Base: " + tablaDeRectangulos.get(posicionAborrar).getBase() + ". Altura: " + tablaDeRectangulos.get(posicionAborrar).getAltura() + ". Superficie: " + tablaDeRectangulos.get(posicionAborrar).calcularSuperficie() + ". Perímetro: " + tablaDeRectangulos.get(posicionAborrar).calcularPerimetro());
        tablaDeRectangulos.remove(posicionAborrar);
        System.out.println("Elementos actualizados: ");
        for (int i = 0; i < tablaDeRectangulos.size(); i++) {
            System.out.println("Elemento en la posición " + (i + 1) + ": " + "Punto: (" + tablaDeRectangulos.get(i).getUnPunto().getX() + "," + tablaDeRectangulos.get(i).getUnPunto().getY() + ")"
                    + ". Base: " + tablaDeRectangulos.get(i).getBase() + ". Altura: " + tablaDeRectangulos.get(i).getAltura() + ". Superficie: " + tablaDeRectangulos.get(i).calcularSuperficie() + ". Perímetro: " + tablaDeRectangulos.get(i).calcularPerimetro());
        }

    }

}
