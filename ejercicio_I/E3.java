/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_I;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jorge
 */
public class E3 {
    
    
    public void crearList(List<Integer>list){
        Random rnd = new Random();
        for(int i=0; i<10; i++){
            list.add(rnd.nextInt(100)+1);
        }
    }
    public List<Integer>listaUnion(List<Integer>list1, List<Integer>list2){
        List<Integer>listaUnion = new ArrayList<>();
        
        for(int num: list1)
            listaUnion.add(num);
        
        for(int num: list2)
            listaUnion.add(num);
        
        
        return listaUnion;
    }
    
    public List<Integer>listaInterseccion(List<Integer>list1, List<Integer>list2){
        List<Integer>listaInterseccion = new ArrayList<>();
        
        for(int i=0; i<list1.size(); i++){
            if(!listaInterseccion.contains(list1.get(i)) && !listaInterseccion.contains(list2.get(i))){
                if(list2.contains(list1.get(i))){
                    listaInterseccion.add(list1.get(i));
                }
                
                if(list1.contains(list2.get(i))){
                    listaInterseccion.add(list2.get(i));
                }
            }
        }
        
        return listaInterseccion;
    }
    
    
    public void imprimirLista(List<Integer>list){
        for(int num: list)
            System.out.print(num + " ");
        
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        E3 e = new E3();
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer>list3 = new ArrayList<>();
        
        e.crearList(list1);
        e.imprimirLista(list1);
        
        e.crearList(list2);
        e.imprimirLista(list2);
        
        System.out.println("union entre listas: ");
        list3 = e.listaUnion(list1, list2);
        e.imprimirLista(list3);
        
        System.out.println("interseccion entre listas: ");
        list3 = e.listaInterseccion(list1, list2);
        e.imprimirLista(list3);
    }
    
}
