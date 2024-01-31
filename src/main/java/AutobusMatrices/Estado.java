/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package AutobusMatrices;

/**
 *
 * @author aiman
 */
public enum Estado {
        LIBRE("Libre"),
        OCUPADO("Ocupado"),
        MOVRED("Movilidad Reducida");

        private final String estado;

        Estado(String estado) {
            this.estado = estado;
        }
}
