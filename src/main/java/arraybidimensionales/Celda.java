/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraybidimensionales;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class Celda {
    private static ArrayList<Integer> numCasilla = new ArrayList<>();
    private int fila ;
    private int columna;

    public Celda(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

   

    public Celda() {
    }
    
    

    public ArrayList<Integer> getNumCasilla() {
        return numCasilla;
    }

    public void setNumCasilla(ArrayList<Integer> numCasilla) {
        this.numCasilla = numCasilla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Celda{");
        sb.append("fila=").append(fila);
        sb.append(", columna=").append(columna);
        sb.append('}');
        return sb.toString();
    }
    
    

    public static ArrayList<Integer> posicionCasilla(int[][] numeros){
        for(int i = 0;i<numeros.length;i++){
            for(int j = 0;j<numeros[i].length;j++){
                if(numeros[i][j]==1){
                    numCasilla.add(j);
                    numCasilla.add(i);
                }
            }
        }
        return numCasilla;
    }
}
