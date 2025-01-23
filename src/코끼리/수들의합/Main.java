package 코끼리.수들의합;

//서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
//첫째 줄에 자연수 N의 최댓값을 출력한다.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();
        long sum = 0;
        int count = 0;

        for (int i = 1; i <= s; i++) {
            sum = sum + i;
            count = count + 1;
            if (sum > s) {
                break;
            }
        }
        System.out.println(sum == s ? count :count-1);
    }
}