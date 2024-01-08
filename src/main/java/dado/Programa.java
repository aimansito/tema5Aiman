/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dado;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Programa {
    public static void main(String[] args) {
        
        LanzarDado dado1 = new LanzarDado(10);
        System.out.println(dado1);
        System.out.println("----------");
        System.out.println(dado1.devolverNumCaras(6));
        System.out.println("----------");
        dado1.borrarCaras(5);
        System.out.println(dado1);
       
    }
}
