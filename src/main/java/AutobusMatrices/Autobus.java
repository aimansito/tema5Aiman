/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutobusMatrices;

import java.util.Random;

/**
 *
 * @author aiman
 */
public class Autobus {

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random aRandom) {
        random = aRandom;
    }
   //4 asientos x 12 filas
    // nº asientos tiene un estado, (reservado,libre)
    //programa que tenga como reservar, en el caso de que sea asiento de mov reducida tiene que ser 
    //que todos los demas asientos de alrededor no puedan estar ocupadas
    private int id;
    private Asientos[][] asientos;
    private static final int NUM_MAX_ASIENTOS = 48;
    private static Random random = new Random();

    public Autobus(int id, Asientos[][] asientos) {
        this.id = id;
        this.asientos = new Asientos[4][12];
    }

    public Autobus rellenarBus(Autobus bus){
        for(int i = 0;i<bus.asientos.length;i++){
           for(int j = 0;j<bus.asientos[i].length;j++){
//               asientos[i][j]=
           }
        }
        return bus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Asientos[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobus{");
        sb.append("id=").append(id);
        sb.append(", asientos=").append(asientos);
        sb.append('}');
        return sb.toString();
    }
    
    

}
