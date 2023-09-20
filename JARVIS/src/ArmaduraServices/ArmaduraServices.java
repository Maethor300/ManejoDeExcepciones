package ArmaduraServices;

import Armadura.Armadura;
import Botas.Botas;
import Guantes.Guantes;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArmaduraServices {
    Armadura armadura = new Armadura();
    Botas botas = new Botas();
    Guantes guantes = new Guantes();
    public void caminar(){
        System.out.println("Energia: " + armadura.getBateria());
    }
    public int correr(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int duracion = 0;
        if(!botas.isEstadoBotasDamage()){
            System.out.println("Horas que vas a correr");
            duracion = scanner.nextInt();
            do{
                armadura.setBateria(armadura.getBateria() / 2);
                System.out.println("Energia: " + armadura.getBateria());
                i++;

            }while (i < duracion);
        }else {
            System.out.println("Daño en las botas no las puede usar");
        }
        double randomNumberBotas = random.nextDouble();

        if(randomNumberBotas < 0.3){
            System.out.println("Botas dañadas");
            botas.setEstadoBotasDamage(true);
        }else {
            botas.setEstadoBotasDamage(false);
        }

   return duracion;
    }
    public void propulsarse(){
            armadura.setBateria(armadura.getBateria() / 3);
            System.out.println("Energia restante: " + armadura.getBateria());
    }
    public int volar(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Horas que vas a volar");
        int duracion = 0;
        if(!guantes.isEstadoGuantesDamage() && !botas.isEstadoBotasDamage()){
            int i = 0;
              duracion = scanner.nextInt();
            do{
                System.out.println("Desgaste de las botas: ");
                armadura.setBateria(armadura.getBateria() / 3);
                System.out.println("Energia: " + armadura.getBateria());
                System.out.println("Desgaste de los guantes: ");
                armadura.setBateria(armadura.getBateria() / 2);
                System.out.println("Energia: " + armadura.getBateria());
                i++;
            }while (i < duracion);
        }else{
            System.out.println("Daño en las botas o en los guantes");
        }

        double randomNumber = random.nextDouble();
        double randomNumberGuantes = random.nextDouble();
        if(randomNumber < 0.3){
            System.out.println("Botas dañadas");
            botas.setEstadoBotasDamage(true);

        }else {
            botas.setEstadoBotasDamage(false);
        }
        if(randomNumberGuantes < 0.3){
            System.out.println("Guantes dañados");
            guantes.setEstadoGuantesDamage(true);
        }else {
            guantes.setEstadoGuantesDamage(false);
        }
        return duracion;
    }
    public int disparoGuantes(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int duracion = 0;
        if(!guantes.isEstadoGuantesDamage()){
        System.out.println("Horas que vas a disparar con los guantes");
        System.out.println("Es menos de 1 hora? 1 para si o 0 para no");
        int opcion = scanner.nextInt();
        int i = 0;
        if (opcion == 0){
            System.out.println("Horas que vas a disparar con los guantes");
              duracion = scanner.nextInt();
            do{
                armadura.setBateria(armadura.getBateria() / 3);
                System.out.println("Energia: " + armadura.getBateria());
                i++;
            }while (i < duracion);
        }
        }
        double randomNumberGuantes = random.nextDouble();
        if(randomNumberGuantes < 0.3){
            System.out.println("Guantes dañados");
            guantes.setEstadoGuantesDamage(true);

        }else {
            guantes.setEstadoGuantesDamage(false);
        }
        return duracion;
    }
    public void reparar(){
        Random random = new Random();
        double randomNumberReparacionBotas = random.nextDouble();
        if(randomNumberReparacionBotas < 0.4){
            botas.setEstadoBotasDamage(false);
        }else {
            System.out.println("las botas son imposible de reparar");
        }
        double randomNumberReparacionGuantes = random.nextDouble();
        if(randomNumberReparacionGuantes < 0.4){
            guantes.setEstadoGuantesDamage(false);
        }else {
            System.out.println("Los guantes de reparar");
        }
    }
    public void coordenadasDelEnemigo(){
        Random random = new Random();
        int enemigos = 1 + random.nextInt(10);
        int i = 0;
        double operacion;
        do {
         i++;
            double x = 1 + random.nextInt(5000);
            double y = 1 + random.nextInt(5000);
            double z = 1 + random.nextInt(5000);
          operacion = Math.sqrt(x*x + y*y + z*z);
            System.out.println("Sujetos "+ i + " a: " + operacion + "mts");
            int result = random.nextInt(2);
            if(result == 1){
                System.out.println("Es enemigo");
                destruyendoEnemigo(operacion);
            }else {
                System.out.println("Es aliado");
            }
        }while (i < enemigos);
    }
    public void destruyendoEnemigo(double operacion){
        int vida = 100;
        if(operacion  > 5000){
            System.out.println("Enemigo fuera de alcance");
        }else {
            do {
                if(operacion <= 1000){
                    vida = vida - 40;
                } else if (operacion > 1000 && operacion <= 2000) {
                    vida = vida - 20;
                } else if (operacion > 2000 && operacion <= 3000) {
                    vida = vida - 10;
                } else if (operacion > 3000 && operacion <= 4000) {
                    vida = vida - 5;
                }else {
                    vida = vida - 3;
                }
                System.out.println(vida);
              if(vida <= 0){
                  System.out.println("Enemigo destruido");
                  break;
              }
            }while (true);
        }
    }
}
