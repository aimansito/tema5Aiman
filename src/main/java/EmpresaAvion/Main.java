/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpresaAvion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int[][] vuelos = new int[6][3];
        for(int i = 0;i<vuelos.length;i++){
            for(int j = 0;j<vuelos[i].length;j++){
                System.out.println("Ingrese la cantidad de asientos para el destino "+i+" y horario "+j);
                vuelos[i][j]=random.nextInt(1,5);
            }
        }
        String bandera = "";
        int destino,horario,asientos;
        while(!bandera.equalsIgnoreCase("finish: ")){
            System.out.println("Ingrese el nº de destino: ");
            destino = teclado.nextInt();
            System.out.println("Ingrese el horario del vuelo: ");
            horario = teclado.nextInt();
            System.out.println("Ingrese la cantidad de asientos: ");
            asientos = teclado.nextInt();
            if(vuelos[destino][horario]>= asientos){
                System.out.println("Comprando billetes...");
                vuelos[destino][horario] = vuelos[destino][horario]-asientos;
            }else{
                System.out.println("No hay asientos disponibles");
            }
        }
    }
}
