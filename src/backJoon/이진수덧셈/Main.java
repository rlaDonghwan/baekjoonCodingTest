package backJoon.이진수덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int num1 = Integer.parseInt(s[0],2);
        int num2 = Integer.parseInt(s[1],2);

        int res = num1+num2;
        System.out.println(Integer.toBinaryString(res));


    }

}
