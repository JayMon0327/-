import java.util.Arrays;

public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        // 주어진 명함들의 가로 길이와 세로 길이 중에서 가장 큰 값을 찾음
        for (int[] card : sizes) {
            maxWidth = Math.max(maxWidth, Math.max(card[0], card[1]));
            maxHeight = Math.max(maxHeight, Math.min(card[0], card[1]));
        }
        
        // 가장 작은 지갑의 크기를 반환
        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 테스트 케이스
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution.solution(sizes1));  // 출력: 4000

        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(solution.solution(sizes2));  // 출력: 120

        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution.solution(sizes3));  // 출력: 133
    }
}
