package 조건문.오븐시계;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int run = sc.nextInt();


        int newH = H;
        int newM = M + run;

        if (newM >= 60) {
            newH += newM / 60;
//            newM = (M + (run % 60)) % 60;
            newM %=60;

        }
        if (newH >= 24) {
            newH %= 24;
        }

        System.out.println(newH + " " + newM);

    }
}
