/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_garaje;

import ejercicio_garaje.Reparacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Coche {
    private String matricula;
    private String direccionDuenio;
    private List<Reparacion>reparaciones;
    private List<Coche>cochesReparados;

    public Coche(String matricula, String direccionDuenio) {
        this.matricula = matricula;
        this.direccionDuenio = direccionDuenio;
        this.reparaciones = new ArrayList<>();
        this.cochesReparados = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDireccionDuenio() {
        return direccionDuenio;
    }
    
    public List<Reparacion> buscaReparaciones(String palabra){
        List<Reparacion>reparacionesCoche = new ArrayList<>();
        
        for(Reparacion reparacion: reparaciones)
            if(reparacion.getDescripcion().contains(palabra))
                reparacionesCoche.add(reparacion);
        
        
        return reparacionesCoche;
    }

    public Reparacion ultimaReparacion(){
        return reparaciones.get(reparaciones.size()-1);
    }
    
    private boolean checkIntroducirCocheReparado(Coche c){
        boolean puede = true;
        //tengo que hacerlo
        return puede;
    }
    
    
    private boolean checkIntroducirReparacion(Reparacion r){
        boolean introducir = true;
        if(reparaciones.size()>0)
            if(reparaciones.get(reparaciones.size()-1).getKms()>r.getKms())
                introducir = false;
        
        return introducir;
    }
    

    /**
     * comprueba si la reparacion actual tiene la misma matricula que alguna existente
     * @param r 
     */
    
    public void anadeReparacion(Reparacion r){
        if(checkIntroducirReparacion(r))
            reparaciones.add(r);
        else
            System.out.println("La reparacion tiene un kilometraje inferior al de la ultima reparacion realizada");
    }

    @Override
    public String toString() {
        return "{matricula=" + matricula + ", direccionDuenio=" + direccionDuenio + ", reparaciones=" + reparaciones + '}';
    }
    
    
    
}
