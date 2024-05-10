public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int numRows = arr1.length;  // 행의 개수
        int numCols = arr1[0].length;  // 열의 개수
        
        int[][] answer = new int[numRows][numCols];  // 결과 행렬 초기화

        for (int i = 0; i < numRows; i++) {  // 각 행에 대해 반복
            for (int j = 0; j < numCols; j++) {  // 각 열에 대해 반복
                answer[i][j] = arr1[i][j] + arr2[i][j];  // 행렬의 같은 위치 원소끼리 더하기
            }
        }

        return answer;  // 계산된 결과 행렬 반환
    }
}
