/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author aleja
 */
public class Asientos {
    
    private int fila, columna, numeroAsiento;
    private boolean disponible; //true es disponible false reservado

    public Asientos() {
        
        this.fila = 0;
        this.columna = 0;
        this.numeroAsiento = 0;
        this.disponible = true;
    }

    
    public Asientos(int fila, int columna, int numeroAsiento, boolean disponible) {
        
        this.fila = fila;
        this.columna = columna;
        this.numeroAsiento = numeroAsiento;
        this.disponible = disponible;
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

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "fila: " + fila + ", columna: " + columna + ", numero de asiento: " + numeroAsiento + ", disponible: " + disponible;
    }
}
