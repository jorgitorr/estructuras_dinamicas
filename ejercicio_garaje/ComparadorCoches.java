/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_garaje;

import java.util.Comparator;

/**
 *
 * @author jorge
 */
public class ComparadorCoches implements Comparator<Coche>{

    @Override
    public int compare(Coche c1, Coche c2) {
        return c1.getMatricula().compareToIgnoreCase(c2.getMatricula());
    }
    
    
    public int compararDireccion(Coche c1, Coche c2){
        return c1.getDireccionDuenio().compareToIgnoreCase(c2.getDireccionDuenio());
    }
    
}
