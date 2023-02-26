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
public class E2 {
    List<Integer>lista1;
    List<Integer>lista2;
    List<Integer>mayores;

    public E2() {
        this.lista1 = new ArrayList<>();
        this.lista2 = new ArrayList<>();
        this.mayores = new ArrayList<>();
    }
    
    private void creaListas(){
        Random rnd = new Random();
        int num, num2;
        
        for(int i=0;i<100;i++){
            num = rnd.nextInt(1000)+1;
            num2 = rnd.nextInt(1000)+1;
            lista1.add(num);
            lista2.add(num2);
        }
    }
    
    private void setMayores(){
        for(int i=0; i<lista1.size(); i++){
            if(lista1.get(i)>lista2.get(i))
                mayores.add(lista1.get(i));
            else
                mayores.add(lista2.get(i));
        }
    }
    
    private void printListas(){
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(mayores);
    }

    public static void main(String[] args) {
        E2 e = new E2();
        e.creaListas();
        e.setMayores();
        e.printListas();
    }
    
}
