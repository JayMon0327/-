public class Solution {
    public int solution(String word) {
        // 알파벳 모음
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        // 사전에서의 각 알파벳에 해당하는 인덱스
        int[] index = {781, 156, 31, 6, 1};
        
        int answer = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            for (int j = 0; j < vowels.length; j++) {
                if (currentChar == vowels[j]) {
                    // 현재 알파벳까지의 조합으로 만들 수 있는 단어의 개수를 계산하여 더함
                    answer += (j * index[i] + 1);
                }
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("AAAAE")); // 6
        System.out.println(solution.solution("AAAE"));  // 10
        System.out.println(solution.solution("I"));     // 1563
        System.out.println(solution.solution("EIO"));   // 1189
    }
}
