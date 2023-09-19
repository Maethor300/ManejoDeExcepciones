package Division;

public class Division {
    public void division() throws ArithmeticException{
        int division;

        try{
            division = 20 / 0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            throw (e);
        }
    }
}
