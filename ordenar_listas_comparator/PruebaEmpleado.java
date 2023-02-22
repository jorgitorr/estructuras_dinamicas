/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_listas_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jorgearru
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(20, 2000, "Pepe");
        Empleado e2 = new Empleado(15, 700, "Gabriel");
        Empleado e3 = new Empleado(50, 800, "Marcos");
        Empleado e4 = new Empleado(20, 2000.50, "Jorge");
        Empleado e5 = new Empleado(50,800,"Mendez");
        
        List<Empleado>empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);
        
        System.out.println(empleados);
        Collections.sort(empleados, new CompararEmpleados());
        System.out.println(empleados);
    }
    
}
