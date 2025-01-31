package backJoon.그대로출력하기;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {  // 입력이 끝날 때까지 반복
            bw.write(line + "\n");  // 그대로 출력
        }

        bw.flush();
        br.close();
        bw.close();
    }
}