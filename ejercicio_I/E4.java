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
public class E4 {

    
    public void crearList(List<Integer>list){
        Random rnd = new Random();
        for(int i=0; i<10; i++){
            list.add(rnd.nextInt(100)+1);
        }
    }
    
    public List<Integer>listaUnion(List<Integer>list1, List<Integer>list2){
        List<Integer>listaUnion = new ArrayList<>();
        
        listaUnion.addAll(list1);
        listaUnion.addAll(list2);

        return listaUnion;
    }
    
    public List<Integer>listaInterseccion(List<Integer>list1, List<Integer>list2){
        List<Integer>listaInterseccion = new ArrayList<>();
        
        listaInterseccion.addAll(list1);
        listaInterseccion.retainAll(list2);

        return listaInterseccion;
    }
    
    
    public void imprimirLista(List<Integer>list){
        for(int num: list)
            System.out.print(num + " ");
        
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        E4 e = new E4();
        
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
