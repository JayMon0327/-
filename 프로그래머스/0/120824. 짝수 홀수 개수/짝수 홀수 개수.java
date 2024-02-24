import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;

        // 주어진 배열을 순회하면서 짝수와 홀수의 개수를 센다.
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 결과 배열을 생성하고 짝수와 홀수의 개수를 담는다.
        int[] result = {evenCount, oddCount};

        return result;
    }
}
