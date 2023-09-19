package Main;

import DivisionNumero.DivisionNumero;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DivisionNumero divisionNumero = new DivisionNumero();
        do {
            System.out.println("Digita 2 numeros");
            String numero1 = scanner.next();
            String numero2 = scanner.next();
            divisionNumero.division(numero1,numero2);
        }while (true);
    }
}