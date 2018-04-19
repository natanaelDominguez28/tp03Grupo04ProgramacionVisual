/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10.utilidad;

/**
 *
 * @author Lore
 */
public class GestorCuota {
    private double[] registroCuotas;
    private double interes=1.5;
    private double importe;
    
    public GestorCuota(int nroCuota){
      registroCuotas=new double[nroCuota];  
    }

    public GestorCuota(double[] registroCuotas) {
        this.registroCuotas = registroCuotas;
    }

    public double[] getRegistroCuotas() {
        return registroCuotas;
    }

    public void setRegistroCuotas(double[] registroCuotas) {
        this.registroCuotas = registroCuotas;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public double[] cargarCuotas(double importe){
        for(int i=0;i<registroCuotas.length;i++){
            registroCuotas[i]=importe*interes/100+importe;
            importe=registroCuotas[i];
            
        }
        return registroCuotas;
    }
    
    public void mostrarCuotas(){
        System.out.println("Las cuotas a pagar son");
        for(int i=0;i<registroCuotas.length;i++){
            System.out.println(registroCuotas[i]);
        }
    }
}
