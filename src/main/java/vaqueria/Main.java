/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaqueria;

import java.time.LocalDate;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        Vaqueria v1 = new Vaqueria();
        Vaca vaca1 = new Vaca(1, LocalDate.of(2001, 2, 2),"Vaca terrestre");
        Vaca vaca2 = new Vaca(2, LocalDate.of(2003, 2, 2),"Vaca voladora");
        v1.añadirAnimales(vaca1);
        v1.añadirAnimales(vaca2);
        v1.mostrarSet();
        v1.darBaja(vaca2);
        System.out.println( v1.estaVaca(vaca2));
        System.out.println(v1.estaVacia());
        System.out.println(v1.numVacas());
        v1.sacarAnimales();
    }
}
