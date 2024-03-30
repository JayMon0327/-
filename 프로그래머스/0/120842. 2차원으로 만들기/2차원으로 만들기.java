class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 결과 2차원 배열의 행의 개수를 계산합니다.
        int rows = num_list.length / n;
        int[][] result = new int[rows][n];
        
        // num_list의 각 원소를 순회하면서 2차원 배열을 채웁니다.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[i * n + j];
            }
        }
        
        return result;
    }
}
