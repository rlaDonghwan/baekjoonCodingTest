package 배열.개수세기;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        int[] array = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        int inputFind  = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == inputFind) {
                count++;
            }
        }
        System.out.println(count);

    }
}
