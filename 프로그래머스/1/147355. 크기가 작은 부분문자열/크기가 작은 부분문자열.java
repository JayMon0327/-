public class Solution {
    public int solution(String s, String p) {
        long lenP = p.length();                // p의 길이
        long numP = Long.parseLong(p);         // p를 long 정수로 변환
        int count = 0;                         // 조건을 만족하는 부분 문자열 수

        for (int i = 0; i <= s.length() - lenP; i++) {
            String sub = s.substring(i, i + (int)lenP);   // 부분 문자열 추출
            long numSub;
            try {
                numSub = Long.parseLong(sub);    // 부분 문자열을 long 정수로 변환
            } catch (NumberFormatException e) {
                continue; // 숫자 변환 실패 시 해당 부분 문자열 건너뛰기
            }
            if (numSub <= numP) {                // 조건 비교
                count++;                         // 조건을 만족하면 카운트 증가
            }
        }

        return count;  // 최종 카운트 반환
    }
}
