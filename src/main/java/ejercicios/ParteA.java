/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author aiman
 */
public class ParteA {
    //a) Lee un número por teclado usando JOption. Si no es un número, se debe 
    //leer de nuevo. Convierte el número leído a un array de char. Implementa un
    //método recursivo para saber si el array de char contiene un número capicúa.
    public static void main(String[] args) {
        int num = 0;
        char[] numeros = pasarArray(leerNum());
        for(int i = 0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    public static String leerNum(){
        boolean repetir = true;
        String num = "";
        do{
            try{
                num = JOptionPane.showInputDialog(null, "Introduce un valor: ");
                repetir = false;
            }catch(NumberFormatException nfe){
                System.out.println("Introduce un número");
                
            }
        }while(repetir);
        
        return num;
    }
    private static char[] pasarArray(String s){
        return s.toCharArray();
    }
     private static boolean esCapicua(char[] c, int ini, int fin) {
        if (c.length == 1) {
            return true;
        }
        if (c[ini] != c[fin]) {
            return false;
        }
        if (ini > (c.length / 2)) {
            return false;
        } else {
            esCapicua(c, ini + 1, fin - 1);
        }
        return true;
    }
}
