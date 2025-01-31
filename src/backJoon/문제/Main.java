package backJoon.문제;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int count = 0;
        while (X > 0) { // x가 0이 될때 까지 반복 한다.
            if ((X & 1) == 1) { //X를 AND 연상을 한다
                count++; // AND 연산시 1이 될 경우에 count를 증가 시긴다
            }
            X >>= 1; // 오른쪽으로 1 비트 씩 이동 시켜 X가 0이 될때 까지 AND 연산을 한다.
        }
        System.out.println(count);


    }
}
