import java.util.Arrays;

public class Solution {
    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[B.length - 1 - i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int result = solution(A, B);
        System.out.println(result);
    }
}
