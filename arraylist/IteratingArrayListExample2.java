/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jorgearru
 */
public class IteratingArrayListExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer>aList = new ArrayList<>();
        aList.add(14);
        aList.add(7);
        aList.add(39);
        aList.add(40);
        
        System.out.println("BUCLE FOR:");
        for(int i=0;i<aList.size(); i++)
            System.out.println(aList.get(i));
        
        //bucle for each
        System.out.println("BUCLE FOR EACH");
        for(Integer num: aList)
            System.out.println(num);
        
        
        //BUCLE WHILE
        System.out.println("BUCLE WHILE");
        int i=0;
        while(aList.size()>i){
            System.out.println(aList.get(i));
            i++;
        }
        
        //iterator
        System.out.println("Iterator");
        Iterator it = aList.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        
        
        //EXPRESION LAMBDA
        System.out.println("EXPRESION LAMBDA");
        aList.forEach(numero -> System.out.println("El numero: "+ numero));
    }
    
}
