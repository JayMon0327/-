public class Solution {
    public boolean solution(int x) {
        int original = x;       // 원래 숫자를 저장
        int sumOfDigits = 0;    // 자릿수 합을 저장할 변수
        
        while (x > 0) {
            sumOfDigits += x % 10;  // 마지막 자릿수를 더함
            x /= 10;                // 마지막 자릿수를 제거
        }
        
        // 자릿수의 합으로 원래 숫자가 나누어 떨어지는지 검사
        return (original % sumOfDigits == 0);
    }
}
