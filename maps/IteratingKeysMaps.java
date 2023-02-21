/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps;

import figuras.Punto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author jorgearru
 */
public class IteratingKeysMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, Punto>mapa = new HashMap<>();
        
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(2,6);
        Punto punto3 = new Punto(1,2);
        
        mapa.put(1, punto1);
        mapa.put(2, punto2);
        mapa.put(3, punto3);
        
        System.out.println(mapa);
        
        //iterator
        Iterator iterator = mapa.keySet().iterator();
        
        while(iterator.hasNext()){
            Integer clave = (Integer) iterator.next();
            Punto punto = mapa.get(clave);
            System.out.println(clave + " " + punto);
        }
        
        //BUCLE FOR EACH    
        for(Integer clave: mapa.keySet()){
            Punto punto = mapa.get(clave);
            System.out.println(clave + " " + punto);
        }
        
        //método for each
        mapa.forEach((clave,punto)-> System.out.println(clave + " " + punto));
    }
    
}
