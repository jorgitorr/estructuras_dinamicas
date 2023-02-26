/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenar_listas_comparator;

import java.util.Comparator;

/**
 *
 * @author jorgearru
 */
public class CompararEmpleados implements Comparator<Empleado>{

    public int compare(Empleado e1, Empleado e2) {
        int resultado = 0;
        if(e1.getEdad()>e2.getEdad())
            resultado = 1;
        else if(e1.getEdad()<e2.getEdad())
            resultado = -1;
        else{
            resultado = compararNombre(e1, e2);
            
            if(resultado==0)
                compararSalario(e1, e2);   
        }

        return resultado;
    }
    
    
    public int compararNombre(Empleado e1, Empleado e2){
        return e1.getNombre().compareTo(e2.getNombre());
    }
    
    public int compararSalario(Empleado e1, Empleado e2){
        return (int) (e1.getSalario() - e2.getSalario());
    }

    

    
    
}
