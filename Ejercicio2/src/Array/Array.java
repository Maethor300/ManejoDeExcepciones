package Array;

import java.util.ArrayList;

public class Array {
    private int[] data = new int[5];
    public void errores(){
        try{
            int value = data[4];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Acesso fuera de los limites del array");
        }
    }
}
