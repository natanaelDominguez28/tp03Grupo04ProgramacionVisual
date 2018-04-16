/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8.dominio;

import java.util.Scanner;



/**
 *
 * @author SONY
 */
public class ArregloDeAuto {
    private Auto[] arregloDeAutos;
    private Auto auto;
    
    public ArregloDeAuto() {
    }
    
    public ArregloDeAuto(int tamañoArreglo) {
        arregloDeAutos = new Auto[tamañoArreglo];
    }
    
    public void modificarAuto(int opcion) {
        Scanner scanner = new Scanner(System.in);
        // Auto[] buscaAuto=new Auto[opcion];
        for (int i = 0; i < arregloDeAutos.length; i++) {
            if (i == (opcion)) {
                //  buscaAuto[opcion]= arregloDeAutos[i];
                System.out.println("ingrese Patente: ");
                String modfPatente = scanner.nextLine();
                this.arregloDeAutos[i].setPatente(modfPatente);//guardar el valor
                System.out.println("ingrese Marca: ");
                String modMarca = scanner.next();
                this.arregloDeAutos[i].setMarca(modMarca);
                System.out.println("ingrese Modelor: ");
                String modModelo = scanner.next();
                this.arregloDeAutos[i].setMmodelo(modModelo);
                System.out.println("ingrese Color: ");
                String modColor = scanner.next();
                this.arregloDeAutos[i].setColor(modColor);
                System.out.println("ingrese Tipo: ");
                String modTipoCombustible = scanner.next();
                this.arregloDeAutos[i].setTipoDeCombustible(modTipoCombustible);
            }            
        }
    }

    /*
public void modificar(Auto unAuto){
            System.out.println("Patente: "+ unAuto.getPatente() + " Marca: " + unAuto.getMarca() + "Modelo: " + unAuto.getMmodelo() + "Color: "
                +unAuto.getColor() + "Tipo de Combustible: " + unAuto.getTipoDeCombustible());
}*/
    
    public void agregarAuto(Auto auto, int posicion) {
        getArregloDeAutos()[posicion] = auto;
    }
    
    public void mostrarArreglo() {
        for (Auto a : getArregloDeAutos()) {
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
