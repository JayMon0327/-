import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int m = set.size();
        int answer = Math.min(m, n/2);
        return answer;
    }
}
