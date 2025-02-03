package backJoon.손익분기점;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]); // 고정 비용
        int B = Integer.parseInt(input[1]); // 변동 비용
        int C = Integer.parseInt(input[2]); // 판매가


        if (C <= B) {
            System.out.println(-1);
        } else {
            int BEP = (A / (C - B)) + 1;
            System.out.println(BEP);
        }


    }
}
