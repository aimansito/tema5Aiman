/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5B;

/**
 *
 * @author aiman
 */
public class Coordenada {
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coordenada{");
        sb.append("fila=").append(fila);
        sb.append(", columna=").append(columna);
        sb.append('}');
        return sb.toString();
    }
    
    public static Coordenada devolverPosicion(int[][] matriz){
        for(int fila = 0;fila<matriz.length;fila++){
            for(int columna = 0;columna<matriz[fila].length;columna++){
                int valor = matriz[fila][columna];
                boolean mayor = true;
                boolean menor = true;
               for(int j = 0;j<matriz.length;j++){
                   if(valor>matriz[fila][j]){
                       mayor=false;
                       break;
                   }
               }
               for(int i=0;i<matriz.length;i++){
                   if(valor<matriz[i][columna]){
                       menor = false;
                       break;
                   }
               }
               if(mayor&&menor){
                   return new Coordenada(fila,columna);
               }
            }
            
        }
        return new Coordenada(-1,-1);
        
    }
}
