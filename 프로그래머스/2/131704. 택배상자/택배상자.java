import java.util.ArrayList;

public class Solution {
    public int solution(int[] order) {
        ArrayList<Integer> container = new ArrayList<>(); // 보조 컨테이너 벨트
        int currentBox = 1; // 현재 처리해야 할 상자 번호
        int loadedBoxes = 0; // 트럭에 실린 상자의 수
        int orderIdx = 0; // 현재 처리해야 할 order 인덱스

        while (currentBox <= order.length || !container.isEmpty()) {
            // 현재 상자가 택배 기사님의 순서와 일치하는 경우
            if (orderIdx < order.length && currentBox == order[orderIdx]) {
                loadedBoxes++;
                orderIdx++;
                currentBox++;
            } else if (!container.isEmpty() && orderIdx < order.length && container.get(container.size() - 1) == order[orderIdx]) {
                // 보조 컨테이너 벨트의 상자가 택배 기사님의 순서와 일치하는 경우
                container.remove(container.size() - 1);
                loadedBoxes++;
                orderIdx++;
            } else {
                // 보조 컨테이너 벨트에 상자를 저장
                if (currentBox <= order.length) {
                    container.add(currentBox);
                    currentBox++;
                } else {
                    // 현재 상자가 처리할 상자보다 많으면 중단
                    break;
                }
            }
        }

        return loadedBoxes;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{4, 3, 1, 2, 5})); // 결과: 2
        System.out.println(solution.solution(new int[]{5, 4, 3, 2, 1})); // 결과: 5
    }
}
