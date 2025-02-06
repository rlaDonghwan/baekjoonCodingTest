package backJoon.진수변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine(),8);
        String s = "";


        while (0 < input) {
            s = String.valueOf(input % 2) + s;
            input /= 2;
        }
        System.out.println(s);

    }

}