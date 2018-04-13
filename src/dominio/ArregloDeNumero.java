/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Lore
 */
public class ArregloDeNumero {
    private int[] numeros;
    
    public ArregloDeNumero(){
        numeros=new int[10];
    }  
    public ArregloDeNumero(int[] numeros) {
        this.numeros = numeros;
    }
    public int[] getNumeros() {
        return numeros;
    }
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }    
    public void mostrarArreglo(){
        System.out.println("los elementos almacenados en el arreglo son:");
        for(int i=0;i<numeros.length;i++){
            System.out.println("valor del elemento ["+i+"] = "+numeros[i]);
        }
    }
    public void mostrarMayor(){
        int mayor=numeros[0];
    
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        System.out.println("el mayor de los elementos es "+mayor);
    }
    public void mostrarMenor(){
        int menor=numeros[0];
    
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.out.println("el menor de los elementos es "+menor);
    }
    public double calcularPromedio(){
        double promedio;
        int suma=0;
        for(int i=0;i<numeros.length;i++){
            suma=suma+numeros[i];
        }
        promedio=suma/numeros.length;
        return promedio;
    }
}
