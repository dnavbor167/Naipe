/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Random;

/**
 *
 * @author daniel
 */
public class Naipe {

    //Creamos los atributos encapsulados
    private int numCarta;
    private Palo palo;
    //Creamos un constructor para Palo en array
    private final Palo[] paloArray = Palo.values();

    //Creación de constructor vacío
    public Naipe() {
        //Inicializamos el objeto random
        Random r = new Random();

        //Creamos la variable numAleatorio para guardar el numero aleatorio del array
        int numAleatorio;

        //Hacemos que las carta sea aleatoria
        this.numCarta = r.nextInt(1, 11);
        numAleatorio = r.nextInt(paloArray.length);
        this.palo = paloArray[numAleatorio];
    }

    //Creación de Naipe con parámetros
    public Naipe(int numCarta, Palo palo) {
        //Controlamos la excepción por si coge una carta que no está 
        //en el rango correcto.
        if (numCarta < 1 || numCarta > 10) {
            throw new IllegalArgumentException("Escoge una carta entre 1 y 10");
        } else {
            this.numCarta = numCarta;
        }
        this.palo = palo;
    }
}
