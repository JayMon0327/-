public class Solution {
    public int solution(int left, int right) {
        int result = 0;

        for (int num = left; num <= right; num++) {
            // 제곱근을 구하고 정수로 변환
            int sqrt = (int)Math.sqrt(num);
            
            // 제곱해서 원래 숫자가 되면 약수의 개수는 홀수
            if (sqrt * sqrt == num) {
                result -= num; // 약수의 개수가 홀수면 숫자를 빼기
            } else {
                result += num; // 약수의 개수가 짝수면 숫자를 더하기
            }
        }

        return result;
    }
}
