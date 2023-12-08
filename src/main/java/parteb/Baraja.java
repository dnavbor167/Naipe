/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import java.util.Random;
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

    //Creamos el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        sb.append("naipeArray=").append(naipeArray);
        sb.append('}');
        return sb.toString();
    }

    //Método que recibe como parámetro un int indicando los movimientos que va
    //a tener la carta y en cada movimiento se elegirán dos cartas aleatorias y
    //se intercambiarán sus posciones dentro del array
    public static void barajar(int movimientos){
        
        //Instanciamos el objeto Baraja
        Baraja baraja = new Baraja();
        Random r = new Random();
        
        for(int i = 1; i <= movimientos;i++){
            
            //Guardamos en dos variables de tipo int los valores aleatorios
            //que tiene la longitud de la baraja
            int posicion1 = r.nextInt(barajasTienen);
            int posicion2 = r.nextInt(barajasTienen);
            
            //Creamos dos objetos de Naipe asignándole el valor aleatorio de 
            //las posiciones
            Naipe np1 = baraja.getNaipeArray()[posicion1];
            Naipe np2 = baraja.getNaipeArray()[posicion2];
            
            //Intercambio de cartas
            Naipe inter = np1;
            np1 = np2;
            np2 = inter;
            
            //Mostramos el valor del intercambio
            System.out.println("Movimiento " + i + "\nNaipe1 = " + np1 + 
                    "\nNaipe2 = " + np2);
        }
        
    }

}
