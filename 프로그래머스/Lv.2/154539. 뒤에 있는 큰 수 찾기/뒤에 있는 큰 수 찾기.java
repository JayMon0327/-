import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(numbers[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 테스트
        int[] result1 = solution.solution(new int[]{2, 3, 3, 5});
        System.out.println(Arrays.toString(result1)); // 출력: [3, 5, 5, -1]

        int[] result2 = solution.solution(new int[]{9, 1, 5, 3, 6, 2});
        System.out.println(Arrays.toString(result2)); // 출력: [-1, 5, 6, 6, -1, -1]
    }
}
