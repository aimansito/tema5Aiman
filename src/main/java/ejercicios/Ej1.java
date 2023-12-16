/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import static ejercicios.ej11.contarVocales;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aiman
 */
public class Ej1 {

    public static void main(String[] args) {
//       int[] buscandoLetra = buscarLetra('i');
//       for(int i = 0;i<buscandoLetra.length;i++){
//           System.out.println(buscandoLetra[i]);
//           if(buscandoLetra[i]!=-1){
//               System.out.println("La letra se encuentra en la posicion: "+i+1);
//           }
//       }
//       mostrarArray();
//       String[] vocalesMas=vocalesMas();
//       for(int i = 0;i<vocalesMas.length;i++){
//           System.out.println(vocalesMas[i]);
//       }
        String[] rellenarPalabras = rellenarPalabras();
        vocalesMas(rellenarPalabras);
    }

    public static int numeroPalabras() {
        boolean repetir = true;
        int numPalabras = 0;
        do {
            String num = JOptionPane.showInputDialog("Introduce el número de palabras inicial");
            try {
                numPalabras = Integer.parseInt(num);
                repetir = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduce un número entero");
            }
        } while (repetir);
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

    public static void mostrarArray() {
        String texto = "";
        String[] arrayPalabras = rellenarPalabras();
        for (int i = 0; i < arrayPalabras.length; i++) {
            texto += " Posición:" + i + " Palabra: " + arrayPalabras[i]
                    + "||";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public static String[] vocalesMas(String[] rellenarPalabras) {
        String[] arrayNuevoVocalesMas = new String[rellenarPalabras.length];
        int contador = 0;
        int contadorPalabras = 0;
        for (int i = 0; i < rellenarPalabras.length; i++) {
            for (int j = 0; j < rellenarPalabras[i].length(); j++) {
                if (rellenarPalabras[i].charAt(j) == 'a'
                        || rellenarPalabras[i].charAt(j) == 'e'
                        || rellenarPalabras[i].charAt(j) == 'i'
                        || rellenarPalabras[i].charAt(j) == 'o'
                        || rellenarPalabras[i].charAt(j) == 'u') {
                    contador++;
                }
            }
            int contadorVocales = contarVocales(rellenarPalabras[i]);
            if (contadorVocales >= 3) {
                arrayNuevoVocalesMas[contadorPalabras] = rellenarPalabras[i];
                System.out.println("La palabra " + arrayNuevoVocalesMas[contadorPalabras] + " tiene tres vocales o más");
                contadorPalabras++;
            } else {
                System.out.println("La palabra " + rellenarPalabras[i] + " no tiene más de 3 vocales");
            }
        }
        return arrayNuevoVocalesMas;
    }

    public static String[] vocalesMenos() {
        String[] arrayVocalesMenos = rellenarPalabras();
        String[] arrayNuevoVocalesMas = new String[arrayVocalesMenos.length];
        int contador = 0;
        int contadorPalabras = 0;
        for (int i = 0; i < arrayVocalesMenos.length; i++) {
            for (int j = 0; j < arrayVocalesMenos[i].length(); j++) {
                if (arrayVocalesMenos[i].charAt(j) == 'a'
                        || arrayVocalesMenos[i].charAt(j) == 'e'
                        || arrayVocalesMenos[i].charAt(j) == 'i'
                        || arrayVocalesMenos[i].charAt(j) == 'o'
                        || arrayVocalesMenos[i].charAt(j) == 'u') {
                    contador++;
                }
            }
            int contadorVocales = contarVocales(arrayVocalesMenos[i]);
            if (contadorVocales <= 3) {
                arrayNuevoVocalesMas[contadorPalabras] = arrayVocalesMenos[i];
                System.out.println("La palabra " + arrayNuevoVocalesMas[contadorPalabras] + " tiene tres vocales o menos");
                contadorPalabras++;
            } else {
                System.out.println("La palabra " + arrayVocalesMenos[i] + " tiene más de 3 vocales");
            }
        }
        return arrayVocalesMenos;
    }

    public static int[] buscarLetra(char buscar) {
        String[] Letra = rellenarPalabras();
        int[] letrasPosicion = new int[Letra.length];
        for (int i = 0; i < Letra.length; i++) {
            for (int j = 0; j < Letra[i].length(); j++) {
                if (Letra[i].charAt(j) == buscar) {
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
