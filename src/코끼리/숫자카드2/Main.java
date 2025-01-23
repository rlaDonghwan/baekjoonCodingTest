package 코끼리.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 배열의 크기 입력
        int size1 = Integer.parseInt(br.readLine());
        int[] array1 = new int[size1];

        // 첫 번째 배열의 원소 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size1; i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(array1);

        // 두 번째 배열의 크기 입력
        int size2 = Integer.parseInt(br.readLine());
        int[] array2 = new int[size2];

        // 두 번째 배열의 원소 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size2; i++) {
            array2[i] = Integer.parseInt(st.nextToken());
        }

        // 결과 배열
        int[] results = new int[size2];
        int count = 0;
        // 각 숫자에 대해 이진 탐색을 수행
        for (int i = 0; i < size2; i++) {
            results[i] = Arrays.binarySearch(array1, array2[i]) == array2[i] ? count++ : 0;
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int result : results) {
            sb.append(result).append(" ");
        }
        System.out.println(sb.toString()); // 결과 한 번에 출력

        br.close();
    }
}
