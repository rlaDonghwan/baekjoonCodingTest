package backJoon.저항;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {

    private static final Map<String, Integer> colorMap = Map.of(
            "black", 0, "brown", 1, "red", 2, "orange", 3, "yellow", 4,
            "green", 5, "blue", 6, "violet", 7, "grey", 8, "white", 9
    );


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstColor = br.readLine();
        String secondColor = br.readLine();
        String thirdColor = br.readLine();

        int firstValue = colorMap.get(firstColor);
        int secondValue = colorMap.get(secondColor);
        int multiplier = (int) Math.pow(10, colorMap.get(thirdColor));

        long result = (firstValue * 10L + secondValue) * multiplier;
        System.out.println(result);
    }

}
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        String[] value = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
//        String[] value2 = {"1", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000", "000000000"};
//        String[] s = new String[3];
//        String firstColor = "", secondColor = "", thirdColor = "";
//        for (int i = 0; i < s.length; i++) {
//            s[i] = br.readLine();
//        }
//        for (int i = 0; i < color.length; i++) {
//            if (s[0].equals(color[i])) {
//                firstColor = value[i];
//            }
//            if (s[1].equals(color[i])) {
//                secondColor = value[i];
//            }
//            if (s[2].equals(color[i])) {
//                thirdColor = value2[i];
//            }
//        }
//
//        String dap = firstColor + secondColor + thirdColor;
//        System.out.println(dap);
//    }

