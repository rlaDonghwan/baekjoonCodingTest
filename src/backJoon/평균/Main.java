package backJoon.평균;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 점수 / M * 100
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        int maxScore = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (score[i] > maxScore) {
                maxScore = score[i];
            }
        }
        double dap = 0.0;
        for (int i = 0; i < n; i++) {
            dap += (double) score[i] / maxScore * 100;
        }

        bw.write(dap/n + "\n");
        bw.flush();

    }
}
