package 조건문.주사위세개;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        int dice1 = random.nextInt(6) + 1;
//        int dice2 = random.nextInt(6) + 1;
//        int dice3 = random.nextInt(6) + 1;
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int result = 0;

        if (dice1 == dice2 && dice2 == dice3) {
            result = 10000 + (dice1 * 1000);

        }
        else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
            int pairValue = (dice1 == dice2) ? dice1 : dice3;
            result = 1000 + pairValue * 100;
        }
        else {
            int maxDiceValue = Math.max(Math.max(dice1, dice2), dice3);
            result = maxDiceValue * 100;
        }
        System.out.println(result);

        //같은 눈이 3개가 나오면 10000+(같은눈)*1000
        //같은 눈이 2개가 나오면 1000+(같은눈)*100
        //모두 다른 눈이 나오면 (그중 가장 큰 눈) * 100
    }
}
