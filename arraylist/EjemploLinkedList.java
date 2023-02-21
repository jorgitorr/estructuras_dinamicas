/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author jorgearru
 */
public class EjemploLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");
        
        list.addFirst("Negan");
        
        list.addLast("Rick");
        
        list.add(2,"Gleen");
        
        Iterator<String>iterator = list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
    
}
