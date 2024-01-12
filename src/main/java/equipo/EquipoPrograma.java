/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

import catalogo.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author aiman
 */
public class EquipoPrograma {
    public static void main(String[] args) {
        ArrayList<Equipo> equipo = new ArrayList<>();
        ArrayList<String> jugadores1 = new ArrayList<>();
        ArrayList<String> jugadores2 = new ArrayList<>();
        Equipo e1 = new Equipo("FC Barcelona","Xavi","Spotify Camp Nou","4-3-3",jugadores1,70,3);
        jugadores1.add("Pedri");
        Equipo e2 = new Equipo("Real Madrid CF","Ancelotti","Santiago Bernabeu","4-3-3",jugadores2,70,2);
        jugadores2.add("Bellingham");
        equipo.add(e1);
        equipo.add(e2);
        
        Comparator<Equipo> criterio = (k1,k2)->equipo.get(1).getPuesto()-equipo.get(0).getPuesto();
        Collections.sort(equipo,(k1,k2)->equipo.get(1).getPuesto()-equipo.get(0).getPuesto());
        Collections.sort(equipo,criterio.reversed());
        equipo.forEach(System.out::println);
        System.out.println("----------------------");
        int posicion = Collections.binarySearch(equipo, equipo.get(1),(eg1,eg2)->equipo.get(0).getAlineacion().compareToIgnoreCase(e2.getAlineacion()));
        System.out.println("La Alineación se encuentra en la posicion:  "+posicion);
    }
    
}
