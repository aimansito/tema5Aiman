/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_array;

/**
 *
 * @author aiman
 */
public class InvertirArray {
    //dado un array de números (podemos declarar los valores de forma inmediata)
    //invertir los valores el primero en el final,el final en el primero y asi con todos
    public static void main(String[] args) {
        
        //declaro los numeros inmediatamente 
        int[] numeros = {1,2,3,5,6,7};
        
        int[] numerosInv = new int[numeros.length];
        
        for(int i = numeros.length-1, j=0;i>=0;i--,j++){
            numerosInv[j]=numeros[i];
        }
        
        numeros=numerosInv;
        
        for(int i = 0;i<numeros.length;i++){
            System.out.print(numeros[i]);
        }
    }
}
