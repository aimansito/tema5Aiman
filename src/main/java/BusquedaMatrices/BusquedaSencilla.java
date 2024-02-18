/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusquedaMatrices;

/**
 *
 * @author aiman
 */
public class BusquedaSencilla {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,  2,  3,  4,  5,  6,  7},
            {8,  9,  10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42},
            {43, 44, 45, 46, 47, 48, 49}
        };
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int c = -1;
        int f = -1;
        
        int dato = 56;
        
        for(int i = 0;i<filas;i++){
            for(int j = 0;j<columnas;j++){
                if(dato == matriz[i][j]){
                    f = i;
                    c = j;
                   System.out.println("El dato se encuentra en la fila "+filas+" y la columna "+columnas); 

//                    break; con esto sale la primera busquecda
                }
            }
//            if(c !=-1){
//                break;
//            }
        }
        
        if(c == -1 && f == -1){
            System.out.println("El dato no está en la matriz");
//        }else{
//            System.out.println("El dato se encuentra en la fila "+filas+" y la columna "+columnas); con esto muestras la ultima 
        }
    }
}
