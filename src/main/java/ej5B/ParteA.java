/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5B;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class ParteA {
//EJERCICIO A.- Mayor fila menor columna
//
//Implementar un programa que permita encontrar el elemento mayor de una fila y 
//menor de una columna de un array de N filas x N columnas números enteros. Para ello, el programa tendrá varias opciones: 
//a) El programa solicitará al usuario el número N (entre 3 y 6) y creará una matriz con los números que introduzca el usuario por teclado.
//b) El programa solicitará al usuario el número N (entre 3 y 6) y creará una matriz con los números aleatorios entre 0 y 20.
//Una vez creada la matriz con los datos, ésta se pasará a un método que se 
//encargará de devolver la Coordenada (clase que debes crear) del número que 
//es mayor o igual a todos los de su fila y menor o igual a todos los de su columna, si existe. Si no existe indicará la coordenada (-1 , -1).
//Se debe imprimir por consola la matriz creada en a) o b) y la coordenada generada, para comprobar que el resultado obtenido es correcto.
//Por ejemplo, en la siguiente matriz de 3X3, la coordenada a devolver sería fila 2 columna 0.
//
//10  9  8
//9   10 11
//8    8   5


    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        System.out.println("Elige una opción: ");
        int num = teclado.nextInt();
        switch(num){
            case 1:
                System.out.println("Introduce el tamaño de la matriz: ");
                n = teclado.nextInt();
                int[][] numeros = new int[n][n];
                for(int i = 0;i<numeros.length;i++){
                    for(int j = 0;j<numeros[i].length;j++){
                        System.out.println("Introduce el valor a la matriz");
                        numeros[i][j]=teclado.nextInt();
                    }
                }
                System.out.println("---------------------------");
                for(int i = 0;i<numeros.length;i++){
                    for(int j = 0;j<numeros[i].length;j++){
                        System.out.print(numeros[i][j]);
                        
                    }
                }
            break;
            case 2:
                System.out.println("Introduce el tamaño de la matriz: ");
                n = teclado.nextInt();
                int[][] digitos = new int[n][n];
                for(int i = 0;i<digitos.length;i++){
                    for(int j = 0;j<digitos[i].length;j++){
                        digitos[i][j]=random.nextInt(0,21);
                    }
                }
                System.out.println(Coordenada.devolverPosicion(digitos));
            break;
        }
    }
}
