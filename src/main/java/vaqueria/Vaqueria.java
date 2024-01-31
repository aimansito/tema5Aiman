/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaqueria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aiman
 */
public class Vaqueria {
//    PARTE A
//Aplica lo estudiado para realizar una nueva clase llamada Vaquería, 
//con una estructura SET como atributo para que contenga un número de vacas indeterminado. 
//El constructor debe inicializar la estructura SET (no hay animales duplicados y el orden no importa). Debe haber métodos para:
//4. Saber si un animal está en la vaquería.
//4. Sacar todos los animales, en forma de ArrayList.
//5. Dar de baja una vaca de la vaquería.
//
   private Set<Vaca> vacas ;

    public Vaqueria() {
        this.vacas = new HashSet<>();
    }
    
    //1. Saber el número de vacas que hay.
    public int numVacas(){
        return vacas.size();
    }
    //2. Añadir un animal a la vaquería.
    public Set<Vaca> añadirAnimales(Vaca vaca){
        vacas.add(vaca);
        return vacas;
    }
    //3. Saber si la vaquería tiene vacas.
    public boolean estaVaca(Vaca vaca){
       return vacas.contains(vaca);
    }
     //4. Saber si un animal está en la vaquería.
    public boolean estaVacia(){
        return vacas.isEmpty();
    }
    //5. Sacar todos los animales, en forma de ArrayList.
    public ArrayList<Vaca> sacarAnimales(){

        ArrayList<Vaca> totalAnimales = new ArrayList<>(vacas);

        return totalAnimales;
        //for each para recorrer el set y hac
    }
    //6. Dar de baja una vaca de la vaquería.
    public void darBaja(Vaca vaca){
        vacas.remove(vaca);
    }
    public void mostrarSet(){
        vacas.forEach(System.out::println);
    }
}
