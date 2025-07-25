package DynamicProgramming.Fibonacci;

public class FibTab {
    static int fib(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0; // Base case
        dp[1] = 1; // Base case

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(fib(n));
    }
}

