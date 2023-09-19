import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int conteo = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = 1 + random.nextInt(500);
        System.out.println(randomNum);
      do{
          int numero = 0;
          System.out.println("Introduce un numero");
          try{
                numero = scanner.nextInt();
          }catch (InputMismatchException e){
              System.out.println("Error dato no compatible");
              System.out.println(e.getMessage());
              scanner.nextLine();
          }
          if(numero < randomNum){
              System.out.println("El numero es mayor");
          }else if(numero > randomNum){
              System.out.println("El numero es menor");
          }else{
              System.out.println("Encontraste el numero");
              break;
          }
          conteo++;
      }while(true);
        System.out.println("Intentos alcanzados " + conteo);
    }
}