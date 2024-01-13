public class Solution {
    public String solution(String s) {
        int length = s.length();
        int middle = length / 2;

        // 단어의 길이가 홀수일 경우 가운데 글자 반환
        if (length % 2 == 1) {
            return String.valueOf(s.charAt(middle));
        }
        // 단어의 길이가 짝수일 경우 가운데 두 글자 반환
        else {
            return s.substring(middle - 1, middle + 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 테스트
        String result1 = solution.solution("abcde");
        System.out.println(result1); // 출력: "c"

        String result2 = solution.solution("qwer");
        System.out.println(result2); // 출력: "we"
    }
}
