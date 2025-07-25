package DynamicProgramming.Fibonacci;

public class FibMemo {
    static int fib(int n, int[] dp) {
        if (n <= 1){
            return n;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 100;

        int[] dp = new int[n + 1];
        int result = fib(n, dp);

        System.out.println(result);
    }
}
