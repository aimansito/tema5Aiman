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
public class Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        
        System.out.println("Introduce el tamaño de la matriz");
        System.out.println("Fila:");
        fila = teclado.nextInt();
        System.out.println("Columna: ");
        columna = teclado.nextInt();
        int[][] numeros = new int[fila][columna];
        for(int i = 0;i<numeros.length;i++){
            for(int j = 0;j<numeros[i].length;j++){
                numeros[i][j] = teclado.nextInt();
            }
        }
        /// sumas de col y filas
        for(int i = 0;i<numeros.length;i++){
            sumaFilas = 0;
            for(int j = 0;j<numeros[i].length;j++){
                sumaFilas += numeros[i][j];
            }
            System.out.println("la suma de la fila "+i+" es "+sumaFilas);
        }
        for(int j = 0;j<columna;j++){
            sumaColumnas=0;
            for(int i = 0;i<fila;i++){
               sumaColumnas+= numeros[i][j]; 
            }
            System.out.println("La suma de la columna "+j+" es "+sumaColumnas);
        }
         //mostrar matriz
        for(int i = 0;i<numeros.length;i++){
            for(int j = 0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j]+"");
            }
            System.out.println("");
        }
    }
}
