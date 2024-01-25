/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraybidimensionales;

/**
 *
 * @author aiman
 */
public class ejemplo {
    public static void main(String[] args) {
        //matriz de 2x2 de int
        int[][] matrizInt = new int[2][2];
        //inicializacion de valores manualmente
        /*
                 col1 col2
        Fila 1 -> 3 , 5
        Fila 2 -> 1, 9
        */
        matrizInt[0][0] = 3;
        matrizInt[0][1] = 5;
        matrizInt[1][0] = 1;
        matrizInt[1][1] = 9;
        
        System.out.println("Elemento f1 c1: "+matrizInt[0][0]);
        
        //4 filas y 3 columnas por fila,12 elementos 
        int [][] matriz2 = {
            {3,4,5},
            {6,7,8,3,6},
            {9,10,11},
            {0,0,0}
        };

            System.out.println("Filas de matriz 2: "+matriz2.length);
        System.out.println("Columnas de matriz 2 , fila 2: "+matriz2[1].length);
        ///Recorrido de todos los elementos de la matriz
        //recorremos las filas con length 
        //en cada fila, recorremos las columnas(matriz2[n].length)
        for(int i = 0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[i].length;j++){
                System.out.println("Elemento de i,j "+i+j+":"+matriz2[i][j]);
            }
        }
    }
}
