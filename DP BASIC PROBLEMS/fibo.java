import java.util.*;
public class fibo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int ans=fibonacci(n);
        int ans=fibMemoized(n,new int[n+1]);
        System.out.println("Fibonacci of "+n+" is "+ans);
    }
    static int fibonacci(int n){
        if(n==0 || n==1)return n;

        int fib1=fibonacci(n-1);
        int fib2=fibonacci(n-2);
        int fib=fib1+fib2;
        return fib;
    }
    static int fibMemoized(int n,int[]dp){
        if(n==0 || n==1)return n;

        if(dp[n]!=0)return dp[n];
        System.out.println("hello "+n);
        int fib1=fibMemoized(n-1, dp);
        int fib2=fibMemoized(n-2, dp);
        int fib=fib1+fib2;

        dp[n]=fib;
        return fib;
    }
}