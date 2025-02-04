package backJoon.나누기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        // 뒤 두 자리를 0으로 변경
        String modifiedNum = String.valueOf(num).substring(0, String.valueOf(num).length() - 2) + "00";

        int N = Integer.parseInt(modifiedNum);

        int P = 0;
        int dap = 0;
        while (true) {
            P += F;
            if (N <= P) {
                dap = P;
                break;
            }
        }
        System.out.println(String.valueOf(dap).substring(String.valueOf(dap).length()-2, String.valueOf(dap).length()));


    }
}



