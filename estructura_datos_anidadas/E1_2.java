/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_datos_anidadas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jorge
 */
public class E1_2 {
    
    private Map<Integer,Set>mapa;

    public E1_2() {
        this.mapa = new HashMap<>();
    }
    
    
    private void split(String palabra){
        if(!mapa.containsKey(palabra.length()))
            mapa.put(palabra.length(), new TreeSet());
        mapa.get(palabra.length()).add(palabra);
    }
    
    private void imprimirMapa(){
        for(Integer palabra: mapa.keySet())
            System.out.println(palabra + "->" + mapa.get(palabra));
    }
    
    private void limpiarMapa(){
        mapa.clear();
    }
    
    public static void main(String[] args) {
        E1_2 e = new E1_2();
        String[]frases = {"to","be","or","not","that","is","the","question"};
        String[]frases_2 = {"four", "score", "and", "seven", "years", "ago", 
            "our", "fathers", "brought", "forth"};
        for(String palabra: frases)
            e.split(palabra);
        
        for(String palabra: frases_2)
            e.split(palabra);
        
        e.imprimirMapa();
    }
    
}
