/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_datos_anidadas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class E1Profesora {

    public static Map<Integer, Set<String>> split(Set<String> set) {
      
    Map<Integer, Set<String>> map = new HashMap<>();
    for (String s : set) {
        int lenght = s.length();
        if (!map.containsKey(lenght))
            map.put(lenght, new HashSet<>());
        map.get(lenght).add(s);
    }
    
    return map;
  }
  
  public static void main(String[] args) {
        Set<String> set = Set.of("to", "be", "or", "not", "that", "is", "the", "question");
        System.out.println(split(set));
  }
    
}
