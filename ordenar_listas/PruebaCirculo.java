/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jorgearru
 */
public class PruebaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Circulo>circulos = new ArrayList<>();
        Circulo c1 = new Circulo(3,5,4.5);
        Circulo c2 = new Circulo(2,6,8.25);
        Circulo c3 = new Circulo(5,3,8.767);
        
        circulos.add(c1);
        circulos.add(c2);
        circulos.add(c3);
        
        System.out.println(circulos);
        Collections.sort(circulos);
        System.out.println(circulos);
    }
    
}
