/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expolimorfismo;

/**
 *
 * @author agarridogarcia
 */
public  class Coches extends Vehiculo {
    private int numPortas;

    

    public Coches() {
    }

    public Coches(String matricula, String marca, int potencia,int portas) {
        super(matricula, marca, potencia);
        this.numPortas=portas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "Coches{" +super.toString()+ "numPortas=" + numPortas + '}';
    }

    public float calcularPrezo() {
        return 95*super.getPotencia();
    }
    
 
    
    
}
