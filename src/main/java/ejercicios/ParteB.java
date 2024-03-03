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
public class ParteB {
    //b) Usando JOption, solicita al usuario que introduzca una frase cualquiera,
    //guardando la frase en un objeto String. Muestra la frase por consola, así
    //como su tamaño. Crea un método que devuelva el índice, dentro del String, 
    //de la primera ocurrencia del char que se pase como parámetro. 
    //Crea otro método para devolver, en un array, las posiciones dentro del String 
    //donde se encuentre el char que se pasa como parámetro. Recorre los elementos del String, 
    //imprimiendo su valor unicode e indicando si es una letra mayúscula o minúscula o un dígito
    //(usa la clase envolvente Character). Elimina todos los espacios en blanco que haya en la cadena. 
    //Imprime la nueva cadena y su tamaño.
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Introduce una frase");
        System.out.println(frase+""+frase.length());
        System.out.println(indiceLetra(frase, 'a'));
        StringBuilder nuevaCadena = new StringBuilder();
        for(int i = 0;i<frase.length();i++){
            char letra = frase.charAt(i);
            if(Character.isLowerCase(letra)){
                System.out.println(letra+" Es una letra mínuscula");
            }else if(Character.isUpperCase(letra)){
                System.out.println(letra+" Es una letra mayúscula");
            }else if(!(Character.isWhitespace(letra))){
                nuevaCadena.append(letra);
                System.out.println("Caracter: " + letra + ", Valor Unicode: " + (int)letra);
            }else if(Character.isDigit(letra)){
                System.out.println(letra+ " Es un dígito");
            }
        }
        System.out.println(nuevaCadena.toString());
        System.out.println(nuevaCadena.length());
    }
    public static String indiceLetra(String frase,char a){
        String indice = "";
        for(int i = 0;i<frase.length();i++){
            if(frase.charAt(i)==a){
                indice = frase+Integer.toString(i);
                break;
            }
        }
        return indice;
    }
}
