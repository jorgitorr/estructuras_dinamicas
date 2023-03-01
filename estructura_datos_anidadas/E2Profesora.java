/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_datos_anidadas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author jorge
 */
public class E2Profesora {

    public static String acronymFor(List<String> list) {   
        String ac = "";
        for (String s : list)
            ac += Character.toUpperCase(s.charAt(0));
        return ac;
    }
    
    public static Map<String, Set<List<String>>> acronyms(Set<List<String>> set) {

        Map<String, Set<List<String>>> map = new TreeMap<>();
        for (List<String> list : set) {
            String acronym = acronymFor(list);
            if (!map.containsKey(acronym))
                map.put(acronym, new HashSet<>());
            map.get(acronym).add(list);
        }

        return map;
    }
    
    public static void main(String[] args) {

        String[] strings1 = {"atention","deficit"};
        String[] strings2 = {"Star","Trek","Next","Generation"};
        String[] strings3 = {"laughing","out","loud"};
        String[] strings4 = {"International","Business","Machines"};
        String[] strings5 = {"League","of","Legends"};
        String[] strings6 = {"anno","domini"};
        String[] strings7 = {"art","director"};
        String[] strings8 = {"Computer","Science and","Engineering"};

        HashSet<List<String>> setOfLists = new HashSet<>();
        setOfLists.add(Arrays.asList(strings1));
        setOfLists.add(Arrays.asList(strings2));
        setOfLists.add(Arrays.asList(strings3));
        setOfLists.add(Arrays.asList(strings4));
        setOfLists.add(Arrays.asList(strings5));
        setOfLists.add(Arrays.asList(strings6));
        setOfLists.add(Arrays.asList(strings7));    

        Map<String, Set<List<String>>> map = acronyms(setOfLists);
        System.out.println(map);
    }
    
}
