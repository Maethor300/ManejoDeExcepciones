import Division.Division;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Division division = new Division();
        try {
           division.division();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    static void metodo() throws ArithmeticException {
        System.out.println("Sentencia1");

      try {
          int operacion1 = 24 /4;
          System.out.println(operacion1);
          System.out.println( "Sentencia 3" + 3 / 0);
      }catch (Error e){

          System.out.println(e.getMessage());
      }catch (ArithmeticException e){
          System.out.println(e.getMessage());
          throw (e);
      }finally {
          System.out.println("Sentencia6");
      }

    }
}