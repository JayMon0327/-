import java.util.HashMap;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        // 정현이가 원하는 제품과 수량을 매핑합니다.
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 할인되는 제품을 저장하는 윈도우를 만듭니다.
        HashMap<String, Integer> window = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            window.put(discount[i], window.getOrDefault(discount[i], 0) + 1);
        }

        // 할인 기간동안 적절한 날짜를 찾습니다.
        int result = 0;
        for (int i = 0; i <= discount.length - 10; i++) {
            if (i > 0) {
                // 윈도우를 업데이트합니다: 이전 첫 번째 제품을 제거하고 새 제품을 추가
                window.put(discount[i - 1], window.get(discount[i - 1]) - 1);
                if (window.get(discount[i - 1]) == 0) {
                    window.remove(discount[i - 1]);
                }
                window.put(discount[i + 9], window.getOrDefault(discount[i + 9], 0) + 1);
            }

            // 현재 윈도우가 정현이가 원하는 제품과 수량과 일치하는지 확인합니다.
            if (matchesWant(wantMap, window)) {
                result++;
            }
        }

        return result;
    }

    // wantMap과 window가 일치하는지 확인하는 함수
    private boolean matchesWant(HashMap<String, Integer> wantMap, HashMap<String, Integer> window) {
        for (String key : wantMap.keySet()) {
            if (window.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}