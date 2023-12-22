package 꼬마정민;
//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String arr[] = number.split(" ");
        long sum =0;
        for (int i =0; i<arr.length;i++){
            sum += Long.parseLong(arr[i]);
        }
        System.out.println(sum);
        sc.close();
    }
}
