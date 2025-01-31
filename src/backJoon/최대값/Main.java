package backJoon.최대값;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int maxIndexNumber = 0;
        int[] num = new int[9];
        for (int i = 0; i <num.length; i++) {
            num[i]=Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxIndexNumber = i;
            }

        }

        bw.write(max + "\n");
        bw.write(maxIndexNumber + 1 + "\n");
        bw.flush();


    }
}
