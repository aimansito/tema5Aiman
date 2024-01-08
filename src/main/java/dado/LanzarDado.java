/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dado;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aiman
 */
public class LanzarDado {
    Random random = new Random();
    //atributo lista enteros    
    //EL constructor de del objeto rellena una lista simulando 1000 lanzamientos del dado
    //constructor parametrizado con el número de tiradas a generar
    //toString que devuelva de cada elemento de la lista su posición y su valor
    //metodo para saber el numero de veces que ha salido una cara 
    //objeto de instancia 
    //metodo que borre todos los elementos que tengan x cara borrarCaras
    
    public  final int NUM_MAX= 1000;
    private int numDado; 
    private ArrayList<Integer> caras = new ArrayList<>();
    public void listaRellena(){ 
        int dado = 0;
        for(int i = 0;i<NUM_MAX;i++){
            dado = random.nextInt(1,7);
            caras.add(i, dado);
        }
        System.out.println(caras);
    }
    public int devolverNumCaras(int num){
        int contador = 0;
        for(int i = 0;i<caras.size();i++){
            if(caras.get(i)==num){
                contador++;
            }
        }
        return contador; 
    }
//    public int borrarCaras(){
//        
//    }
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public ArrayList<Integer> getCaras() {
        return caras;
    }

    public void setCaras(ArrayList<Integer> caras) {
        this.caras = caras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LanzarDado{");
        sb.append(", caras=").append(caras);
        sb.append('}');
        return sb.toString();
    }
    
    
}
