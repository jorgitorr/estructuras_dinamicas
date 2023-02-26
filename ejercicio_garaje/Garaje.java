/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_garaje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author jorge
 */
public class Garaje {
    List<Coche>cochesReparados;

    public Garaje(){
        this.cochesReparados = new ArrayList<>();
    }
    
    public void anadeCoche(Coche coche){
        cochesReparados.add(coche);
    }
    
    public Coche buscaCoche(String matricula){
        Coche cocheDevuelto = null;
        
        for(Coche coche: cochesReparados){
            if(coche.getMatricula().equalsIgnoreCase(matricula)){
                cocheDevuelto = coche;
                break;
            }
        }
        return cocheDevuelto;
    }
    
    
    public void getCochesReparados(){
        Collections.sort(cochesReparados, new ComparadorCoches());//ordena coches
        
        for(Coche coche: cochesReparados){
            System.out.println(coche);
        }
    }
    
}
