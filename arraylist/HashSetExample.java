/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jorgearru
 */
public class HashSetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String>frutas = new TreeSet<>();
        
        /*
        - HashSet = guarda los datos sin ningun tipo de ordenacion
        - LinkedHashSet = orden por inserccion
        - TreeSet = elementos ordenados
        */
        frutas.add("Apple");
        frutas.add("Mango");
        frutas.add("Grapes");
        frutas.add("Orange");
        frutas.add("Fig");
        
        frutas.add("Apple");
        frutas.add("Mango");
        
        /*frutas.add(null);
        frutas.add(null);*/
        
        System.out.println(frutas);
    }
    
}
