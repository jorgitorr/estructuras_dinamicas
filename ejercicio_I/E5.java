/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_I;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jorge
 */
public class E5 {

    List<Integer>list;

    public E5() {
        this.list = new LinkedList<>();
    }
    
    
    private void introduce(){
        Random rnd = new Random();
        for(int i=0; i<10; i++){
            list.add(rnd.nextInt(10)+1);
        }
    }
    
    private void intercambio(int num1, int num2){
        while(list.contains(num1))
            list.set(list.indexOf(num1), num2);
    }
    
    private void imprimir(){
        for(int num: list)
            System.out.print(num + " ");
        
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        E5 e = new E5();
        e.introduce();
        e.imprimir();
        e.intercambio(2, 5);
        e.imprimir();
    }
    
}
