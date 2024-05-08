import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1}; // 배열의 길이가 1이면 [-1] 반환

        // 배열에서 최소값 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 최소값을 제외한 나머지 원소를 가진 배열 반환
        return IntStream.of(arr)
                        .filter(x -> x != min)
                        .toArray();
    }
}
