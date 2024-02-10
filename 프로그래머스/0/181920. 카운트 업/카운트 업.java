import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> numbers = new ArrayList<>();
        
        // start_num부터 end_num까지의 숫자를 리스트에 추가
        for (int i = start_num; i <= end_num; i++) {
            numbers.add(i);
        }
        
        return numbers;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        int start_num = 1;
        int end_num = 5;
        System.out.println(solution.solution(start_num, end_num)); // Output: [1, 2, 3, 4, 5]
    }
}
