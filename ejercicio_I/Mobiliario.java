/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_I;

/**
 *
 * @author jorgearru
 */
public class Mobiliario {
    private String nombre;
    private int precio;
    private String marca;

    public Mobiliario(String nombre, int precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
