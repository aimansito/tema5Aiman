/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author aiman
 */
public class LanzarDado {

    public static Random random = new Random();
    //atributo lista enteros    
    //EL constructor de del objeto rellena una lista simulando 1000 lanzamientos del dado
    //constructor parametrizado con el número de tiradas a generar
    //toString que devuelva de cada elemento de la lista su posición y su valor
    //metodo para saber el numero de veces que ha salido una cara 
    //objeto de instancia 
    //metodo que borre todos los elementos que tengan x cara borrarCaras

    public final int NUM_MAX = 1000;
    private int numDado;
    private ArrayList<Integer> caras = new ArrayList<>();

    public LanzarDado() {
        for (int i = 0; i < NUM_MAX; i++) {
            this.caras.add(numDado = random.nextInt(1, 7));
        }
    }

    public LanzarDado(int num) {
        for (int i = 0; i < num; i++) {
            this.caras.add(numDado = random.nextInt(1, 7));
        }
    }

//    public ArrayList<Integer> listaRellena(){ 
//        int dado = 0;
//        for(int i = 0;i<NUM_MAX;i++){
//            dado = random.nextInt(1,7);
//            caras.add(i, dado);
//        }
//        return caras;
//    }
    public int devolverNumCaras(int num) {
        int contador = 0;
        for (int i = 0; i < caras.size(); i++) {
            if (caras.get(i) == num) {
                contador++;
            }
        }
        return contador;
    }
    public void borrarCaras(int num){
        Iterator<Integer> borrarCara = caras.iterator();
        while(borrarCara.hasNext()){
            if(borrarCara.next()==num){
                borrarCara.remove();
            }
        }
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
        String texto = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < caras.size(); i++) {
            texto += "Posición: " + (i + 1) + " Valor: " + caras.get(i) + "\n";
        }
        sb.append(texto);
        return sb.toString();
    }
}
