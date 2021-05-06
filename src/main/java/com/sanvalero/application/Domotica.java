package com.sanvalero.application;
import java.util.Scanner;
public class Domotica {

    Scanner entrada = new Scanner(System.in);

    public void Domotica(){
        System.out.println("Elige una opcion: (lavadoraOn ,lavadoraOff, persianaUp, persianaDown , lucesOn, lucesOff) ");
        String eleccion = entrada.next();

        switch(eleccion){
            case"lavadoraOn":
                encenderLavadora();
                break;
            case"lavadoraOff":
                apagarLavadora();
                break;
            case"persianaOn":
                levantarPersiana();
                break;
            case"persianaOff":
                bajarPersiana();
                break;
            case"lucesOn":
                encenderLuces();
                break;
            case"lucesOff":
                apagarLuces();
                break;
            default:
                System.out.println("No has elegido una opcion correcta");
                break;
        }
    }
}
