/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author aiman
 */
public class NumeroCapicua {
    public static void main(String[] args) {
        int numeros[]={9,0,0,9};
        int aux[]=new int[numeros.length]; 
        
        for(int i = numeros.length-1,j=0;i>=0;i--,j++){
            aux[j]=numeros[i];
            System.out.println(aux[j]);
        }
        
        if(Arrays.equals(numeros, aux)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}
