import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        try{
            int result=6/0;
        }
       catch(ArithmeticException e){
        System.out.println("Cannot divide by Zero!" +e);
       }
       finally{
        System.out.println("Execution Successfull");
       }
       try{
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);
    }
   catch(ArrayIndexOutOfBoundsException e ){
    System.out.println("invalid index!" +e);
   }
   finally{
    System.out.println("Execution Successfull");
   }
   
   
    }
    
}
