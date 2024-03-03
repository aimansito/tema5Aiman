/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author aiman
 */
public class Arbol {
    public static void main(String[] args) {
        //altura del arbol
        int altura = 3;
        //bucle para reccorrer todas las filas (altura)
        for(int fila = 0;fila<altura;fila++){
            //bucles para los espacios
            for(int espacio=0;espacio<(altura-fila-1);espacio++){
                System.out.print(" ");
            }
            //bucles para asteriscos
            for(int asterisco=0;asterisco<(fila*2)+1;asterisco++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int largoTronco = 2;
        for(int base = 0;base<largoTronco;base++){
            for(int espacio=0;espacio<(altura-2);espacio++){
                System.out.print(" ");
            }
            for(int tronco = 0;tronco<1;tronco++){
                System.out.print(" *");
            }
            
            System.out.println("");
        }
    }
}
