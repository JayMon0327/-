import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        // 방향 배열, 상하좌우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        // BFS를 위한 큐와 방문 배열 초기화
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        // 시작점 추가
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        
        // BFS 시작
        int steps = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                
                // 목표에 도달했을 경우
                if (x == n - 1 && y == m - 1) {
                    return steps;
                }
                
                // 네 방향으로 이동 시도
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    
                    // 맵의 범위를 벗어나지 않고, 벽이 아니며, 방문하지 않은 경우 이동
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
            steps++;
        }
        
        // 목표에 도달할 수 없는 경우
        return -1;
    }
}