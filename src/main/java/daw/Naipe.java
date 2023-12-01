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
    public Naipe(){
        //Inicializamos el objeto random
        Random r = new Random();
        
        //Creamos la variable numAleatorio para guardar el numero aleatorio del array
        int numAleatorio;
        
        //Hacemos que las carta sea aleatoria
        this.numCarta=r.nextInt(1,11);
        numAleatorio = r.nextInt(paloArray.length);
        this.palo = paloArray[numAleatorio];
    }
}
