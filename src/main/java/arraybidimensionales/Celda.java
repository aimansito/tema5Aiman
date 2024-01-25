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

    public Celda(ArrayList<Integer> numCasilla) {
        this.numCasilla = numCasilla;
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
        sb.append("numCasilla=").append(numCasilla);
        sb.append('}');
        return sb.toString();
    }

    
    
    public  ArrayList<Integer> posicionCasilla(char[][] letras, char letra){
        for(int i = 0;i<letras.length;i++){
            for(int j = 0;j<letras[i].length;j++){
                if(letras[i][j]==letra){
                    numCasilla.add(j);
                    numCasilla.add(i);
                }
            }
        }
        return numCasilla;
    }
}
