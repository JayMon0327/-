import java.util.ArrayList; 

public class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> result = new ArrayList<>(); // 결과를 저장할 ArrayList 생성
        for (int i = 1; i <= n; i++) {
            result.add((long) x * i); // x에 i를 곱한 값을 리스트에 추가
        }
        return result; // 생성된 리스트 반환
    }
}
