/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class ParteC {
    //En este ejercicio hay que implementar un programa que pida al usuario por 
    //teclado la altura de la copa de un árbol , indicada como filas de una matriz 
    //(entre 2 y 10 ) y guarde la representación del árbol en un array de dos dimensiones, 
    //teniendo en cuenta que la altura del tronco siempre es 2 (filas). 
    //Una vez solicitada la altura de la copa del árbol, este dato se pasará a un método 
    //que generará  y devolverá el array de dos dimensiones con la representación del arbolito,
    //teniendo en cuenta las dimiensiones de copa y tronco del árbol. 
    //Este método debe permitir cualquier altura de copa (filas de la mátriz) 
    //positiva mayor que cero, aunque inicialmente nuestro programa limite la altura entre 2 y 10, 
    //teniendo en cuenta que el tronco siempre tiene una altura de dos filas.

    //Una vez generado el árbol, debe mostrarse por consola. 

    //Consultar imágenes adjuntas para ver ejemplos de ejecución, teniendo en cuenta 
    //que en estos ejemplos de las imágenes el árbol se representa con "1". 
    //Los ejemplos representan árboles de altura de copa 8, altura de copa 5 y altura de copa 2.
    //Puedes representar el árbol con el carácter que más te guste, siempre y cuando se vea apropiadamente en la consola.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //altura de la copa entre 2 y 10 
        int alturaCopa = 3;
        int alturaTronco = 2;
        
        char[][] arbol = rellenarMatriz(alturaCopa, alturaTronco);
        mostrarArbol(arbol);
    }
    public static char[][] rellenarMatriz(int alturaCopa, int alturaTronco) {
        char[][] arbol = new char[alturaCopa + alturaTronco][alturaCopa * 2 - 1];
        // Inicializar matriz con espacios en blanco
        for (int i = 0; i < alturaCopa + alturaTronco; i++) {
            for (int j = 0; j < alturaCopa * 2 - 1; j++) {
                arbol[i][j] = ' ';
            }
        }
        // Dibujar el triángulo del árbol
        for (int fila = 0; fila < alturaCopa; fila++) {
            for (int espacio = 0; espacio < alturaCopa - fila - 1; espacio++) {
                arbol[fila][espacio] = ' ';
            }
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                arbol[fila][alturaCopa - fila - 1 + asterisco] = '*';
            }
        }
        // Dibujar el tronco del árbol
        for (int a = alturaCopa; a < alturaCopa + alturaTronco; a++) {
            for (int j = alturaCopa - 1; j < alturaCopa; j++) {
                arbol[a][j] = '*';
            }
        }
        return arbol;
    }
    public static void mostrarArbol(char[][] arbol){
        for(int i = 0;i<arbol.length;i++){
            System.out.println("");
            for(int j = 0;j<arbol[i].length;j++){
                System.out.print(arbol[i][j]);
            }
        }
    }
}
