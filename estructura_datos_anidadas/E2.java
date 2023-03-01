/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_datos_anidadas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class E2 {
    private String acronym;
    private Map<String,Set<List<String>>>mapa;

    public E2() {
        mapa = new HashMap<>();
    }
    
    
    private String acronimoPara(List<String>list){
        acronym = "";
        for(String palabra: list)
            acronym += palabra.toUpperCase().charAt(0);
        
        return acronym;
    }
    
    private Map<String,Set<List<String>>> acronimos(Set<List<String>>set){
        String acronimo;
        for(List<String>list: set){
            acronimo = acronimoPara(list);
            if(!mapa.containsKey(acronimo))
                mapa.put(acronimo,new HashSet<>());
            mapa.get(acronimo).add(list);
        }            
        return mapa;
    }
    
    private void imprimir(){
        for(String clave :mapa.keySet()){
            System.out.print(clave + "");
            for(List<String>list: mapa.get(clave)){
                System.out.print(list);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        String[] string1 = {"atention","deficit"};
        String[] string2 = {"Star","Trek","Next","Generation"};
        String[] string3 = {"laughing","out","loud"};
        String[] string4 = {"International","Business","Machines"};
        String[] string5 = {"League","of","Legends"};
        String[] string6 = {"anno","domini"};
        String[] string7 = {"art","director"};
        String[] string8 = {"Computer","Science and","Engineering"};
        
        Set<List<String>>set = new HashSet<>();
        set.add(Arrays.asList(string1));
        set.add(Arrays.asList(string2));
        set.add(Arrays.asList(string3));
        set.add(Arrays.asList(string4));
        set.add(Arrays.asList(string5));
        set.add(Arrays.asList(string6));
        set.add(Arrays.asList(string7));
        set.add(Arrays.asList(string8));
        
        E2 e = new E2();
        e.acronimos(set);
        e.imprimir();
    }
    
}
