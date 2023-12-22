package 입출력과사칙연산;

import java.util.Scanner;

public class sameString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String n1 = "joonas";
        String n2 = "baekjoon";
        if(n1.equals(input)){
            System.out.println(input+"??!");
        }
        if(n2.equals(input)){
            System.out.println(input+"??!");
        }
    }
}
