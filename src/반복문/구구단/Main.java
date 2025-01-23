package 반복문.구구단;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n",input,i,input*i);

        }
    }
}
