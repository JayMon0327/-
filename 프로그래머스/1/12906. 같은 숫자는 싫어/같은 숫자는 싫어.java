import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 리스트
        List<Integer> resultList = new ArrayList<>();
        
        // 배열을 순회하면서 연속적으로 나타나는 숫자는 하나만 남기고 제거
        for (int i = 0; i < arr.length; i++) {
            // 현재 숫자가 리스트의 마지막 숫자와 다를 때만 결과 리스트에 추가
            if (i == 0 || arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }
        
        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 예시 입력에 대한 출력
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(sol.solution(arr1))); // 예상 출력: [1, 3, 0, 1]
        
        int[] arr2 = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(sol.solution(arr2))); // 예상 출력: [4, 3]
    }
}
