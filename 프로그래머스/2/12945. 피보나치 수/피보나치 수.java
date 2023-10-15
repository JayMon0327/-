public class Solution {
    public int solution(int n) {
        int[] fib = new int[n + 1];
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567;
        }

        return fib[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; // 예시로 5를 사용
        System.out.println(solution.solution(n)); // 결과 출력
    }
}
