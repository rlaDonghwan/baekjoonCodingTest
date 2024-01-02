package 조건문.사분면고르기;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y = 0;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0 && y > 0) { // 1사분면 x, y
            System.out.println(1);
        }
        else if (x < 0 && y > 0) { //2사분면 -x, y
            System.out.println(2);
        }
        else if (x < 0 && y < 0) { //3사분면 -x, -y
            System.out.println(3);
        }
        else if (x > 0 && y < 0) { //4사분면 x, -y
            System.out.println(4);
        }
    }
}
