import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        // 의상 종류별 개수를 저장하는 HashMap
        HashMap<String, Integer> clothesMap = new HashMap<>();

        // 의상 종류별로 개수 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }

        // 각 의상 종류별로 선택 여부에 따라 조합의 수 계산
        int answer = 1;
        for (int count : clothesMap.values()) {
            answer *= (count + 1); // 해당 종류의 의상을 선택하지 않는 경우까지 포함하여 계산
        }

        // 모든 종류의 의상을 선택하지 않은 경우는 제외
        return answer - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 테스트
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution.solution(clothes1)); // 출력: 5
        System.out.println(solution.solution(clothes2)); // 출력: 3
    }
}
