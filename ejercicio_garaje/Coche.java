/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_garaje;

import ejercicio_garaje.Reparacion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Coche {
    private String matricula;
    private String direccionDuenio;
    private List<Reparacion>reparaciones;

    public Coche(String matricula, String direccionDuenio) {
        this.matricula = matricula;
        this.direccionDuenio = direccionDuenio;
        this.reparaciones = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDireccionDuenio() {
        return direccionDuenio;
    }
    
    private Reparacion buscaReparaciones(String palabra){
        Reparacion r = null;
        for(Reparacion reparacion: reparaciones){
            if(reparacion.equals(palabra)){
                r = reparacion;
                break;
            }
        }
        return r;
    }
    
    private Reparacion ultimaReparacion(){
        return reparaciones.get(reparaciones.size()-1);
    }
    
    
    
    private boolean checkIntroducir(Reparacion r){
        boolean puede = true;
        for(Reparacion reparacion: reparaciones){
            if(r.compareTo(reparacion)!=0)
                puede = false;
        }
        return puede;
    }
    

    /**
     * comprueba si la reparacion actual tiene la misma matricula que alguna existente
     * @param r 
     */
    
    private void anadeReparacion(Reparacion r, boolean puede){
        if(puede)
            reparaciones.add(r);
        else
            System.out.println("No puede introducir la reparacion de este coche "
                    + "ya que este coche ya tiene una matrícula registrada");
    }
    
    
    
  

    
}
