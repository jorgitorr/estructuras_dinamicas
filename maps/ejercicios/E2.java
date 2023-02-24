/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps.ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class E2 {

    private Map<String,Producto>productos;

    public E2() {
        this.productos = new HashMap<>();
    }
    
    
    private void introducirProducto(String codigo, Producto p1){
        productos.put(codigo, p1);
    }
    
    private void modificarPrecio(String c, int precio){
        Producto producto;
        if(productos.containsKey(c)){
            for(String codigo: productos.keySet()){
                if(codigo.equalsIgnoreCase(c)){
                    producto = productos.get(codigo);//guarda el valor del mapa que es el producto
                    productos.replace(c, new Producto(producto.getCodigo(),precio,producto.getCaducidad()));
                }
            }
        }else
            System.out.println("El producto no existe");
    }
    
    private void mostrarProductos(){
        for(String codigo: productos.keySet())
            System.out.println(codigo + "->" + productos.get(codigo));
        
    }
    
    private void eliminarProducto(String c){
        if(productos.containsKey(c))
            productos.remove(c);
        else
            System.out.println("El producto no existe");
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        E2 e = new E2();
        int opcion;
        
        String codId, caducidad;
        int codigo, precio;
        Producto p1;
        
        do{
            System.out.println("--------------MENU----------------");
            System.out.println("1. Introducir producto           |");
            System.out.println("2. Modificar precio              |");
            System.out.println("3. Mostrar todos los productos   |");
            System.out.println("4. Eliminar producto             |");
            System.out.println("5. Salir                         |");
            System.out.println("----------------------------------");
            System.out.print("Introduce la opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
 
            switch(opcion){
                case 1:
                    System.out.println("Introduce el codigo de id del producto");
                    codId = sc.nextLine();
                    System.out.println("Introduce el codigo del producto");
                    codigo = sc.nextInt();
                    System.out.println("Introduce el precio del producto");
                    precio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce la cantidad del producto");
                    caducidad = sc.nextLine();
                    p1 = new Producto(codigo, precio, caducidad);
                    e.introducirProducto(codId, p1);
                    break;
                case 2:
                    System.out.println("Introduce el codigo id del producto");
                    codId = sc.nextLine();
                    System.out.println("Introduce el precio del producto");
                    precio = sc.nextInt();
                    e.modificarPrecio(codId, precio);
                    break;
                case 3:
                    e.mostrarProductos();
                    break;
                case 4:
                    System.out.println("Introduce el codigo id del producto");
                    codId = sc.nextLine();
                    e.eliminarProducto(codId);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
            
            if(opcion==5)
                break;
            
        }while(opcion!=5);
    }
}
