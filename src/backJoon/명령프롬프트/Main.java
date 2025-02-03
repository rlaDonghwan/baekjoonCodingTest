package backJoon.명령프롬프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 문자열 개수 입력
        String[] s = new String[n];

        // 문자열 입력
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        int length = s[0].length(); // 기준이 되는 첫 번째 문자열의 길이
        StringBuilder sb = new StringBuilder();

        // 같은 위치의 문자 비교
        for (int i = 0; i < length; i++) {
            char c = s[0].charAt(i); // 첫 번째 문자열의 i번째 문자
            boolean isSame = true;

            for (int j = 1; j < n; j++) {
                if (s[j].charAt(i) != c) { // 하나라도 다르면
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                sb.append(c); // 같으면 문자 유지
            } else {
                sb.append('?'); // 다르면 '?'로 변환
            }
        }

        System.out.println(sb.toString());
    }
}