package backJoon.팩토리얼0개의개수;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int fac = factorial(num);
        int dap = trailingZeroCount(num);

        bw.write(dap+"\n");
        bw.write(fac+"\n");
        bw.flush();
    }

    public static int trailingZeroCount(int n) {
        int count = 0;
        // 5, 25, 125, ... 로 나누며 더해줌
        for (long i = 5; i <= n; i *= 5) {
            count += (int) (n / i);
        }
        return count;
    }

    public static int factorial(int n) {
        if (n == 1|| n==0) return 1;
        return n * (factorial(n - 1));
    }
}
