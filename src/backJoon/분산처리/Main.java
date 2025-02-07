package backJoon.분산처리;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            // a의 일의 자리
            int lastDigit = a % 10;

            // 만약 lastDigit가 0이면 a의 제곱은 항상 0이므로 출력은 10
            if (lastDigit == 0) {
                System.out.println(10);
                continue;
            }

            int result = modPow(lastDigit, b, 10);
            // result가 0이면 컴퓨터 번호 10번에 해당
            if (result == 0) {
                result = 10;
            }
            System.out.println(result);
        }
    }

    // 모듈러 거듭제곱 함수: base^exponent % mod 를 효율적으로 계산
    public static int modPow(int base, int exponent, int mod) {
        int result = 1;
        base %= mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) { // exponent의 현재 비트가 1이면
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1; // exponent를 1비트 오른쪽으로 이동
        }
        return result;
    }
}