/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_datos_anidadas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author jorge
 */
public class E2_2 {

    private Map<String,Set<List<String>>> acronyms(Set<List<String>>conjunto){
        Map<String,Set<List<String>>>mapa = new TreeMap<>();
        String acronimo;
        
        for(List<String>palabras: conjunto){
            acronimo = "";
            for(String p: palabras)
                acronimo += p.charAt(0);
        
            if(!mapa.containsKey(acronimo.toUpperCase()))
                mapa.put(acronimo.toUpperCase(), new HashSet<>());

            mapa.get(acronimo.toUpperCase()).add(palabras);
        }
        return mapa;
    }
    
    
    public static void main(String[] args) {
        E2_2 e = new E2_2();
        Set<List<String>>set = new HashSet<>();
        List<String>palabras = new ArrayList<>();
        Map<String, Set<List<String>>>mapa = new HashMap<>();
        
        String[] strings1 = {"atention","deficit"};
        String[] strings2 = {"Star","Trek","Next","Generation"};
        String[] strings3 = {"laughing","out","loud"};
        String[] strings4 = {"International","Business","Machines"};
        String[] strings5 = {"League","of","Legends"};
        String[] strings6 = {"anno","domini"};
        String[] strings7 = {"art","director"};
        String[] strings8 = {"Computer","Science and","Engineering"};
        
        set.add(Arrays.asList(strings1));
        set.add(Arrays.asList(strings2));
        set.add(Arrays.asList(strings3));
        set.add(Arrays.asList(strings4));
        set.add(Arrays.asList(strings5));
        set.add(Arrays.asList(strings6));
        set.add(Arrays.asList(strings7));
        set.add(Arrays.asList(strings8));
        
        mapa = e.acronyms(set);
        
        Iterator it = mapa.keySet().iterator();
        while(it.hasNext()){
            String acronimo = (String) it.next();
            System.out.println(acronimo + "=" + mapa.get(acronimo));
        }
 
    }
    
}
