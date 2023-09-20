package Main;

import Armadura.Armadura;
import ArmaduraServices.ArmaduraServices;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Armadura armadura = new Armadura();
        ArmaduraServices as = new ArmaduraServices();
        Scanner scanner = new Scanner(System.in);
        do{

            System.out.println("-----MENU-----");
            System.out.println("opcion 1: correr");
            System.out.println("opcion 2: volar");
            System.out.println("opcion 3: Disparar con los guantes");
            System.out.println("opcion 4: Estado de los dispositivos");
            System.out.println("opcion 5: Enemigos o aliados?");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    try {
                        as.correr();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                }
                 case 2 -> {
                     as.propulsarse();
                     try {
                     as.volar();
                     } catch (InputMismatchException e) {
                         System.out.println(e.getMessage());
                     }
                 }
                 case 3 -> {
                     try {
                        as.disparoGuantes();
                     } catch (InputMismatchException e) {
                         System.out.println(e.getMessage());
                     }
                 }
                 case 4 -> {
                     System.out.println("Nivel de bateria: "+armadura.getBateria());
                     System.out.println("Nivel de resistencia: " + armadura.getNivelResistencia());

                 }
                 case 5 -> {
                    as.coordenadasDelEnemigo();
                 }
            }

        }while(true);

    }
}