import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        // 문자열을 순회하며 스택에 숫자를 쌓음
        for (char num : number.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() < num) {
                stack.pop(); // 현재 숫자보다 작은 숫자 제거
                k--;
            }
            stack.push(num);
        }
        
        // 남은 숫자가 제거할 숫자(k)보다 많을 수 있으므로 남은 숫자 중에서 k개 제거
        for (int i = 0; i < k; i++) {
            stack.pop();
        }
        
        // 스택에 있는 숫자들을 문자열로 변환하여 리턴
        StringBuilder answer = new StringBuilder();
        for (char num : stack) {
            answer.append(num);
        }
        
        return answer.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 테스트 케이스
        String number1 = "1924";
        int k1 = 2;
        System.out.println(solution.solution(number1, k1)); // "94"
        
        String number2 = "1231234";
        int k2 = 3;
        System.out.println(solution.solution(number2, k2)); // "3234"
        
        String number3 = "4177252841";
        int k3 = 4;
        System.out.println(solution.solution(number3, k3)); // "775841"
    }
}
