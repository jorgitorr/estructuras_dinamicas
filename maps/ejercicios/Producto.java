/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maps.ejercicios;

/**
 *
 * @author jorge
 */
public class Producto {
    private int codigo;
    private int precio;
    private String caducidad;

    public Producto(int codigo, int precio, String caducidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.caducidad = caducidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "{codigo=" + codigo + ", precio=" + precio + ", caducidad=" + caducidad + '}';
    }
    
    
}
