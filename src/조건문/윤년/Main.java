package 조건문.윤년;
//윤년은 4의 배수 이면서 100의 배수가 아닐 때 또는 400 배수일 때
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int dap = 0;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                dap = 1;
            }
        } else {
            dap = 0;
        }
        System.out.println(dap);
    }
}
