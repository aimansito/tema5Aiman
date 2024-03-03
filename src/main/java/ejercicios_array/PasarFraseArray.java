/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_array;

import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class PasarFraseArray {
    public static void main(String[] args) {
        //dada una frase que nos proporciona el usuario. pasarlo a un array de char
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una frase");
        String frase = teclado.nextLine();
        
        char caracter[] = new char[frase.length()];
        for(int i = 0;i<frase.length();i++){
            caracter[i]=frase.charAt(i);
            System.out.println(caracter[i]);
        }
    }
}
