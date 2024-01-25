package catalogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aiman
 */
public class CatalogoLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("1","Platero y yo","Messi",
                "Planeta",123);
        Libro l2 = new Libro(l1);
        
        Libro l3 = new Libro("1","Platero y yo","Messi",
                "Mercurio",123);
        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(new Libro("143","Qijote","Cervantes",
                "Planeta",144));
        lista.add(new Libro ("141","Caperucita","Antonio",
                "Planeta",140));
        lista.add(new Libro ("142","Caperucita","Bartolo",
                "Mercurio",140));
        
        //ordenar por isbn
        
        Collections.sort(lista,(e1,e2)->l1.getTitulo().compareToIgnoreCase(e2.getIsbn()));
        
        lista.forEach(System.out::println);
        //ordenar d z - a
        System.out.println("-----------------------");
        Collections.sort(lista,(k1,k2)->k1.getNumPags()-k2.getNumPags());
        Collections.sort(lista,(k1,k2)->Integer.compare(k1.getNumPags(), k1.getNumPags()));
        
        System.out.println("----------------- ordenados por paginas");
        
        //ordenar de a - z
        Comparator<Libro> criterio = (e1,e2)->l1.getAutor().compareToIgnoreCase(e2.getAutor());
        Collections.sort(lista,criterio.reversed());
        lista.forEach(System.out::println);
        
        System.out.println("---------------");
        //recibe la lista donde buscar un objeto del mismo tipo que contiene  
        //la lista con la clave a buscar y el  criterio de ordenacion de la lista 
        //lista -- > lista 
        // new libro().setIsbn("lo que yo quiera")
        // criterio (e1,e2)->l1.getAutor().compareToIgnoreCase(e2.getAutor()); 
        Libro n = new Libro();
        n.setIsbn("123");
        n.setNumPags(3);
        n.setEditorial("Mercurio");
        System.out.println("---------------");
        int posicion = Collections.binarySearch(lista, lista.get(2),(e1,e2)->lista.get(2).getEditorial().compareToIgnoreCase(e2.getEditorial()));
        System.out.println("---------------");
        System.out.println("El libro de isbn esta en :  "+posicion);
        
        lista.forEach(System.out::println);
        
        //int posicion = Collections.binarySearch(lista, n, (e1, e2) -> l1.getEditorial().compareToIgnoreCase(e2.getEditorial()));

    }
}
