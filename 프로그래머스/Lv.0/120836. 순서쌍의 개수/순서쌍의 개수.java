public class Solution {
    public int solution(int n) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int a = i;
                int b = n / i;

                // a와 b가 같으면 한 쌍만 카운트
                if (a == b) {
                    count++;
                } else {
                    // a와 b가 다르면 두 쌍을 모두 카운트
                    count += 2;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 테스트
        System.out.println(solution.solution(20)); // 출력: 6
        System.out.println(solution.solution(100)); // 출력: 9
    }
}
