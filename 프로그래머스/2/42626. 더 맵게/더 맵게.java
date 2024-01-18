import java.util.PriorityQueue;

public class Solution {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        // 우선순위 큐를 사용하여 가장 작은 스코빌 지수를 가진 음식을 빠르게 찾을 수 있도록 함
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 초기에 음식들을 우선순위 큐에 추가
        for (int s : scoville) {
            pq.offer(s);
        }
        
        // 가장 작은 스코빌 지수를 가진 음식이 K 이상이 될 때까지 반복
        while (pq.peek() < K) {
            // 음식이 1개 남았을 때 K 이상을 만들 수 없는 경우
            if (pq.size() == 1) {
                answer = -1;
                break;
            }
            
            // 가장 작은 스코빌 지수를 가진 두 음식을 꺼내서 섞음
            int first = pq.poll();
            int second = pq.poll();
            int newScoville = first + (second * 2);
            
            // 섞은 음식을 우선순위 큐에 추가
            pq.offer(newScoville);
            
            // 섞은 횟수 증가
            answer++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int result = solution.solution(scoville, K);
        System.out.println(result);  // 출력 결과: 2
    }
}
