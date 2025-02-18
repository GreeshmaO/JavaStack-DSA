public class Fibomemo {
    
    

static int fib(int n,int[]memo){
    if(memo[n]!=-1)
    return memo[n];
    if(n<=1) return n;
    memo[n]=fib(n-1,memo)+fib(n-2,memo);
    return memo[n];

public static void main (String[]args){
    int  n=10;
    int[] memo=new int[n+1];
    
    for (int i = 0; i <= n; i++) {
        memo[i] = -1;
    }
}
}
    
    
    
    System.out.println(Fibomemo.fib(n, memo));
}
}


