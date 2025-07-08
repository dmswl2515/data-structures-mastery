package org.example.Day08_DynamicPrograming;

public class DynamicPrograming {
    // Bottom-up 방식
    public static int fibDp(int n) {
        if(n <= 1) return n;

        // 1. DP 테이블 생성
        int[] dp = new int[n+1];

        // 2. 초기값 설정
        dp[0] = 0;
        dp[1] = 1;

        // 3. 점화식으로 테이블 채우기
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        // 4. 답 반환
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fibDp(10));
    }
}
