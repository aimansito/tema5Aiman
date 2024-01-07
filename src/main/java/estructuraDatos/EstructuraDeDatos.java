/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuraDatos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

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
        //añade el elemento en la posicion indicada
        //la posicion debe ser mayor o igual que 0 y menor que el tamaño de la lista
        lista.add(2,20);
        //cambiar un dato de una posicion
        lista.set(3, 7);
        System.out.println(lista);
        if(lista.isEmpty()){
            System.out.println("La lista está vacía");
        }
        
        System.out.println("Elemento 18: "+lista.contains(100));
        System.out.println("Posición donde está el elemento 7: "+ lista.indexOf(20));
        //borrado por objet
        lista.remove(Integer.valueOf(20));
        //borrado por posicion (int)
        lista.remove(0);
        System.out.println(lista);
        System.out.println("-----------------------");
        // formas de recorrer la lista
        for(int i = 0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("---------------------");
        //for each
        for(Integer aux:lista){
            System.out.println(aux);
        }
        //recorrido con un iterador
        Iterator<Integer> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------");
        //EXPRESION LAMBDA Y API STREAM
        lista.forEach(e->System.out.println(e));
        
        lista.forEach(System.out::println);
    }
}
