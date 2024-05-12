public class Solution {
    public int solution(int n) {
        // 1. n을 3진법으로 변환
        String ternary = Integer.toString(n, 3);

        // 2. 3진법 수를 뒤집기
        String reversedTernary = new StringBuilder(ternary).reverse().toString();

        // 3. 뒤집은 3진법 수를 다시 10진법으로 변환
        return Integer.parseInt(reversedTernary, 3);
    }
}
