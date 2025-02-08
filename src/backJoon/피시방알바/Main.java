package backJoon.피시방알바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        String[] input = bufferedReader.readLine().split(" ");

        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int seat = Integer.parseInt(input[i]);
            if (set.contains(seat)) {
                count++;
            } else {
                set.add(seat);
            }
        }


        System.out.println(count);


    }
}
