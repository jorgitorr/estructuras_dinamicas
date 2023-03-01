/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_datos_anidadas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jorge
 */
public class E1 {
    private Map<Integer,String[]>long_palabras;

    public E1() {
        this.long_palabras = new HashMap<>();
    }
    
    
    private Map<Integer,String[]> split(String[]cadena){
        long_palabras.clear();
        String[]cadenaAux = new String[1];
        String[]cadenaAux2 = new String[1];
        for(String palabra: cadena){
            if(long_palabras.containsKey(palabra.length())){
                if(cadenaAux2.length<2){
                    cadenaAux2 = new String[cadenaAux.length + 1];
                    for(int i=0; i<cadenaAux.length; i++)
                        cadenaAux2[i] = cadenaAux[i];
                    
                    cadenaAux2[cadenaAux.length] = palabra;
                    long_palabras.put(palabra.length(), cadenaAux2);
                }else{
                    for(Integer clave: long_palabras.keySet())
                        if(clave==palabra.length())
                            cadenaAux = long_palabras.get(clave);

                    cadenaAux2 = new String[cadenaAux.length+1];
                    for(int i=0; i<cadenaAux.length; i++)
                        cadenaAux2[i] = cadenaAux[i];
                    
                    cadenaAux2[cadenaAux.length] = palabra;
                    long_palabras.put(palabra.length(), cadenaAux2);
                }
            }else{
                cadenaAux = new String[1];
                cadenaAux[0] = palabra;
                long_palabras.put(palabra.length(), cadenaAux);
            }
        }
        return long_palabras;
    }
    
    private void imprimir(String[]cadenas, Map<Integer,String[]>mapa){
        for(Integer clave: mapa.keySet()){
            System.out.print(clave + "=[");
            for(int i=0; i<mapa.get(clave).length; i++){
                System.out.print(mapa.get(clave)[i]);
                if(i!=mapa.get(clave).length-1)
                    System.out.print(",");
            }
            System.out.print("]\n");
        }
    }
    
    public static void main(String[] args) {
        E1 e = new E1();
        String[]cadenas = {"to", "be", "or", "not", "that", "is", "the", "question"};
        Map<Integer, String[]>mapa = e.split(cadenas);
        e.imprimir(cadenas, mapa);
    }
    
}
