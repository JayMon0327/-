public class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String number : numbers) {
            int n = Integer.parseInt(number);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "1 2 3 4";
        String s2 = "-1 -2 -3 -4";
        String s3 = "-1 -1";

        System.out.println(solution.solution(s1)); // "1 4"
        System.out.println(solution.solution(s2)); // "-4 -1"
        System.out.println(solution.solution(s3)); // "-1 -1"
    }
}
