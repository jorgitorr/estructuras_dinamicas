/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_garaje;

/**
 *
 * @author jorge
 */
public class Reparacion implements Comparable<Reparacion>{
    private String descripcion;
    private int kms;

    public Reparacion(String descripcion, int kms) {
        this.descripcion = descripcion;
        this.kms = kms;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getKms() {
        return kms;
    }
    
    @Override
    public String toString() {
        return "{"+ "descripcion=" + descripcion + ", kms=" + kms + '}';
    }

    @Override
    public int compareTo(Reparacion r) {
        int valor = 1;
        if(this.descripcion.equals(r.descripcion)){
            valor = 0;
        }
        return valor;
    }
    
    
}
