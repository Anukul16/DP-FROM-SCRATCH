import java.util.Scanner;

public class ClimingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int ans=count(n);
        // int ans=countMemoization(n,new int[n+1]);
        int ans=countTabulation(n);
        System.out.println(ans);
    }
    // Simple Recursion 
    static int count(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        int cnt1=count(n-1);
        int cnt2=count(n-2);
        int totalCount=cnt1+cnt2;
        
        return totalCount;
    }
    // Memoization
    static int countMemoization(int n,int[]dp){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        if(dp[n]!=0)return dp[n];
        int cnt1=count(n-1,dp);
        int cnt2=count(n-2,dp);
        int totalCount=cnt1+cnt2;
        dp[n]=totalCount;
        return totalCount;
    }
    // Tabulation
    static int countTabulation(int n){
        int[]dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    
}
