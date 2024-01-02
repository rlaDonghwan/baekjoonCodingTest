package 조건문.알람시계;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = 0, m = 0;
        h = sc.nextInt();
        m = sc.nextInt();
        if (0 <= h && h <= 23 && 0 <= m && m <= 59) {
            m = (m - 45 + 60) % 60;

            if (h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
            System.out.printf("%d %d", h, m);
        }
    }

//    public class Main {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            // 현재 알람 시각 입력 받기
//            int H = sc.nextInt();
//            int M = sc.nextInt();
//
//            // 알람을 45분 앞으로 설정
//            int newH = H;
//            int newM = M - 45;
//
//            // 만약에 음수가 되면 시간을 1시간 빼주고 분을 60분 더해줌
//            if (newM < 0) {
//                newM += 60;
//                newH--;
//
//                // 시간이 음수가 되면 23으로 설정
//                if (newH < 0) {
//                    newH = 23;
//                }
//            }
//
//            // 결과 출력
//            System.out.println(newH + " " + newM);
//
//            sc.close();
//        }
//    }

}
