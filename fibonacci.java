public class fibonacci {
    public static void main(String[] args) {
        int n=10;
        int i;
        int f=0,sec=1;
        System.out.println("Fibonacci series:");
        for (i=0;i<n;i++) {
            int next =f+sec;
            f=sec;
            sec=next;
            System.out.println(sec);

        }

    }
    
}
