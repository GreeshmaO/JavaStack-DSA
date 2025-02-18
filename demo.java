public class demo {
    
    static int fib(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n <= 1) {
            return n;
        }
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;  // Change this value to compute Fibonacci for a different number
        int[] memo = new int[n + 1];

        // Initialize memoization array with -1 (indicating uncomputed values)
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        System.out.println("Fibonacci(" + n + ") = " + fib(n, memo));
    }
}
 
    

