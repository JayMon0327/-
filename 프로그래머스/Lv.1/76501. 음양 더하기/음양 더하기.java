public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        // 각 정수의 부호에 따라 합을 계산합니다.
        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return sum;
    }
}