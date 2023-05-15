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
public class Carta {
       //Atributos
    private int numero;
    private String palo;
    
    //Constantes
    public static final String[] PALOS={"ESPADAS", "OROS", "COPAS", "BASTOS"};
    public static final int LIMITE_CARTA_PALO=12;

    //Constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
    

}
