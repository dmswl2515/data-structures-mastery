package org.example.Day08_DynamicPrograming;

import static org.example.Day08_DynamicPrograming.DynamicPrograming.fibDp;

/**
 * 피보나치수열 - DP 방식
 * 시간복잡도: 0(n), 공간복잡도: 0(n)
 * 학습 목표: DP의 기본 원리 이해
 * */
public class Fibonacci {
    /**
     * DP 방식으로 n번째 피보나치 수 계산
     * @param n 구하고자 하는 피보나치 수의 위치
     * @return n번째 피보나치 수
     * */
    public static int fibDP (int n) {
        // 기저 조건: 0번째, 1번째는 그대로 반환
        if(n <= 1) return n;

        // DP 테이블 생성
        int[] dp = new int[n+1];

        // 초기값 설정
        dp[0] = 0;  // F(0) = 0
        dp[1] = 1;  // F(1) = 1

        // 점화식을 이용해 순차적으로 계산
        for (int i = 2; i <= n; i ++) {
            dp[i] = dp[i-1] + dp[i-2]; // F(n) = F(n-1) + F(n-2)
        }

        return dp[n];
    }

    /**
     * 테스트 및 실행
     */
    public static void main(String[] args){
        // 테스트 케이스
        int[] testCase = {0, 1, 2, 3, 4, 5, 10};

        System.out.println("===피보나치 DP 테스트 ===");
        for (int n : testCase) {
            System.out.printf("F(%d) = %d%n", n, fibDP(n));
        }
    }
}
