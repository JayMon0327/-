import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        // 논문의 인용 횟수를 내림차순으로 정렬합니다.
        Arrays.sort(citations);

        int hIndex = 0;
        int n = citations.length;

        // 인용 횟수를 확인하면서 H-Index를 찾습니다.
        for (int i = n - 1; i >= 0; i--) {
            // 현재 논문의 인용 횟수가 현재 H-Index보다 크거나 같으면 H-Index를 증가시킵니다.
            if (citations[i] >= n - i) {
                hIndex = n - i;
            } else {
                // 인용 횟수가 H-Index보다 작아지면 더 이상 확인할 필요가 없습니다.
                break;
            }
        }

        return hIndex;
    }
}
