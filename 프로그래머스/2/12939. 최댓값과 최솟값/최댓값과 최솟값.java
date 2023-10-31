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

}
