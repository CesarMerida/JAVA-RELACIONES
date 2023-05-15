/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author chech
 */
public class Jugador {
   private int numeroJugador;
    private String nombreJugador;
    private boolean mojado = true;

    public Jugador() {
    }

    public Jugador(int numeroJugador, String nombreJugador, boolean mojado) {
        this.numeroJugador = numeroJugador;
        this.nombreJugador = nombreJugador;
        this.mojado = mojado;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(Revolver revolver) {
        if (revolver.mojar()) {
            mojado = false;
        } else {
            mojado = true;
            revolver.siguienteChorro();
        }
        return mojado;
    }  

 
}
