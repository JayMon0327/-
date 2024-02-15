public class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // a와 b 중 작은 수와 큰 수를 구함
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        // 작은 수부터 큰 수까지의 정수를 합산
        for (int i = min; i<= max; i++) {
            answer += i;
        }

        return answer;
    }
}
    
