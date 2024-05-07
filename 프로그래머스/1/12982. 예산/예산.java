import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);  // 신청 금액을 오름차순으로 정렬
        int count = 0;   // 지원할 수 있는 부서의 수

        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {  // 예산이 현재 부서의 신청 금액보다 크거나 같다면
                budget -= d[i];    // 예산에서 신청 금액을 차감
                count++;           // 지원 부서 수 증가
            } else {
                break;  // 예산이 부족하면 루프 종료
            }
        }

        return count;  // 지원할 수 있는 부서의 최대 수 반환
    }
}
