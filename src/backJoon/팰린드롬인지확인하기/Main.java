package backJoon.팰린드롬인지확인하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int dap = 1;
        for (int i = 0; !(i >= input.length()); i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                dap = 0;
                break;
            }
        }
        System.out.println(dap);

    }
}

