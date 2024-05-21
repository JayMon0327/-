public class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] patterns = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            if (isPronounceable(word, patterns)) {
                count++;
            }
        }
        
        return count;
    }

    private boolean isPronounceable(String word, String[] patterns) {
        String previousPattern = "";
        
        while (!word.isEmpty()) {
            boolean matched = false;
            
            for (String pattern : patterns) {
                if (word.startsWith(pattern)) {
                    if (pattern.equals(previousPattern)) {
                        return false; // 연속된 동일 발음
                    }
                    previousPattern = pattern;
                    word = word.substring(pattern.length());
                    matched = true;
                    break;
                }
            }
            
            if (!matched) {
                return false;
            }
        }
        
        return true;
    }
}