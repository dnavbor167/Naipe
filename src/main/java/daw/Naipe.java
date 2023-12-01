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
    
    //Cremos los getter
    public int getNumCarta() {
        return numCarta;
    }

    public Palo getPalo() {
        return palo;
    }
    

    //Creamos los setters
    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    //Creamos el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        //Hacemos que si escoge un número del 8 al 10 muestre un String
        //con el nombre de la carta
        if(numCarta == 8){
            sb.append("numCarta=").append("Sota");
        } else if(numCarta == 9){
            sb.append("numCarta=").append("Caballo");
        } else if(numCarta == 10){
            sb.append("numCarta=").append("Rey");
        } else {
            sb.append("numCarta=").append(numCarta);
        }
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
