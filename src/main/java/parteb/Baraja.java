/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import partea.Naipe;
import partea.Palo;

/**
 *
 * @author danielnavasborjas
 */
public class Baraja {

    //Definimos los atributos encapsulados
    private final Naipe[] naipeArray = new Naipe[barajasTienen];
    public static final int barajasTienen = 40;
    private Palo[] paloArray = Palo.values();

    //Creamos el constructor sin parámetros
    public Baraja() {

        int contador = 0;
        //Creamos la lógica para mostrar las 40 cartas sin que se repitan
        for (int i = 1; i <= 10; i++) {
            for (int a = 0; a < paloArray.length; a++) {
                this.naipeArray[contador++] = new Naipe(i, paloArray[a]);
            }
        }
    }

    //Definimos el getter
    public Naipe[] getNaipeArray() {
        return naipeArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append("naipeArray=").append(naipeArray);
        sb.append('}');
        return sb.toString();
    }

    

}
