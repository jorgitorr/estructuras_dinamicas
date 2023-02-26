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
public class ComparadorCochesMatricula implements Comparator<Coche>{

    @Override
    public int compare(Coche c1, Coche c2) {
        return c1.getMatricula().compareToIgnoreCase(c2.getMatricula());
    }
    
    
    public int compararDireccion(Coche c1, Coche c2){
        int ordenDireccion;
        if(c1.getDireccionDuenio()==c2.getDireccionDuenio())
            ordenDireccion = c1.getMatricula().compareToIgnoreCase(c2.getMatricula());
        else
            ordenDireccion = c1.getDireccionDuenio().compareToIgnoreCase(c2.getDireccionDuenio());
        
        return ordenDireccion;
    }
    
}
