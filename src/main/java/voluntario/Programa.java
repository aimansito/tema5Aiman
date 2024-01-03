/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voluntario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class Programa {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Generando número aleatorio...");
        int num = 0;
        boolean repetir=true;
        ArrayList<String> nombres = nombres();
        do{
            do{
                try{
                    num = random.nextInt(1,30);
                    repetir=false;
                }catch(IndexOutOfBoundsException iobe){
                    System.out.println("Ese compañero ya fue voluntario");
                }
            }while(repetir);
        }while(num>nombres.size());
        System.out.println("El número "+num+" corresponde con el/la compañero/a: "+ nombres.get(num));
        nombres.remove(num);
    }
    public static ArrayList<String> nombres(){
         ArrayList<String> nombres = new ArrayList<>(Arrays.asList(
            "José Antonio Acebedo Aragón",
            "Khaoula Acemi",
            "Rocío Alcalá Aranda",
            "Clara Isabel Álvarez Aragón",
            "Eduardo Correa Aranda",
            "Nuria Del Río Olmedo",
            "Rafael Díaz Delgado",
            "Victoria Fernández González",
            "Tomás Ariel González Atienza",
            "Alejandro Luque Maillo",
            "Víctor Mena Flores",
            "Francisco Pablo Millán Ortiz",
            "Óscar Morales Vallejo",
            "Pablo Navarro García",
            "Samuel Navarro García",
            "Daniel José Navarro Moyano",
            "Daniel Navas Borjas",
            "Sebastián Oquendo García",
            "Noelia Pérez González",
            "Khalid Rachafi el Hausi",
            "Antonio Ramírez Navas",
            "Adam Christopher Ridings",
            "Jesús Romo Miranda",
            "Ismael Shehata Pérez",
            "Yumara Vallejo Vallejo",
            "Adrián Viana García",
            "Miguel Ángel Victoria Martín",
            "Guillermo Virués"
         ));
        return nombres;
    }
}
