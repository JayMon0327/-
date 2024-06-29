import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] playersAtStage = new int[N + 2]; // 스테이지에 있는 플레이어 수
        int[] reachStage = new int[N + 1]; // 스테이지에 도달한 플레이어 수

        // 스테이지에 있는 플레이어 수를 셈
        for (int stage : stages) {
            playersAtStage[stage]++;
        }

        // 각 스테이지에 도달한 플레이어 수를 셈
        reachStage[N] = playersAtStage[N] + playersAtStage[N + 1];
        for (int i = N - 1; i >= 1; i--) {
            reachStage[i] = playersAtStage[i] + reachStage[i + 1];
        }

        // 실패율을 계산하고 스테이지 번호와 함께 저장
        List<StageFailureRate> failureRates = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failureRate = reachStage[i] == 0 ? 0 : (double) playersAtStage[i] / reachStage[i];
            failureRates.add(new StageFailureRate(i, failureRate));
        }

        // 실패율을 기준으로 정렬, 실패율이 같으면 스테이지 번호가 작은 것이 먼저 오도록 함
        Collections.sort(failureRates, (a, b) -> {
            if (b.failureRate == a.failureRate) {
                return Integer.compare(a.stage, b.stage);
            }
            return Double.compare(b.failureRate, a.failureRate);
        });

        // 정렬된 스테이지 번호를 결과 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = failureRates.get(i).stage;
        }

        return answer;
    }

    // 스테이지 번호와 실패율을 저장하는 클래스
    static class StageFailureRate {
        int stage;
        double failureRate;

        StageFailureRate(int stage, double failureRate) {
            this.stage = stage;
            this.failureRate = failureRate;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(sol.solution(5, stages1))); // Expected output: [3, 4, 2, 1, 5]

        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(sol.solution(4, stages2))); // Expected output: [4, 1, 2, 3]
    }
}