class Solution {
    public String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();

        // cipher 문자열에서 code의 배수 번째 문자만 추출
        for (int i = code - 1; i < cipher.length(); i += code) {
            result.append(cipher.charAt(i));
        }

        return result.toString();
    }
}
