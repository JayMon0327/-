import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String[] solution(String[] strings, int n) {
        // Comparator를 사용하여 n번째 문자를 기준으로 정렬
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자가 같을 경우 전체 문자열을 사전순으로 비교
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                }
                // 기본적으로 n번째 문자로 정렬
                return s1.charAt(n) - s2.charAt(n);
            }
        });

        return strings;
    }
}