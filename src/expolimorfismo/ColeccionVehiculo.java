/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expolimorfismo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class ColeccionVehiculo {
    
  List <Vehiculo> listaVehiculos;
  
  //constructor con arraylist vacío
  public ColeccionVehiculo(){
      listaVehiculos= new ArrayList<>();
  }
    
  public void engadirVehiculo(Vehiculo vehi){
      listaVehiculos.add(vehi);
  }
   
  public void verPrecio(){
      for(Vehiculo v:listaVehiculos)
          System.out.println("Prezo: " +v.calcularPrezo()+ " Matricula: "+v.getMatricula() +" Marca: " +v.getMarca());
  }
        
  public void amosar(){
      Iterator it=listaVehiculos.iterator();
      while(it.hasNext())
      System.out.println(it.next());
      
  }
  public Coches crearCoche(){
      return new Coches(lerMatricula(),lerMarca(),lerPotencia(),lerPortas());
    }
    
    public Camions crearCamion(){
        return new Camions(lerRemolque(),lerMatricula(),lerMarca(),lerPotencia());
    }
    
    public String lerMatricula(){
        return JOptionPane.showInputDialog("Matricula?");
    }
    public int lerPotencia(){
        return Integer.parseInt(JOptionPane.showInputDialog("Potencia?"));
    }
    public String lerMarca(){
        return JOptionPane.showInputDialog("Marca?");
    }
    public int lerPortas(){
       return Integer.parseInt(JOptionPane.showInputDialog("Portas?"));
    }
    public boolean lerRemolque(){
        return Boolean.parseBoolean(JOptionPane.showInputDialog("Ten remolque?"));
    }
}
