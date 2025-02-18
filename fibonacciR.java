public class fibonacciR {
    public static void main(String[] args) {
        fib();
    }
    public static void fib(){
         int i;
         int n=10;
         int f=0,sec=1;
         System.out.println("Fibonacci with recursion:");
         for(i=0;i<10;i++){
           
            int next =f+sec;
            f=sec;
            sec=next;
            System.out.println(f + " ");
         }
        }
}


