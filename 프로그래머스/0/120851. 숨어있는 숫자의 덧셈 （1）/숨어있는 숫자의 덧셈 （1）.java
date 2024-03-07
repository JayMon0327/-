class Solution {
    public int solution(String my_string) {
        int answer = 0;

        // 문자열을 순회하며 각 문자 확인
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            // 문자가 숫자인 경우
            if (Character.isDigit(c)) {
                // 해당 숫자 문자를 정수로 변환하여 answer에 더함
                answer += Character.getNumericValue(c);
            }
        }

        return answer;
    }
}
