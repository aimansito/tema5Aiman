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
public class Avion {

    private Asientos[][] asientos;

    public Avion() {

        this.asientos = new Asientos[25][4];

        llenarAsientos();
    }

    public Avion(int filas, int colummnas) {

        this.asientos = new Asientos[filas][colummnas];

        llenarAsientos();
    }

    private final void llenarAsientos() {

        int numeroAsiento = 1;
        
        for (int i = 0; i < asientos.length; i++) {

            for (int j = 0; j < asientos[i].length; j++) {

                this.asientos[i][j] = new Asientos();

                this.asientos[i][j].setFila(i);
                this.asientos[i][j].setColumna(j);
                this.asientos[i][j].setNumeroAsiento(numeroAsiento);
                
                numeroAsiento++;
            }
        }
    }
    
    public boolean reservar(int numero) {
        
        boolean realizado = false;
        
        for (int i = 0; i < asientos.length; i++) {

            for (int j = 0; j < asientos[i].length; j++) {

                if (this.asientos[i][j].getNumeroAsiento() == numero) {
                    
                    if(this.asientos[i][j].isDisponible()){
                        
                        this.asientos[i][j].setDisponible(false);
                        realizado = true;
                    } else {
                        System.out.println("Asiento ocupado");
                    }
                }
            }
        }
        
        return realizado;
    }
    
    public boolean cancelar(int numero) {
        
        boolean realizado = false;
        
        for (int i = 0; i < asientos.length; i++) {

            for (int j = 0; j < asientos[i].length; j++) {

                if (this.asientos[i][j].getNumeroAsiento() == numero) {
                    
                     if(!this.asientos[i][j].isDisponible()){
                        
                        this.asientos[i][j].setDisponible(true);
                        realizado = true;
                    } else {
                        System.out.println("Asiento no reservado");
                    }
                }
            }
        }
        
        return realizado;
    }
    
    public void imprimir() {
        
        for (int i = 0; i < asientos.length; i++) {

            for (int j = 0; j < asientos[i].length; j++) {

                System.out.println(this.asientos[i][j].toString());
            }
            System.out.println("---------------------------------------------");
        }
    }
}
