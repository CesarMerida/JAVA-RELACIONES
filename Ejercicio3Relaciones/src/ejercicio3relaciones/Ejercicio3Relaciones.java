/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3relaciones;

import Entidades.Baraja;
import Entidades.Carta;

/**
 *
 * @author chech
 */
public class Ejercicio3Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos la baraja
        Baraja b = new Baraja();
        
        //Mostramos las cartas disponibles (40)
        System.out.println("Hay "+b.cartasDisponible()+" cartas disponibles");
       
        //Saco una carta
        b.siguienteCarta();
        
        //Saco 5 cartas
        b.darCartas(5);
        
        //Mostramos las cartas disponibles (34)
        System.out.println("Hay "+b.cartasDisponible()+" cartas disponibles");
       
        System.out.println("Cartas sacadas de momento");
        
        b.cartasMonton();
        
        
        //Barajamos de nuevo
        b.barajar();
       
        //Saco 5 cartas
        Carta[] c = b.darCartas(5);
        
        System.out.println("Cartas sacadas despues de barajar ");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        
    }
    
    
    
}
