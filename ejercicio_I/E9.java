/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_I;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class E9 {

    private Set<String> diccionario;
    private Set<String> segundoConjunto;
    private Set<String>erroresOrtograficos;

    public E9() {
        this.diccionario = new HashSet<>();
        this.segundoConjunto = new HashSet<>();
        this.erroresOrtograficos = new LinkedHashSet<>();
    }
    
    private void introducePalabraDiccionario(String palabra){
        diccionario.add(palabra);
    }
    
    private void imprimirDiccionario(){
        for(String palabra:diccionario){
            System.out.print(palabra + "\n");
        }
    }
    
    private void imprimirConjunto(){
        for(String palabra:segundoConjunto){
            System.out.print(palabra + "\n");
        }
    }
    
    private void imprimirErrores(){
        for(String palabra:erroresOrtograficos){
            System.out.println(palabra);
        }
    }
    
    private void introduceFrase(String frase){
        int pos = 0;
        for(int i=0; i<=frase.length()-1; i++){
            if(frase.charAt(i)==' ' ||i==frase.length()-1){
                segundoConjunto.add(frase.substring(pos,i+1));
                pos = i+1;
            }
        }
    }
    
    private Set<String> insertaErrores(){
        
        for(String palabra: segundoConjunto){
            if(!diccionario.contains(palabra.trim())){
                erroresOrtograficos.add(palabra);
            }
        }
        return erroresOrtograficos;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        E9 e = new E9();
        
        File fichero;
        FileReader fr;
        BufferedReader br;
        
        String frase;
        
        try{
            fichero = new File("C:\\Users\\jorge\\Desktop\\DAM\\PROG\\estructurasDinamicas\\src\\ejercicio_I\\archivo.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            
            System.out.println("---------------DICCIONARIO---------------");
            String linea;
            while((linea=br.readLine())!=null)
                e.introducePalabraDiccionario(linea);
            
            e.imprimirDiccionario();
            
            
        }catch(Exception exc){
            exc.printStackTrace();
        }
        
        System.out.println("Ingresa una frase");
        frase = sc.nextLine();
        e.introduceFrase(frase);//introduce frase ak segundo conjunto
        
        
        e.insertaErrores();
        e.imprimirErrores();
    }
    
}
