/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author jorge
 */
public class E1 {
    private Map<String, Integer>mapa;
    
    public E1() {
        this.mapa = new HashMap<>();
    }
    
    private void leerArchivo(){
        String palabra;
        try {
            Scanner in = new Scanner(new File("C:\\Users\\jorge\\Desktop\\DAM\\PROG\\estructurasDinamicas\\src\\maps\\ejercicios\\palabras.txt"));
            
            while(in.hasNextLine()){
                palabra = in.nextLine();
                if(mapa.containsKey(palabra) && !palabra.equals(" ")){
                    mapa.put(palabra, mapa.get(palabra)+1);
                }else  
                    mapa.put(palabra, 1);
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    private void imprimirMapa(){
        for(String clave: mapa.keySet()){
            System.out.println(clave + "->" + mapa.get(clave));
        }
    }
    
    public static void main(String[] args) {
        E1 e = new E1();
        e.leerArchivo();
        e.imprimirMapa();
    }
    
}
