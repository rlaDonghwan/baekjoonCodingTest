package backJoon.단어정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[20][3];

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
        }

        double totalGrade = 0; // 학점 * 등급
        double totalScore = 0; // 총 학점

        for (int i = 0; i < 20; i++) {
            String score = arr[i][2]; // 등급
            double credit = Double.parseDouble(arr[i][1]); //학점

            if(score.equals("P")){
                continue;
            }
            double gradePoint = 0;
            switch (score) {
                case "A+": gradePoint += 4.5; break;
                case "A0": gradePoint += 4.0; break;
                case "B+": gradePoint += 3.5; break;
                case "B0": gradePoint += 3.0; break;
                case "C+": gradePoint += 2.5; break;
                case "C0": gradePoint += 2.0; break;
                case "D+": gradePoint += 1.5; break;
                case "D0": gradePoint += 1.0; break;
                case "F": gradePoint += 0.0; break;
            }
            totalGrade += credit * gradePoint;
            totalScore += credit;
        }

        double gpa = (totalScore == 0) ? 0.0 : (totalGrade / totalScore);
        System.out.printf("%.6f\n",gpa);
    }
}
