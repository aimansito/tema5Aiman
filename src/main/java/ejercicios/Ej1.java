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
public class Ej1 {

    public static void main(String[] args) {
        String[] rellenarPalabras = rellenarPalabras();
        mostrarArray(rellenarPalabras);

        String[] vocalesMas=vocalesMas(rellenarPalabras);
        for(int i = 0;i<vocalesMas.length;i++){
            System.out.println("Las palabras con 3 vocales o más son: "+vocalesMas[i]);
        }
        
        String[] vocalesMenos=vocalesMenos(rellenarPalabras);
        for(int i = 0;i<vocalesMenos.length;i++){
            System.out.println("Las palabras con 3 vocales o menos son: "+vocalesMenos[i]);
        }
        
        int[] buscandoLetra = buscarLetra('i',rellenarPalabras);
        for(int i = 0;i<buscandoLetra.length;i++){
            System.out.println(buscandoLetra[i]);
            if(buscandoLetra[i]!=-1){
                System.out.println("La letra se encuentra en la posicion: "+i);
            }
        }
    }

    public static int numeroPalabras() {
        boolean repetir = true;
        int numPalabras = 0;
        do{
            String num = JOptionPane.showInputDialog("Introduce el número de palabras inicial");
            try{
                numPalabras = Integer.parseInt(num);
                repetir = false;
            }catch (NumberFormatException nfe) {
                System.out.println("Introduce un número entero");
            }
        }while (repetir);
        return numPalabras;
    }

    public static String[] rellenarPalabras() {
        boolean repetir = true;
        Scanner teclado = new Scanner(System.in);
        int numPalabras = numeroPalabras();
        String[] arrayPalabras = new String[numPalabras];
        for (int i = 0; i < numPalabras; i++) {
            do {
                try {
                    System.out.println("Introduce las palabras correspondientes");
                    arrayPalabras[i] = teclado.nextLine();
                    repetir = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Introduce una palabra válida");
                }
            } while (repetir);
        }
        return arrayPalabras;
    }

    public static void mostrarArray(String[] rellenarPalabras) {
        String texto = "";
        for (int i = 0; i < rellenarPalabras.length; i++) {
            texto += " Posición:" + i + " Palabra: " + rellenarPalabras[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String[] vocalesMas(String[] rellenarPalabras) {
        String[] arrayNuevoVocalesMas = new String[rellenarPalabras.length];
        int contadorPalabras = 0;
        for (int i = 0; i < rellenarPalabras.length; i++) {
            int contadorVocales = contarVocales(rellenarPalabras[i]);
            if (contadorVocales >= 3) {
                arrayNuevoVocalesMas[contadorPalabras] = rellenarPalabras[i];
                contadorPalabras++;
            } 
        }
        return arrayNuevoVocalesMas;
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
    public static String[] vocalesMenos(String[] rellenarPalabras) {
        String[] arrayNuevoVocalesMas = new String[rellenarPalabras.length];
        int contador = 0;
        int contadorPalabras = 0;
        for (int i = 0; i < rellenarPalabras.length; i++) {
            int contadorVocales = contarVocales(rellenarPalabras[i]);
            if (contadorVocales <= 3) {
                arrayNuevoVocalesMas[contadorPalabras] = rellenarPalabras[i];
               contadorPalabras++;
            } 
        }
        return rellenarPalabras;
    }

    public static int[] buscarLetra(char buscar,String[] Letra) {
        int[] letrasPosicion = new int[Letra.length];
        for (int i = 0; i < Letra.length; i++) {
            for (int j = 0; j < Letra[i].length(); j++) {
                if (Letra[i].toLowerCase().charAt(j) == buscar) {
                    letrasPosicion[i] = j;
                    break;
                } else {
                    letrasPosicion[i] = -1;
                }
            }
        }
        return letrasPosicion;
    }
}
