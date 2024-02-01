/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutobusMatrices;

/**
 *
 * @author aiman
 */
public class Asientos {

    private int numAsientos;
    private Estado estado;
    private static int contador = 0;

    public Asientos() {
        this.numAsientos = contador++;
        this.estado = Estado.LIBRE;
    }

    public void liberarAsientos() {
        this.estado = Estado.LIBRE;
    }

    public void ocuparAsiento() {
        this.estado = Estado.OCUPADO;
    }

    public void asientoMovRed() {
        this.estado = Estado.MOVRED;
    }

    public static Estado reservarAsientos() {
        return Estado.OCUPADO;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public Estado isEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[" + numAsientos + "]");
        sb.append("[" + estado + "]");
        return sb.toString();
    }
}
