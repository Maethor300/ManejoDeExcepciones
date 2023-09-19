package DivisionNumero;

import java.util.InputMismatchException;

public class DivisionNumero {
    public void division(String a, String b){

         try{
            int data1 = Integer.parseInt(a);
            int data2 = Integer.parseInt(b);
            int division = data1 / data2;
        }catch (ArithmeticException | NumberFormatException e){
            System.out.println("Error: No se pudo realizar la operacion");
            System.out.println("Error " + e.getMessage());
        }
    }
}
