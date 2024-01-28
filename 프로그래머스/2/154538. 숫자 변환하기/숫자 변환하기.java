import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static int solution(int x, int y, int n) {
        // x와 y가 같으면 연산이 필요하지 않으므로 0을 반환합니다.
        if (x == y) {
            return 0;
        }

        // x에서 y로 변환할 수 없는 경우
        if (x > y) {
            return -1;
        }

        // 방문한 숫자를 기록하기 위한 배열
        boolean[] visited = new boolean[y + 1];
        // 연산 횟수를 기록하기 위한 배열
        int[] count = new int[y + 1];

        // 초기값 설정
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(x);
        visited[x] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // 곱하기 연산 수행
            if (current * 2 <= y && !visited[current * 2]) {
                visited[current * 2] = true;
                count[current * 2] = count[current] + 1;
                queue.offer(current * 2);
            }

            // 곱하기 연산 수행
            if (current * 3 <= y && !visited[current * 3]) {
                visited[current * 3] = true;
                count[current * 3] = count[current] + 1;
                queue.offer(current * 3);
            }

            // 더하기 연산 수행
            if (current + n <= y && !visited[current + n]) {
                visited[current + n] = true;
                count[current + n] = count[current] + 1;
                queue.offer(current + n);
            }

            // 목표 숫자에 도달한 경우 최소 연산 횟수 반환
            if (visited[y]) {
                return count[y];
            }
        }

        // 목표 숫자에 도달하지 못한 경우 -1 반환
        return -1;
    }

    public static void main(String[] args) {
        // 예시 입력에 대한 테스트
        System.out.println(solution(10, 40, 5)); // 2
        System.out.println(solution(10, 40, 30)); // 1
        System.out.println(solution(2, 5, 4)); // -1
    }
}
