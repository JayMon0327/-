import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String s) {
        // 숫자에 대응되는 영단어를 Map으로 매핑
        Map<String, String> numberWords = new HashMap<>();
        numberWords.put("zero", "0");
        numberWords.put("one", "1");
        numberWords.put("two", "2");
        numberWords.put("three", "3");
        numberWords.put("four", "4");
        numberWords.put("five", "5");
        numberWords.put("six", "6");
        numberWords.put("seven", "7");
        numberWords.put("eight", "8");
        numberWords.put("nine", "9");

        // 각 영단어를 해당 숫자로 치환
        for (Map.Entry<String, String> entry : numberWords.entrySet()) {
            s = s.replace(entry.getKey(), entry.getValue());
        }

        // 결과 문자열을 정수로 변환하여 반환
        return Integer.parseInt(s);
    }
}
