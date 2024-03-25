import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        // 모스부호와 알파벳 간의 매핑
        Map<String, Character> morseMap = new HashMap<>();
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                               "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                               "..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < morseCodes.length; i++) {
            morseMap.put(morseCodes[i], (char) ('a' + i));
        }
        
        // 모스부호 문자열을 공백으로 분리
        String[] words = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        
        // 각 모스부호를 해당하는 알파벳으로 변환하여 문자열 구성
        for (String word : words) {
            if (morseMap.containsKey(word)) {
                sb.append(morseMap.get(word));
            }
        }
        
        return sb.toString();
    }
}
