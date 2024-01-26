/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraybidimensionales;

import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author aiman
 */
public class Ejercicio3 {
    //En una clase con el main, usando métodos de clase a) Método que recibe un 
    //número "n" entre 1 y 10 y devuelve una matriz de nXn elementos aleatorios de tipo char. 
    //b) Método que recibe la matriz y un char y devuelve una lista de objetos 
    //Celda indicando las casillas donde se encuentra ese char dentro de la matriz.
    public static void main(String[] args) {
//        mostrarArray();
        int num = numAleatorio();
        char[][] matriz = matrizCharAleatorio(num);
        System.out.println(buscarPosicion(matriz, 'a'));
    }
    public static char[][] matrizCharAleatorio(int num){
        char[][] letras = new char[num][num];
        for(int i = 0;i<letras.length;i++){
           for(int j = 0;j<letras[i].length;j++){
               letras[i][j]= generarLetraAleatoria();
           }
        }
        return letras;
    }
    public static char generarLetraAleatoria(){
        String letras = "abcdefghijklmnñopqrstuvwxyz";
        Random random = new Random();   
        int letra = random.nextInt(letras.length());
        return letras.charAt(letra);
    }
    public static void mostrarArray(char[][] matriz){
        Random random = new Random();
        int num = random.nextInt(1,11);
        char[][] letras = matriz;
        for(int i = 0;i<letras.length;i++){
           for(int j=0;j<letras[i].length;j++){
               System.out.println(letras[i][j]);
           }
        }
    }
    public static int numAleatorio(){
       return new Random().nextInt(1,11);
    }
    public static ArrayList<Celda> buscarPosicion(char[][] letras,char letra){
        ArrayList<Celda> listaCelda = new ArrayList<>();
         for(int i = 0;i<letras.length;i++){
            for(int j = 0;j<letras[i].length;j++){
                if(letras[i][j]==letra){
                    listaCelda.add(new Celda(i,j));
                }
            }
        }
         return listaCelda;
    }
}
