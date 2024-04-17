class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.split(" ");  // 공백으로 문자열을 분리하여 토큰화
        int result = Integer.parseInt(tokens[0]);  // 첫 번째 숫자로 초기 결과값 설정

        for (int i = 1; i < tokens.length; i += 2) {  // 연산자 위치에서 시작하여, 연산자와 숫자를 쌍으로 처리
            String operator = tokens[i];  // 연산자 (+, -)
            int number = Integer.parseInt(tokens[i+1]);  // 다음 토큰(숫자)

            if (operator.equals("+")) {
                result += number;  // 더하기 연산
            } else if (operator.equals("-")) {
                result -= number;  // 빼기 연산
            }
        }

        return result;  // 계산된 결과 반환
    }
}
