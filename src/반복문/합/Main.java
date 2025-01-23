package 반복문.합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int hap =0;
        for (int i = 1; i <= input; i++) {
            hap = hap+i;

        }
        System.out.println(hap);
    }
}
