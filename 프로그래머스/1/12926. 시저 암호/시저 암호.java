public class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                result.append(ch);
            } else if (Character.isLowerCase(ch)) {
                result.append((char) ('a' + (ch - 'a' + n) % 26));
            } else if (Character.isUpperCase(ch)) {
                result.append((char) ('A' + (ch - 'A' + n) % 26));
            }
        }

        return result.toString();
    }
}
