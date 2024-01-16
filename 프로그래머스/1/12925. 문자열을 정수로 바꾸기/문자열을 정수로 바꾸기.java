public class Solution {
    public int solution(String s) {
        // 부호 여부 확인
        boolean isNegative = s.charAt(0) == '-';
        
        // 부호에 따라 숫자 부분 추출
        String numStr = isNegative ? s.substring(1) : s;

        // 문자열을 정수로 변환
        int result = Integer.parseInt(numStr);

        // 부호 적용
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 테스트
        System.out.println(solution.solution("1234"));  // 출력: 1234
        System.out.println(solution.solution("-1234")); // 출력: -1234
    }
}
