public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        int answer = solution(arr);
        System.out.println(answer);
    }

    public static int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }
}
