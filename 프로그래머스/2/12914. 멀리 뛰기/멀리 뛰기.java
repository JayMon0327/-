public class Solution {
    public int solution(int n) {
        // 배열을 사용하여 동적 프로그래밍을 적용
        int[] dp = new int[n + 1];

        // 기본 케이스 설정
        dp[1] = 1;
        if (n > 1) {
            dp[2] = 2;
        }

        // 점화식을 이용하여 계산
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        // 결과 반환
        return dp[n];
    }
}