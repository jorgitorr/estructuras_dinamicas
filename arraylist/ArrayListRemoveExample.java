package arraylist;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jorgearru
 */
public class ArrayListRemoveExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        
        aList.add("Steve");
        aList.add("Tim");
        aList.add("Lucy");
        aList.add("Pat");
        aList.add("Angela");
        aList.add("Tom");
        
        System.out.println(aList);
        
        aList.remove("Steve");
        aList.remove("Angela");
        
        System.out.println(aList);
        
        aList.remove(2);
        System.out.println(aList);
    }
    
}
