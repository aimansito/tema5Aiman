/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Prueba {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        Avion a1 = new Avion();
        Avion a2 = new Avion(20, 5);

        System.out.println("En que avion te quires subir: \n"
                + "1) Aerolineas Moreno\n"
                + "2) Chocus Airlines");
        int avion = tec.nextInt();

        switch (avion) {
            case 1:
                avion1(a1);
                break;
            case 2:
                avion2(a2);
                break;
        }
    }

    private static void avion1(Avion a1) {

        boolean repetir = false;
        do{
            repetir = false;
            
            int opcion = menu();

            switch (opcion) {
                case 1:
                    int asientoR;
                    do {
                        System.out.println("Que asiento quiere reserar?\n"
                                + "Indique numero:");

                        asientoR = tec.nextInt();
                    } while (asientoR > 120 || asientoR < 0);

                    repetir = a1.reservar(asientoR);

                    break;
                case 2:

                    int asientoC;

                    do {
                        System.out.println("Que asiento quiere cancelar?\n"
                                + "Indique numero:");

                        asientoC = tec.nextInt();
                    } while (asientoC > 120 || asientoC < 0);

                    repetir = a1.cancelar(asientoC);
                    break;

                case 3:
                    System.out.println("Gracias por usar Aerolineas Moreno, que tnga un buen dia");
                    break;
            }
        }while(repetir);
    }

    private static void avion2(Avion a2) {

        boolean repetir = false;
        
        do{
            repetir = false;
            
            int opcion = menu();

            switch (opcion) {
                case 1:
                    int asientoR;
                    do {
                        System.out.println("Que asiento quiere reserar?\n"
                                + "Indique numero:");

                        asientoR = tec.nextInt();
                    } while (asientoR > 100 || asientoR < 0);

                    repetir = a2.reservar(asientoR);

                    break;
                case 2:

                    int asientoC;

                    do {
                        System.out.println("Que asiento quiere cancelar?\n"
                                + "Indique numero:");

                        asientoC = tec.nextInt();
                    } while (asientoC > 100 || asientoC < 0);

                    repetir = a2.cancelar(asientoC);
                    break;

                case 3:
                    System.out.println("Gracias por usar Chocus Airlines, que tnga un buen dia");
                    break;
            }
        }while(repetir);
    }

    private static int menu() {
        int opcion = 0;

        boolean repite = false;
        do {
            //mostramos por pantalla el mensaje
            System.out.println("1) Reservar\n"
                    + "2) Cancelar\n"
                    + "3) Salir\n");
            int eleccion = tec.nextInt();

            switch (eleccion) {
                case 1:
                    opcion = 1;
                    break;
                case 2:
                    opcion = 2;
                    break;
                case 3:
                    System.out.println("¿Desea salir?");

                    //captamos la prespuesta y comparamos si es si
                    String salir = tec.next();
                    if (salir.equalsIgnoreCase("si")) {
                        repite = true;
                    } else {
                        repite = false;
                    }
                    break;

            }
        } while (opcion < 1 || opcion > 3 || repite);
        return opcion;
    }
}
