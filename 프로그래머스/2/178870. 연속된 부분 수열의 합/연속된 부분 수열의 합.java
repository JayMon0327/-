import java.util.*;

public class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0; // 슬라이딩 윈도우의 왼쪽 인덱스
        int sum = 0; // 부분 수열의 합
        int minLength = Integer.MAX_VALUE; // 최소 길이
        int startIndex = 0; // 결과의 시작 인덱스

        for (int right = 0; right < sequence.length; right++) {
            sum += sequence[right]; // 슬라이딩 윈도우의 오른쪽 끝 인덱스를 늘려가며 합 갱신

            
            while (sum > k) {
                sum -= sequence[left++]; // 부분 수열의 합이 k 이하가 될 때까지 왼쪽 끝 인덱스를 이동시키며 합 갱신
            }

            // 부분 수열의 합이 k와 같은 경우
            if (sum == k) {
                int length = right - left + 1; // 부분 수열의 길이 계산

                // 최소 길이인 경우와 시작 인덱스가 더 작은 경우 갱신
                if (length < minLength || (length == minLength && left < startIndex)) {
                    minLength = length;
                    startIndex = left;
                }
            }
        }

        // 결과 설정
        if (minLength == Integer.MAX_VALUE) {
            answer[0] = -1;
            answer[1] = -1;
        } else {
            answer[0] = startIndex;
            answer[1] = startIndex + minLength - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 입력에 대한 테스트
        int[] sequence1 = {1, 2, 3, 4, 5};
        int k1 = 7;
        System.out.println(Arrays.toString(solution.solution(sequence1, k1))); // [2, 3]

        int[] sequence2 = {1, 1, 1, 2, 3, 4, 5};
        int k2 = 5;
        System.out.println(Arrays.toString(solution.solution(sequence2, k2))); // [6, 6]

        int[] sequence3 = {2, 2, 2, 2, 2};
        int k3 = 6;
        System.out.println(Arrays.toString(solution.solution(sequence3, k3))); // [0, 2]
    }
}
