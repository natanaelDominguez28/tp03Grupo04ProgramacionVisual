/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11.utilidades;

import java.util.ArrayList;
import java.util.List;
import punto11.dominio.Zapatilla;

/**
 *
 * @author Lore
 */
public class ListaDeZapatilla {
    private List<Zapatilla> zapatillas = new ArrayList();
    
    public ListaDeZapatilla() {
        
    }

    public List<Zapatilla> getZapatillas() {
        return zapatillas;
    }

    public void setZapatillas(List<Zapatilla> zapatillas) {
        this.zapatillas = zapatillas;
    }
     public void agregarZapatilla(Zapatilla zap){
         this.zapatillas.add(zap);
     }
     
     public void mostrarZapatilla(){
         for(int i=0;i<zapatillas.size();i++){
             System.out.println(zapatillas.get(i).getTalle());
             System.out.println(zapatillas.get(i).getMarca());
             System.out.println(zapatillas.get(i).getCalidad());
             System.out.println(zapatillas.get(i).getPrecio());
         }
     }
    /*public void esCopia(List<Zapatilla> zapatillas){
        for(int i=0;i<zapatillas.size();i++){
            if(zapatillas.get(i).getCalidad().equals("original")){
                System.out.println("es original");
            }else{
                System.out.println("es copia");
            }
        }        
    }*/
    
    
}
