import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); // 다리를 모사할 큐
        int time = 0; // 경과 시간
        int currentWeight = 0; // 현재 다리에 있는 트럭의 무게 합
        
        for (int truck : truck_weights) {
            // 새로운 트럭이 다리에 진입 가능한지 확인
            while (true) {
                // 다리가 비어있는 경우
                if (bridge.isEmpty()) {
                    bridge.offer(truck);
                    currentWeight += truck;
                    time++;
                    break;
                }
                
                // 다리가 가득 찬 경우
                if (bridge.size() == bridge_length) {
                    currentWeight -= bridge.poll(); // 맨 앞의 트럭 제거
                } else {
                    // 다음 트럭이 다리에 진입 가능한지 확인
                    if (currentWeight + truck <= weight) {
                        bridge.offer(truck);
                        currentWeight += truck;
                        time++;
                        break;
                    } else {
                        bridge.offer(0); // 빈 트럭 추가 (시간 경과를 표시)
                        time++;
                    }
                }
            }
        }
        
        // 마지막 트럭이 다리를 완전히 건널 때까지의 시간 추가
        time += bridge_length;
        
        return time;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 예시 입력에 대한 출력
        System.out.println(sol.solution(2, 10, new int[]{7, 4, 5, 6})); // 예상 출력: 8
        System.out.println(sol.solution(100, 100, new int[]{10})); // 예상 출력: 101
        System.out.println(sol.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10})); // 예상 출력: 110
    }
}
