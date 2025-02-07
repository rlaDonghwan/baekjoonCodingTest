package backJoon.Tv크기;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");



        double d = Integer.parseInt(input[0]);
        double hRatio = Integer.parseInt(input[1]);
        double wRatio = Integer.parseInt(input[2]);

        // 피타고라스 정리를 이용하여 비례 상수 k 계산
        // k = d / √(h^2 + w^2)
        double k = d / Math.sqrt(hRatio * hRatio + wRatio * wRatio);

        // 실제 높이와 너비 계산
        double height = k * hRatio;
        double width = k * wRatio;

        System.out.println((int)height +" "+(int)width);

    }
}