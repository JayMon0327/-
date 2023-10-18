import java.util.Stack;

public class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "abbaccc"; // 예시 문자열
        System.out.println(solution.solution(S)); // 결과 출력
    }
}
