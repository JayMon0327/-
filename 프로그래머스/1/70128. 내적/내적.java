class Solution {
    public int solution(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 예시 입력에 대한 출력
        int[] a1 = {1, 2, 3, 4};
        int[] b1 = {-3, -1, 0, 2};
        System.out.println(sol.solution(a1, b1)); // 예상 출력: 3
        
        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(sol.solution(a2, b2)); // 예상 출력: -2
    }
}
