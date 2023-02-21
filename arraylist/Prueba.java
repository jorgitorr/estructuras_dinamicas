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
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        
        list1.add(4);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(3);
        
        list2.add(4);
        list2.add(3);
        list2.add(5);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        
        System.out.println("LISTA 1");
        for(int num: list1)
            System.out.println(num);
        
        System.out.println("\nLISTA 2");
        for(int num: list2)
            System.out.println(num);
        
        list2.removeAll(list1);
        
        System.out.println("\nLISTA 2 DESPUES DE REMOVE ALL DE LISTA 1");
        for(int num: list2)
            System.out.println(num);
        
    }
    
}
