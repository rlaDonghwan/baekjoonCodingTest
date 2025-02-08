package backJoon.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine()); //10을 입력을 받고
        String[] M = br.readLine().split(" ");
        List<Integer> MList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            MList.add(Integer.parseInt(M[i]));
        }


        int n = Integer.parseInt(br.readLine());
        String[] N = br.readLine().split(" ");
        List<Integer> NList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NList.add(Integer.parseInt(N[i]));
        }

        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < NList.size(); i++) {
            int tartget = NList.get(i);
            int cnt = 0;

            for (int j = 0; j < MList.size(); j++) {
                if (MList.get(j) == tartget) {
                    cnt++;
                }

            }
            count.add(cnt);
        }

        for (int num : count) {
            System.out.printf("%d ", num);
        }

    }
}
