package backJoon.숫자카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int n = input.length();
        int[] dp = new int[n + 1]; // dp 배열 선언

        dp[0] = 1; // 시작점 (문자열이 없을 때 1가지 방법)
        dp[1] = 1; // 첫 번째 숫자는 한 가지 방법만 존재

        for (int i = 2; i <= n; i++) {
            int oneDigit = input.charAt(i - 1) - '0'; // 마지막 한 자리
            int twoDigit = Integer.parseInt(input.substring(i - 2, i)); // 마지막 두 자리

            if (oneDigit >= 1) dp[i] += dp[i - 1]; // 한 자리 수로 해석 가능
            if (twoDigit >= 10 && twoDigit <= 34) dp[i] += dp[i - 2]; // 두 자리 수로 해석 가능
        }

        System.out.println(dp[n]); // 결과 출력
    }
}