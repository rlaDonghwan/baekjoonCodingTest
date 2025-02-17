package backJoon.영확감독숌;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 원하는 N번째 종말의 수
        int count = 0;  // 몇 번째 종말의 수인지 카운트
        int number = 666;  // 666부터 시작

        while (true) {
            if (String.valueOf(number).contains("666")) {  // 666이 포함되면
                count++;  // 카운트 증가
                if (count == N) {  // N번째 종말의 수를 찾았으면 출력 후 종료
                    System.out.println(number);
                    break;
                }
            }
            number++;  // 다음 숫자 탐색
        }
    }
}