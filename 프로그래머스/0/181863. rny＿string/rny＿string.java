public class Solution {
    public String solution(String rny_string) {
        // 'm'을 "rn"으로 바꾸기
        String result = rny_string.replace("m", "rn");
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String rny_string1 = "masterpiece";
        System.out.println(solution.solution(rny_string1)); // Output: "rnasterpiece"

        String rny_string2 = "programmers";
        System.out.println(solution.solution(rny_string2)); // Output: "prograrnrners"

        String rny_string3 = "jerry";
        System.out.println(solution.solution(rny_string3)); // Output: "jerry"

        String rny_string4 = "burn";
        System.out.println(solution.solution(rny_string4)); // Output: "burn"
    }
}
