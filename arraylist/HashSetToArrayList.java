/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jorgearru
 */
public class HashSetToArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String>conjuntoAmigos = new HashSet<>();
        
        conjuntoAmigos.add("Ana");
        conjuntoAmigos.add("Gabriel");
        conjuntoAmigos.add("Gema");
        conjuntoAmigos.add("Antonio");
        
        System.out.println(conjuntoAmigos);
        
        //conversion a list
        //los cambios que haga no afectan al primer set, ya que lleva un new
        List<String>listaAmigos = new ArrayList<>(conjuntoAmigos);
        
        System.out.println(listaAmigos);
    }
    
}
