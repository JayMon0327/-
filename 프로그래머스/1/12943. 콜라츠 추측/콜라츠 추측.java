public class Solution {
    public int solution(int num) {
        long n = num; // int 범위를 초과할 수 있으므로 long 타입 사용
        int count = 0;

        while (n != 1) {
            if (count >= 500) return -1; // 500번 반복 이상이면 -1 반환
            if (n % 2 == 0) {
                n /= 2; // n이 짝수면 2로 나눈다
            } else {
                n = n * 3 + 1; // n이 홀수면 3을 곱하고 1을 더한다
            }
            count++;
        }

        return count;
    }
}
