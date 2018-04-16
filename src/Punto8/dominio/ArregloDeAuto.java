/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8.dominio;



/**
 *
 * @author SONY
 */
public class ArregloDeAuto {
    private Auto[ ] arregloDeAutos;
    private Auto auto;

    public ArregloDeAuto() {
    }

    
     public ArregloDeAuto(int tamañoArreglo ) {
          arregloDeAutos = new Auto[tamañoArreglo];
    }

public void modificarAuto(int opcion){
    for (int i = 0; i < arregloDeAutos.length; i++) {
      if(opcion==i){
          System.out.println("Patente: "+ auto.getPatente() + " Marca: " + auto.getMarca() + "Modelo: " + auto.getMmodelo() + "Color: "
                +auto.getColor() + "Tipo de Combustible: " + auto.getTipoDeCombustible());
      }  
    }
}
/*
public void modificar(Auto unAuto){
            System.out.println("Patente: "+ unAuto.getPatente() + " Marca: " + unAuto.getMarca() + "Modelo: " + unAuto.getMmodelo() + "Color: "
                +unAuto.getColor() + "Tipo de Combustible: " + unAuto.getTipoDeCombustible());
}*/

     public void agregarAuto(Auto auto, int posicion){
        getArregloDeAutos()[posicion] = auto;
    }
    
    public void mostrarArreglo(){
        for(Auto a:getArregloDeAutos()){
            a.mostrarDatos();
        }
    }
    
    
     /**
     * @return the arregloDeAutos
     */
    public Auto[] getArregloDeAutos() {
        return arregloDeAutos;
    }

    /**
     * @param arregloDeAutos the arregloDeAutos to set
     */
    public void setArregloDeAutos(Auto[] arregloDeAutos) {
        this.arregloDeAutos = arregloDeAutos;
    }
}
