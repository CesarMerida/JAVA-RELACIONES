/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chech
 */
public class Juego {
    private List<Jugador> jugadores = new ArrayList<>();
    private Revolver revolver;
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    public void ronda(){
        boolean bandera;
        do {
            bandera = true;
            for (Jugador jugador: jugadores) {
                System.out.println("turno del jugador: " + jugador.getNumeroJugador()+"-"
                                                         + jugador.getNombreJugador());
                if(jugador.disparo(revolver)){
                    System.out.println("se ha salvado compa");
                    System.out.println(revolver);
                }else{
                    System.out.println("usted se ha ido al tacho");
                    System.out.println(revolver);
                    bandera = false;
                    break;
                }
            }
        }while(bandera);
    }
}
