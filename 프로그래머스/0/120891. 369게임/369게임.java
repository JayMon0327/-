class Solution {
    public int solution(int order) {
        String orderStr = String.valueOf(order); // 숫자를 문자열로 변환
        int clapCount = 0; // 박수 횟수

        // 문자열의 각 문자를 순회하며 3, 6, 9 검사
        for (int i = 0; i < orderStr.length(); i++) {
            char c = orderStr.charAt(i);
            // 문자가 3, 6, 9 중 하나이면 박수 횟수 증가
            if (c == '3' || c == '6' || c == '9') {
                clapCount++;
            }
        }

        return clapCount; // 박수 횟수 반환
    }
}
