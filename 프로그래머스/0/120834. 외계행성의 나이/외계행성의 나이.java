class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        // 나이를 문자열로 변환한 후 각 문자에 대해 알파벳으로 변환
        String ageStr = String.valueOf(age);
        for (char digit : ageStr.toCharArray()) {
            // 숫자를 'a'에서 시작하는 알파벳으로 변환
            char letter = (char) ('a' + (digit - '0'));
            sb.append(letter);
        }
        
        return sb.toString();
    }
}
