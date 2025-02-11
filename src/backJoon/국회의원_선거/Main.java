package backJoon.국회의원_선거;

import com.sun.security.jgss.InquireType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        if (input == 1) {
            System.out.println(0);
        }

        for (int i = 0; i < input; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int f = list.get(0);
        int x = 0;

        int max = Collections.max(list);
        while (f <= max) {
            f = f + 1;
            max = max - 1;
            x = x + 1;
        }
        System.out.println(x);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int dasom = Integer.parseInt(br.readLine());
        List<Integer> votes = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            votes.add(Integer.parseInt(br.readLine()));
        }

        int bribes = 0;
        while (!votes.isEmpty() && dasom <= Collections.max(votes)) {
            int maxIndex = votes.indexOf(Collections.max(votes)); // 가장 큰 값의 인덱스 찾기
            votes.set(maxIndex, votes.get(maxIndex) - 1); // 그 값을 1 감소
            dasom++;
            bribes++;
        }

        System.out.println(bribes);
    }
}
