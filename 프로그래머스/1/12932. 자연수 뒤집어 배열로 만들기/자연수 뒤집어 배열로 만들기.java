public class Solution {
    public int[] solution(long n) {
        // Step 1: 숫자를 문자열로 변환
        String numStr = Long.toString(n);
        
        // Step 2: 문자열 길이를 기반으로 배열 생성
        int[] result = new int[numStr.length()];
        
        // Step 3: 문자열을 뒤에서부터 순회하여 숫자로 변환하여 배열에 저장
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(numStr.length() - 1 - i) - '0';
        }
        
        return result;
    }
}
