/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_garaje;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class GestionGaraje {
    
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        Garaje garaje = new Garaje();
        Reparacion reparacion;
        Coche coche;
        
        String descripcion, matricula, direccionDueno, palabra;
        int kms;
        
        do{
            System.out.println("----------GARAJE-----------");
            System.out.println("1. Asocia reparacion");
            System.out.println("2. Ultima reparacion");
            System.out.println("3. Buscar coche");
            System.out.println("4. Anade coche");
            System.out.println("5. Listar por matricula");
            System.out.println("6. Listar por direccion");
            System.out.println("7. Salir");
            System.out.print("Introduce la opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            if(opcion==7)
                break;
            
            switch(opcion){
                case 1://ASOCIA REPARACION
                    System.out.println("Introduce la descripcion de la reparacion: ");
                    descripcion = sc.nextLine();
                    System.out.println("Introduce los kms de la reparacion: ");
                    kms = sc.nextInt();
                    sc.nextLine();
                    System.out.println("----------------------------------");
                    System.out.println("Introduce la matricula del coche");
                    matricula = sc.nextLine();
                    
                    coche = garaje.buscaCoche(matricula);
                    reparacion = new Reparacion(descripcion, kms);
                    coche.anadeReparacion(reparacion);
                    break;
                case 2://ULTIMA REPARACION
                    System.out.println("Introduce la matricula del coche");
                    matricula = sc.nextLine();
                    coche = garaje.buscaCoche(matricula);

                    if(coche!=null){
                        reparacion = coche.ultimaReparacion();
                        System.out.println(reparacion);
                    }else
                        System.out.println("No hay reparaciones");
                    break;
                case 3://BUSCAR
                    System.out.println("Introduce la matricula del coche");
                    matricula = sc.nextLine();
                    System.out.println("Introduce la palabra clave");
                    palabra = sc.nextLine();
                    //queda
                    coche = garaje.buscaCoche(matricula);
                    reparacion = coche.buscaReparaciones(palabra);//quiza tenga que cambiarlo
                    System.out.println(reparacion);
                    break;
                case 4://ANADIR
                    System.out.println("Introduce la matricula del coche");
                    matricula = sc.nextLine();
                    System.out.println("Introduce la direccion del dueno");
                    direccionDueno = sc.nextLine();
                    coche = new Coche(matricula, direccionDueno);
                    garaje.anadeCoche(coche);
                    break;
                case 5://LISTAR POR MATRICULA
                    garaje.getCochesReparados();
                    break;
                case 6://LISTAR POR DIRECCION
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
            }
        }while(opcion!=7);
        
    }
}
