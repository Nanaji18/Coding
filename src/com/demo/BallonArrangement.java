package com.demo;

public class BallonArrangement {
	
	 static final int MOD = 1000000007;

	    public static int countArrangements(int N, int K) {
	        int[][] dp = new int[N + 1][K + 1];

	        for (int j = 1; j <= K; j++) {
	            dp[1][j] = 1;
	        }

	        for (int i = 2; i <= N; i++) {
	            for (int j = 1; j <= K; j++) {
	                for (int k = 1; k <= K; k++) {
	                    if (j != k) {
	                        dp[i][j] = (dp[i][j] + dp[i - 1][k]) % MOD;
	                    }
	                }
	            }
	        }

	        int result = 0;
	        for (int j = 1; j <= K; j++) {
	            result = (result + dp[N][j]) % MOD;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int N = 5; // Number of balloons
	        int K = 3; // Number of colors
	        int result = countArrangements(N, K);
	        System.out.println(result);
	    }

}
