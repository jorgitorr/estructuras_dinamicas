/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorgearru
 */
public class Actividad1 {

    private List<Integer>list;

    public Actividad1() {
        list = new ArrayList<>();
    }
    
    private void leeNumeros(){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
            if(num==0)
                break;
            list.add(num);
        }while(num!=0);
    }
    
    private void mostrar(){
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
    
    private int cantidadNum(){//tambien se podria poner return list.size() y sería lo mismo
        int cantidad = 0;
        Iterator it = list.iterator();
        while(it.hasNext()){
            it.next();
            cantidad++;
        }
        
        return cantidad;
    }
    
    private int sum(){
        int suma =0;
        for(Integer num: list)
            suma+=num;
        
        return suma;
    }
    
    private int media(){
        return sum()/list.size();
    }

    
    
    public static void main(String[] args) {
        Actividad1 actividad = new Actividad1();
        actividad.leeNumeros();
        actividad.mostrar();
        System.out.println("La cantidad de numeros almacenados es: " 
                + actividad.cantidadNum());
        System.out.println("La suma da: " + actividad.sum());
        System.out.println("la media es: " + actividad.media());
    }
    
}
