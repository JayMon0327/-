class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            // 현재 문자가 result에 아직 없으면 추가
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
