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
public class E6 {

    private List<Mobiliario>mobiliarios;

    public E6() {
        this.mobiliarios = new ArrayList<>();
    }
    
    private void insertarMobiliario(Mobiliario mobiliario){
        mobiliarios.add(mobiliario);
    }
    
    
    private void eleminarElementoXNombre(){
        Scanner sc = new Scanner(System.in);
        String elemento;
        
        for(Mobiliario mobiliario: mobiliarios){
            System.out.print(mobiliario + ", ");
        }
        
        System.out.println("\n¿Que elemento quieres eliminar?");
        elemento = sc.nextLine();
        
        /*for(Mobiliario mobiliario: mobiliarios){
            if(mobiliario.getNombre().equals(elemento))
                mobiliarios.remove(mobiliario);¿Por qué esto no funciona?
        }*/
        
        for(int i=0; i<mobiliarios.size(); i++){
            if(mobiliarios.get(i).getNombre().equalsIgnoreCase(elemento)){
                Mobiliario mobiliario = mobiliarios.get(i);
                mobiliarios.remove(mobiliario);
            }
        }
    }
    
    
    private void mostrarASC(){
        for(Mobiliario mobiliario: mobiliarios)
            System.out.print(mobiliario + ", ");
        
        System.out.println();
    }
    
    private void mostrarDESC(){
        for(int i=mobiliarios.size()-1; i>=0; i--)
            System.out.print(mobiliarios.get(i) + ", ");
        
        System.out.println();
    }
    
    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        String forma;
        
        System.out.println("¿Lo quieres de forma ascendente o descendente?");
        forma = sc.nextLine();
        
        if(forma.equalsIgnoreCase("ASC")){
            mostrarASC();
        }else if(forma.equalsIgnoreCase("DESC")){
            mostrarDESC();
        }else{
            System.out.println("No existe esa forma");
        } 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        E6 e = new E6();
        
        int opcion;
        do{
            System.out.println("*----------------------------------------*");
            System.out.println("|    1. Insertar mobiliario              |");
            System.out.println("|    2. Eliminar elemento del mobiliario |");
            System.out.println("|    3. Mostrar mobiliario               |");
            System.out.println("|    4. Salir                            |");
            System.out.println("*----------------------------------------*");
            
            opcion = sc.nextInt();
            
            
            switch(opcion){
                case 1:
                    String nombre, marca;
                    int precio;
                    
                    sc.nextLine();
                    System.out.println("Introduce el nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduce la marca: ");
                    marca = sc.nextLine();
                    System.out.println("Introduce el precio: ");
                    precio = sc.nextInt();
                    
                    Mobiliario mobiliario = new Mobiliario(nombre, precio, marca);
                    e.insertarMobiliario(mobiliario);
                    break;
                case 2:
                    e.eleminarElementoXNombre();
                    break;
                case 3:
                    e.mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        }while(opcion!=0);
    }
    
}
