/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_matrices;

import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class Alumno {
     public static void main(String[] args) {
        Double[][] matriz = new Double[4][4];
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0;
        //rellenar matriz
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz[i].length-1;j++){
                System.out.println("Introduce el alumno nº"+i);
                matriz[i][j] = teclado.nextDouble();
                suma += matriz[i][j];
            }
            matriz[i][3] = suma / 3;
            suma = 0.0;
        }
        //recorrer matriz
        for(int i = 0;i<matriz.length;i++){
            System.out.println("las notas del alumno nº"+i+"son");
            for(int j = 0;j<matriz[i].length-1;j++){
                System.out.println("Nota nº"+j+matriz[i][j]);
            }
            System.out.println("El promedio de las notas es: "+matriz[i][3]);
        }
    }
}
