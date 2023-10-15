public class Solution {
    public int[] solution(String s) {
        int binaryTransformCount = 0;
        int removedZeroCount = 0;

        while (!s.equals("1")) {
            StringBuilder newS = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    newS.append(c);
                } else {
                    removedZeroCount++;
                }
            }

            binaryTransformCount++;
            s = Integer.toBinaryString(newS.length());
        }

        int[] result = { binaryTransformCount, removedZeroCount };
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "110010101001";
        int[] result = solution.solution(s);
        System.out.println("Binary Transform Count: " + result[0]);
        System.out.println("Removed Zero Count: " + result[1]);
    }
}
