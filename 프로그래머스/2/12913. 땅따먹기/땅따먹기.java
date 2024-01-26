public class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        // 각 행의 최대 점수를 저장할 배열
        int[][] dp = new int[land.length][4];
        
        // 첫 번째 행의 최대 점수 초기화
        for (int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }
        
        // 두 번째 행부터 마지막 행까지 최대 점수 계산
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                // 이전 행에서 현재 열을 제외한 나머지 열 중 최대값을 더함
                dp[i][j] = land[i][j] + maxOfPreviousRow(dp, i, j);
            }
        }
        
        // 마지막 행에서 최대값을 찾음
        for (int i = 0; i < 4; i++) {
            if (answer < dp[land.length - 1][i]) {
                answer = dp[land.length - 1][i];
            }
        }
        
        return answer;
    }
    
    // 이전 행에서 현재 열을 제외한 나머지 열 중 최대값을 반환하는 메서드
    int maxOfPreviousRow(int[][] dp, int row, int col) {
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (i != col && max < dp[row - 1][i]) {
                max = dp[row - 1][i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] land = {
            {1, 2, 3, 5},
            {5, 6, 7, 8},
            {4, 3, 2, 1}
        };
        
        System.out.println(solution.solution(land)); // 16
    }
}
