import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public long solution(long n) {
        // 정수 n을 문자열로 변환
        String s = Long.toString(n);
        
        // 문자열을 문자 배열로 변환
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        
        // 배열을 내림차순으로 정렬
        Arrays.sort(chars, Collections.reverseOrder());
        
        // 정렬된 문자들을 다시 문자열로 결합
        StringBuilder sortedString = new StringBuilder();
        for (char c : chars) {
            sortedString.append(c);
        }
        
        // 문자열을 정수로 변환하여 반환
        return Long.parseLong(sortedString.toString());
    }
}
