/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Viaje> viajes = getListaViajes();
//        Map<Viaje,Integer> numViajes = new HashMap<>();
//        Set<String> destinos = new HashSet<>();
//        Iterator<String> it = destinos.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        Map<Integer,Viaje> numViajeros = new HashMap<>();
//        Iterator<Integer> ita = numViajeros.keySet().iterator();
//        while(it.hasNext()){
//            System.out.println(ita.next());
//        }
        Map<String,Integer> mapa = numerosViajesOrigen(viajes);
        for(Map.Entry<String,Integer> entry: mapa.entrySet()){
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Origen: "+key+ " números de viajes"+val);
        }
        Set<String> destinos = destinosDiferentes(viajes);
        for (Iterator<String> iterator = destinos.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.print(next+" ");
        }
        
        Map<String,Integer> viajeros = pasajerosPorDestino(viajes);
        
        Set<String> Destinos = viajeros.keySet();
        for(String object : Destinos){
            System.out.println("Ciudad "+object+ " nº viajeros: "+ viajeros.get(object));
        }
    }
    //----------------------------------------
    // ABRE EL ARCHIVO POM.XML, MODIFICA EL CONTENIDO QUE HAY ENTRE LAS ETIQUETAS
    // <artifactId>PruebaFeb24</artifactId> PARA QUE SEA <artifactId>PruebaFeb24+TUNOMBRE</artifactId>
    
    // CREA UN REPOSITORIO LOCAL GIT, AÑADE EN UN PRIMER COMMIT LOS ARCHIVOS NECESARIOS
    // DEL PROYECTO. EL REPOSITORIO, AL FINALIZAR LA PRUEBA, DEBE CONTENER CUATRO COMMITS, UNO POR CADA
    // APARTADO. AL CREAR EL ZIP, INCLUYE LA CARPETA .GIT. SI NO HAY CONTROL DE VERSIONES CORRECTO
    // NO SE CORRIGE EL RESTO
    //---------------------------------------
    
    // A.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // / con el número de viajes que salen de cada ciudad de origen. Usa el método en el main
    // e imprime el resultado usando un foreach
  
    public static Map<String,Integer> numerosViajesOrigen(ArrayList<Viaje> viajes){
        Map<String,Integer> numViajes = new HashMap<>();
        for(Viaje viaje : viajes){
            String clave = viaje.origen();
            if(numViajes.containsKey(clave)){
                Integer valor = numViajes.get(clave);
                numViajes.replace(viaje.origen(), numViajes.get(viaje.origen())+1);
            }else{
                numViajes.put(viaje.origen(), 1);
            }
        }
        return numViajes;
    }
    
    // B.- Crea un método que reciba la lista y devuelva una estructura de datos/colección 
    // con todos los destinos diferentes. Usa el método en el main
    // e imprime el resultado usando un iterador
    public static Set<String> destinosDiferentes(List<Viaje> lista){
        Set<String> destinos = new HashSet();
        for(Viaje viajes : lista){
            destinos.add(viajes.destino());
        }
//        lista.stream().map(e->e.destino()).distinct();
        return destinos;
    }
    
    // C.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // para saber por cada ciudad destino el número total de viajeros que llegan ese día
    // Usa el método en el main, obten las claves de la estructura devuelta e iterando por ellas imprime 
    // el número de viajeros por ciudad
        
        public static Map<String,Integer> pasajerosPorDestino(ArrayList<Viaje> viajes){
            Map<String,Integer> numPasajeros = new HashMap<>();
            for(Viaje viaje : viajes){
                String clave = viaje.destino();
                if(numPasajeros.containsKey(clave)){
                    Integer valor = numPasajeros.get(clave);
                    numPasajeros.replace(clave, valor+viaje.numeroPasajeros());
                }else{
                    numPasajeros.put(clave,viaje.numeroPasajeros());
                }
            }
            return numPasajeros;
        }
    
    // D.- Crea un método que reciba la lista y la ordene por destino y si hay
    // destinos iguales se ordenan por número de viajeros. Usa el método en el main
    // e imprime el resultado usando foreach con expresión lambda, para obtener
    // una salida como esta por cada elemento: "Destino: Estepona Viajeros: 35" 
    public static void ordenar(ArrayList<Viaje> viajes){
        Comparator<Viaje> porDestino = (e1,e2)->e1.numeroPasajeros()-e2.numeroPasajeros();
//        Comparator<Viaje> porPasajeros =(v)
    }
    
    //---------------------------------------
    
    private static ArrayList<Viaje> getListaViajes(){
        ArrayList<Viaje> listaViajes = new ArrayList();
        // Origen - destino - número de pasajeros
        listaViajes.add(new Viaje("Estepona", "Málaga", 120));
        listaViajes.add(new Viaje("Estepona", "Granada", 45));
        listaViajes.add(new Viaje("Estepona", "Algeciras", 100));
        listaViajes.add(new Viaje("Algeciras", "Málaga", 20));
        listaViajes.add(new Viaje("Algeciras", "Granada", 50));
        listaViajes.add(new Viaje("Granada", "Estepona", 35));
        listaViajes.add(new Viaje("Casares", "Málaga", 12));
        listaViajes.add(new Viaje("Marbella", "Málaga", 120));
        
        return listaViajes;
    }
    // A.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // / con el número de viajes que salen de cada ciudad de origen. Usa el método en el main
    // e imprime el resultado usando un foreach
    public static Map<Viaje,Integer> numViajes(ArrayList<Viaje> viaje){
        Map<Viaje,Integer> numViajes = new HashMap<>();
        
        for(Viaje viajes : viaje){
            if(numViajes.containsKey(viajes.origen())){
                numViajes.put(viajes, numViajes.get(viajes)+1);
            }else{
                numViajes.put(viajes, 1);
            }
        }
        return numViajes;
    }
     // B.- Crea un método que reciba la lista y devuelva una estructura de datos/colección 
    // con todos los destinos diferentes. Usa el método en el main
    // e imprime el resultado usando un iterador
    public static Set<String> listaDestinos(ArrayList<Viaje> viajes){
        Set<String> destinos = new HashSet<>();
        for(Viaje viaje : viajes){
            destinos.add(viaje.destino());
        }
        return destinos;
    }
     // C.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // para saber por cada ciudad destino el número total de viajeros que llegan ese día
    // Usa el método en el main, obten las claves de la estructura devuelta e iterando por ellas imprime 
    // el número de viajeros por ciudad
    public static Map<Integer,String> numViajeros(ArrayList<Viaje> viajes){
        Map<Integer,String> numViajeros  = new HashMap<>();
        for(Viaje viaje : viajes){
            if(viajes.contains(viaje.destino())){
                numViajeros.put(viaje.numeroPasajeros()+viaje.numeroPasajeros(), viaje.destino());
            }else{
                numViajeros.put(viaje.numeroPasajeros(), viaje.destino());
            }
        }
        return numViajeros;
    }
     // D.- Crea un método que reciba la lista y la ordene por destino y si hay
    // destinos iguales se ordenan por número de viajeros. Usa el método en el main
    // e imprime el resultado usando foreach con expresión lambda, para obtener
    // una salida como esta por cada elemento: "Destino: Estepona Viajeros: 35" 
    
}
