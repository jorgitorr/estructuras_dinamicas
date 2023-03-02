/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_I;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorgearru
 */
public class E7 {
    private List<Persona>personas;

    public E7() {
        this.personas = new LinkedList<>();
    }
    
    
    private void introducir(Persona persona){
        personas.add(persona);
    }
    
    private void imprimir(){
        for(Persona persona: personas){
            System.out.println(persona);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char respuesta;
        String id, nombre, apellido; 
        
        E7 e = new E7();
        //lo mejor es poner esto fuera
        do{
            System.out.println("Introduce el id: ");
            id = sc.nextLine();
            System.out.println("Introduce el nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduce el apellido: ");
            apellido = sc.nextLine();
            Persona persona = new Persona(id,nombre,apellido);
            e.introducir(persona);
            System.out.println("Quieres introducir otra persona(Y/N)");
            respuesta = sc.nextLine().toUpperCase().charAt(0);
        }while(respuesta=='Y');
        
        e.imprimir();
    }
    
}
