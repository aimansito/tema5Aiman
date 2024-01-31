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
    private int numAsientos ;
    private Estado estado;


    public Asientos(int numAsientos, boolean estado) {
        this.numAsientos = numAsientos;
        this.estado = Estado.LIBRE;
    }

    public static Estado reservarAsientos(){
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
        sb.append("Asientos{");
        sb.append("numAsientos=").append(numAsientos);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

}
