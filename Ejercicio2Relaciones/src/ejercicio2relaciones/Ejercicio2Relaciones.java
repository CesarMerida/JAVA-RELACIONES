/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2relaciones;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio2Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        Revolver revolver = new Revolver();
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        System.out.println("Ingrese la cantidad de jugadores: ");
        int numeroJugador = scan.nextInt();
        if (numeroJugador < 1 || numeroJugador > 6) {
            System.out.println("Ha ingresado un numero incorrecto, se le ha asignado 6 turnos");
            numeroJugador = 6;
        }
        for (int i = 0; i < numeroJugador; i++) {
            Jugador jugador = new Jugador();
            System.out.println("Ingrese el nombre del jugador: ");
            jugador.setNombreJugador(scan.next());
            jugador.setNumeroJugador((i + 1));
            jugadores.add(jugador);
        }
        revolver.llenarRevolver();
        System.out.println(revolver);
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();

    }
    
    
}
