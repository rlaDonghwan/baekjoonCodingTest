package backJoon.더하기사이클;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int orginal = N;
        int count = 0;

        do {
            int ten = N / 10;
            int ones = N % 10;
            int sum = ten + ones;
            N = (sum % 10) + (ones * 10);
            count++;
        } while (N != orginal);

        bw.write(count + "\n");
        bw.flush();
    }
}
