/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author SONY
 */
public class Auto {
    private String patente;
    private String marca;
    private String mmodelo;
    private String color;
    private String tipoDeCombustible;
  
    public Auto() {
        
    }

    public Auto(String patente, String marca, String mmodelo, String color, String tipoDeCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.mmodelo = mmodelo;
        this.color = color;
        this.tipoDeCombustible = tipoDeCombustible;
      
    }

  
  
      public void mostrarDatos(){
        System.out.println("Patente: "+ getPatente() + " Marca: " + getMarca() + "Modelo: " + getMmodelo() + "Color: "
                + getColor() + "Tipo de Combustible: " + getTipoDeCombustible());
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the mmodelo
     */
    public String getMmodelo() {
        return mmodelo;
    }

    /**
     * @param mmodelo the mmodelo to set
     */
    public void setMmodelo(String mmodelo) {
        this.mmodelo = mmodelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tipoDeCombustible
     */
    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    /**
     * @param tipoDeCombustible the tipoDeCombustible to set
     */
    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

  
    
}
