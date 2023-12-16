/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aiman
 */
public class ej11 {
       public static void main(String[] args) {
       vocalesMas();
    }
   public static int numeroPalabras() {
        boolean repetir = true;
        int numPalabras = 0 ; 
        do {
            String num = JOptionPane.showInputDialog("Introduce el número de palabras inicial");
            try {
               numPalabras = Integer.parseInt(num);
               repetir = false;
            } catch(NumberFormatException nfe) {
                System.out.println("Introduce un número entero");
            }
        } while(repetir);
        return numPalabras;
    }
    public static  String[] rellenarPalabras() {
        boolean repetir = true;
        Scanner teclado = new Scanner(System.in);
        int numPalabras = numeroPalabras();
        String[] arrayPalabras = new String[numPalabras];
        for (int i = 0; i < numPalabras; i++) {
           do{
               try{
                   System.out.println("Introduce las palabras correspondientes");
                   arrayPalabras[i]= teclado.nextLine();
                   repetir=false;
               }catch(InputMismatchException ime){
                   System.out.println("Introduce una palabra válida");
               }
           }while(repetir);
        }
        return arrayPalabras;
    }
    public static void mostrarArray(){
        String[] arrayPalabras = rellenarPalabras();
        for(int i = 0;i<arrayPalabras.length;i++){
            JOptionPane.showMessageDialog(null,"Posición: "+i+" Palabra: "+arrayPalabras[i]);
        }
    }
    public static void vocalesMas() {
    String[] arrayVocalesMas = rellenarPalabras();
    String[] arrayNuevoVocalesMas = new String[arrayVocalesMas.length];
    int contadorPalabras = 0;

    for (int i = 0; i < arrayVocalesMas.length; i++) {
        int contadorVocales = contarVocales(arrayVocalesMas[i]);

        if (contadorVocales >= 3) {
            arrayNuevoVocalesMas[contadorPalabras] = arrayVocalesMas[i];
            System.out.println("La palabra " + arrayNuevoVocalesMas[contadorPalabras] + " tiene tres vocales o más");
            contadorPalabras++;
        } else {
            System.out.println("La palabra " + arrayVocalesMas[i] + " no tiene más de 3 vocales");
        }
    }
}
public static int contarVocales(String palabra) {
    int contadorVocales = 0;
    for (int j = 0; j < palabra.length(); j++) {
        char letra = Character.toLowerCase(palabra.charAt(j));
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contadorVocales++;
        }
    }
    return contadorVocales;
}
    public static void vocalesMenos(){
        String[] arrayVocalesMenos = rellenarPalabras();
        int contador = 0;
        int contadorPalabras = 0;
        for(int i = 0;i<arrayVocalesMenos.length;i++){
                for (int j = 0; j < arrayVocalesMenos[i].length(); j++) {
                    if (arrayVocalesMenos[i].charAt(j) == 'a') {
                        contador++;
                    }
                    if (arrayVocalesMenos[i].charAt(j) == 'e') {
                        contador++;
                    }
                    if (arrayVocalesMenos[i].charAt(j) == 'i') {
                        contador++;
                    }
                    if (arrayVocalesMenos[i].charAt(j) == 'o') {
                        contador++;
                    }
                    if (arrayVocalesMenos[i].charAt(j) == 'u') {
                        contador++;
                    }
                }   
            if (contador < 3) {
                String[] arrayNuevoVocalesMenos = new String[contadorPalabras++];
                arrayNuevoVocalesMenos[i]=arrayVocalesMenos[i];
                System.out.println("La palabra " + arrayVocalesMenos[i] + " tiene menos de 3 vocales");
            } else {
                System.out.println("La palabra " + arrayVocalesMenos[i] + " tiene más de 3 vocales");
            }   
        }
    }
}