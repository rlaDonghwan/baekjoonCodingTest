package 코끼리.팩토리얼;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        System.out.println(fact(n));
    }
    public static long fact(long n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
