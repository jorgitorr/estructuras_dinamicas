/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgearru
 */
public class IteratingArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String>aList = new ArrayList<>();
        
        aList.add("Steve");
        aList.add("Tim");
        aList.add("Lucy");
        aList.add("Pat");
        aList.add("Angela");
        aList.add("Tom");
        
        for(String nombre: aList)
            System.out.println(nombre);
    }
    
}
