/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.dominio;

import java.util.ArrayList;
//import punto5.dominio.Circulo;

/**
 *
 * @author Lore
 */
public class ListaDeCirculo {
    private ArrayList<Circulo> circulos = new ArrayList();

    public ListaDeCirculo() {
    }

    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }
    
    public void agregarCirculo(Circulo circulo){
        
        this.circulos.add(circulo);
    }
}
