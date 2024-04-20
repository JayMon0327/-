import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(sides);
        
        // 가장 긴 변이 다른 두 변의 합보다 작은지 확인
        if (sides[2] < sides[0] + sides[1]) {
            return 1;  // 삼각형을 만들 수 있음
        } else {
            return 2;  // 삼각형을 만들 수 없음
        }
    }
}
