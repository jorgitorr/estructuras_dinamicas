/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_I;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jorgearru
 */
public class E8 {
    private List<Dino>dinos;

    public E8() {
        this.dinos = new LinkedList<>();
    }
    

    private void mostrar(){
        for(Dino dino: dinos){
            System.out.println(dino);
        }
    }
    
    private void introduceArray(Dino[]arrayDinos){
        dinos = Arrays.asList(arrayDinos);
    }
    
    
    public static void main(String[] args) {
        Dino dino1 = new Dino("T-Rex","6-9T","68-66M");
        Dino dino2 = new Dino("Coelophysoidea","30kg","209-201M");
        Dino dino3 = new Dino("Austroraptor","400kg","70M");
        Dino dino4 = new Dino("Brohisaurus","80T","150-155M");
        Dino dino5 = new Dino("Moros","78kg","94,4");
        
        Dino[]arrayDinos = {dino1,dino2,dino3, dino4, dino5};
        
        E8 e = new E8();
        e.introduceArray(arrayDinos);
        e.mostrar();
    }
    
}
