/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public enum Palo {
    //Creamos los enum de palo
    OROS("Carta de oro"), 
    BASTOS("Carta de bastos"), 
    ESPADAS("Carta de espadas"), 
    COPAS("Carta de copas");
    
    private String descripcionPalo;

    private Palo(String descripcionPalo) {
        this.descripcionPalo = descripcionPalo;
    }

    public static Palo getOROS() {
        return OROS;
    }

    public static Palo getBASTOS() {
        return BASTOS;
    }

    public static Palo getESPADAS() {
        return ESPADAS;
    }

    public static Palo getCOPAS() {
        return COPAS;
    }

    public String getDescripcionPalo() {
        return descripcionPalo;
    }
    
    
    
}
