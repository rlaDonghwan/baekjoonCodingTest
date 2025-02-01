package backJoon.로마숫자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int romanToInt(String s) {
        // 로마 숫자에 해당하는 값을 저장하는 HashMap
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; // 최종 변환된 숫자 저장
        int prevValue = 0; // 이전 숫자 값 (뺄셈 규칙을 확인하기 위해)

        // 오른쪽에서 왼쪽으로 한 글자씩 읽기
        for (int i = s.length() - 1; i >= 0; i--) {
            //DLIII
            //MCMXL
            int currentValue = romanMap.get(s.charAt(i)); // 현재 문자 값 가져오기
            // 현재 값이 이전 값보다 작다면 "뺄셈 규칙" 적용
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue; // 이전 값 업데이트
        }
        return result;
    }

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input1 = br.readLine();
        String input2 = br.readLine();

        int score1 = romanToInt(input1);
        int score2 = romanToInt(input2);
        int hap = score1 + score2;
        System.out.println(romanToInt(intToRoman(hap)));
        System.out.println(intToRoman(hap));
    }
}
