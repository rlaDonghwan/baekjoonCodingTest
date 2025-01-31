package backJoon.팩토리얼;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n! = n \times (n-1) \times (n-2)

        int num = Integer.parseInt(br.readLine());
        bw.write(factorial(num)+"\n");
        bw.flush();
    }

    public static int factorial(int n) {
        if (n == 1|| n==0) return 1;
        return n * (factorial(n - 1));
    }
}
