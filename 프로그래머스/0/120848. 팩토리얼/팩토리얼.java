class Solution {
    public int solution(int n) {
        int i = 1;
        long factorial = 1; // 팩토리얼 값은 매우 빠르게 커질 수 있으므로 long 타입 사용

        // factorial이 n 이하가 되는 동안 반복
        while (factorial <= n) {
            i++;
            factorial *= i;
        }

        // factorial이 n을 초과하는 순간, i-1이 조건을 만족하는 가장 큰 정수
        return i - 1;
    }
}
