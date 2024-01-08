/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author aiman
 */
public class Ej0801 {
    
    //En un programa nuevo, crea dos listas de tamaño aleatorio de letras entre 
    //la 'a' y la 'z'. Estas listas deben tener entre 10 y 20 elementos. Una vez 
    //creadas las listas, imprime por pantalla sus elementos usando un foreach. 
    //Crea una tercera lista con los elementos de la primera que no están en la 
    //segunda. Imprime el resultado usando API Stream y lambdas.
    
    public static void main(String[] args) {
        String aleatorio = "";
        Random random = new Random();
        int num1 = 2;
        ArrayList<String> letras1 = new ArrayList<>(num1);
        for(int i = 0;i<num1;i++){
            letras1.add(aleatorio = RandomStringUtils.randomAlphabetic(3));
        }
        for(String aux:letras1){
            System.out.print(" Lista 1: "+aux);
        }
        ArrayList<String> letras2 = new ArrayList<>(num1);
        for(int i = 0;i<num1;i++){
            letras2.add(aleatorio = RandomStringUtils.randomAlphabetic(1));
        }
        for(String aux:letras2){
            System.out.print(" Lista 2: "+aux);
        }
        System.out.println("-----------------");
        ArrayList<String> letras3 = new ArrayList<>();
        for (int i = 0; i < letras1.size(); i++) {
            if (!letras1.get(i).equals(letras2.get(i))) {
                letras3.add(letras1.get(i));
            }
        }
        System.out.println("-----------");
        //Api Stream
        letras3.forEach(e->System.out.println("Lista 3: "));
        //lambda
        letras3.forEach(System.out::println);
    }
}
