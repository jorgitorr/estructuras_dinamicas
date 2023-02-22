/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_listas_comparator;

/**
 *
 * @author jorgearru
 */
public class Empleado {

    private int edad;
    private double salario;
    private String nombre;

    public Empleado(int edad, double salario, String nombre) {
        this.edad = edad;
        this.salario = salario;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "edad=" + edad + ", salario=" + salario + ", nombre=" + nombre + '}';
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }
    
}
