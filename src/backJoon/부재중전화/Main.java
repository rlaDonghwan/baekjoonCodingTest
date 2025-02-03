package backJoon.부재중전화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 노래 개수
        int L = Integer.parseInt(input[1]); // 노래 길이
        int D = Integer.parseInt(input[2]); // 전화가 울리는 간격

        int currentTime = 0; // 현재 시간
        int songEnd = (N * L) + ((N - 1) * 5); // 마지막 곡이 끝나는 시간
        int ringTime = 0; // 전화가 처음 울리는 시간

        while (ringTime <= songEnd) {
            boolean isSilent = true; // 현재 시간이 공백 구간인지 체크

            // 모든 노래 구간을 체크
            for (int i = 0; i < N; i++) {
                int songStart = i * (L + 5); // i번째 노래 시작 시간
                int songEndTime = songStart + L; // i번째 노래 종료 시간

                // 전화가 울리는 시간이 노래 중이라면 break
                if (ringTime >= songStart && ringTime < songEndTime) {
                    isSilent = false;
                    break;
                }
            }

            if (isSilent) { // 노래가 재생되지 않는 순간 발견
                System.out.println(ringTime);
                return;
            }

            ringTime += D; // 다음 전화벨 시간 증가
        }

        // 노래가 끝난 이후 전화벨이 울리는 경우
        System.out.println(ringTime);
    }
}