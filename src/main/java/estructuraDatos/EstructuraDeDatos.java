/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuraDatos;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class EstructuraDeDatos {
    public static void main(String[] args) {
        
        //la lista tiene tamaño 0 y no tinee elementos 
        ArrayList<Integer> lista = new ArrayList<>();
        // tamaño
        System.out.println("Tamaño: "+lista.size());
        //mostrar lista
        System.out.println(lista);
        //añadir al final un elemento 
        lista.add(12);
        lista.add(14);
        lista.add(16);
        lista.add(18);
         System.out.println("Tamaño: "+lista.size());
        //mostrar lista
        System.out.println(lista);
        System.out.println("Elemento de la posicion 2: "+lista.get(2));
        try{
            System.out.println("Elemento posicion 10 "+lista.get(10));
        }catch(IndexOutOfBoundsException iobe){
            System.out.println("Te has salido de los índices");
        }
    }
}
