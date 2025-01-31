package backJoon.최소최대;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        int max = Integer.parseInt(a[0]);
        int min = Integer.parseInt(a[0]);

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(a[i]);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        bw.write(min + " " + max);

        bw.flush();
    }
}
