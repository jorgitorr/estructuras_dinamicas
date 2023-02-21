/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_I;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorgearru
 */
public class E1 {
    List<Integer> lista;

    public E1() {
        this.lista = new ArrayList<>();
    }
    
    
    private void mostrarList(){
        for(int num: lista){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    private int mayor(){
        int mayor = Integer.MIN_VALUE;
        for(int num: lista){
            if(num>mayor)
                mayor = num;
        }
        
        return mayor;
    }
    
    
    private int menor(){
        int menor = Integer.MAX_VALUE;
        for(int num: lista){
            if(num<menor)
                menor = num;
        }
        
        return menor;
    }
    
    private int media(){
        int media = 0;
        for(int num: lista)
            media += num;
        
        
        media /= lista.size();
        
        return media;
    }
    
    private void borrarElemento(int pos){
        lista.remove(pos);
    }
    
    private void borrarElemento2(int valor){
        int pos = lista.indexOf(valor);
        lista.remove(pos);
    }
    
    private void addElemento(int num){
        lista.add(num);
    }
    
    private void cambiarValor(int pos, int valor){
        lista.set(pos, valor);
    }
    
    private void cambiarValor2(int valorCambiado, int valor2){
        lista.set(lista.indexOf(valorCambiado), valor2);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        E1 e = new E1();
        int pos, valor, valor2;
        
        do{
            System.out.println("---------------------------------------------");
            System.out.println("|1. mostrar lista                            |");
            System.out.println("|2. mostrar mayor                            |");
            System.out.println("|3. mostrar menor                            |");
            System.out.println("|4. mostrar media                            |");
            System.out.println("|5. borrar elemento de posición              |");
            System.out.println("|6. borrar elemento de valor concreto        |");
            System.out.println("|7. anadir elemento al final                 |");
            System.out.println("|8. cambiar valor de un elemento por posicion|");
            System.out.println("|9. cambiar valor de un elemento por su valor|");
            System.out.println("---------------------------------------------");
            
            pos = sc.nextInt();
            switch(pos){
                case 1:
                    e.mostrarList();
                    break;
                case 2:
                    System.out.println(e.mayor());
                    break;
                case 3:
                    System.out.println(e.menor());
                    break;
                case 4:
                    System.out.println(e.media());
                    break;
                case 5:
                    System.out.println("Introduce la posición");
                    valor = sc.nextInt();
                    e.borrarElemento(valor);
                    break;
                case 6:
                    System.out.println("Introduce el valor");
                    valor = sc.nextInt();
                    e.borrarElemento2(valor);
                    break;
                case 7:
                    System.out.println("Introduce el num que vas a anadir");
                    valor = sc.nextInt();
                    e.addElemento(valor);
                    break;
                case 8:
                    System.out.println("Introduce la pos: ");
                    pos = sc.nextInt();
                    System.out.println("Introduce el valor: ");
                    valor = sc.nextInt();
                    e.cambiarValor(pos, valor);
                    break;
                case 9:
                    System.out.println("Valor a cambiar");
                    valor = sc.nextInt();
                    System.out.println("valor cambiador");
                    valor2 = sc.nextInt();
                    e.cambiarValor2(valor, valor2);
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
        }while(pos!=0);
        
    }
    
}
