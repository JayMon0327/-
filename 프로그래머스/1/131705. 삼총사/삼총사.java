public class Solution {
    public int solution(int[] number) {
        int count = 0; // 삼총사 조합의 수를 카운트할 변수
        int n = number.length; // 배열의 길이

        // 모든 조합을 찾기 위한 세 개의 중첩 루프
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++; // 세 숫자의 합이 0이면 카운트 증가
                    }
                }
            }
        }

        return count; // 삼총사가 될 수 있는 조합의 수를 반환
    }
}
