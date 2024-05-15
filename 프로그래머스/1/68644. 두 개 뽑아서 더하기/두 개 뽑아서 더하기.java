import java.util.TreeSet;

public class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> sums = new TreeSet<>(); // 자동 정렬과 중복 제거를 위해 TreeSet 사용

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]); // 두 수의 합을 저장
            }
        }

        // TreeSet을 배열로 변환
        return sums.stream().mapToInt(Integer::intValue).toArray();
    }
}
