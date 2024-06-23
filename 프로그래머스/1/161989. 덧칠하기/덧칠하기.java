public class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0; // 페인트칠 횟수
        int current = 0; // 현재 페인트칠 위치
        
        // section 배열을 순차적으로 탐색
        while (current < section.length) {
            count++;
            int start = section[current]; // 현재 위치에서 롤러를 시작
            current++;
            
            // 롤러가 커버할 수 있는 구역까지 탐색
            while (current < section.length && section[current] < start + m) {
                current++;
            }
        }
        
        return count;
    }
}