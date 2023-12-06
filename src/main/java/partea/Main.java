/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partea;

import parteb.Baraja;

/**
 *
 * @author danielnavasborjas
 */
public class Main {

    public static void main(String[] args) {
        //Instanciamos el objeto naipes1
        Naipe naipes1;
        //Creamos un bucle para que se repita hasta los parámetros indicados
        do{
            naipes1 = new Naipe();
            System.out.println(naipes1.toString());
            
            //Condicional para decir que el bucle ha llegado a su fin
            if(naipes1.getNumCarta()==10&&naipes1.getPalo().equals(Palo.OROS)){
                System.out.println("""
                                   \n------------------------
                                   Ha salido el Rey de Oros
                                   ------------------------
                                   """);
            }
        } while(!(naipes1.getNumCarta()==10&&naipes1.getPalo().equals(Palo.OROS)));
        
        
        Baraja b1 = new Baraja();
        Naipe[] naipes2 = b1.getNaipeArray();
        

        for (int i = 0; i < Baraja.barajasTienen; i++) {
            System.out.println(naipes2[i]);

        }
    }

}
