import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> divisorsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorsList.add(i); // 약수 추가
            }
        }

        // ArrayList를 배열로 변환
        int[] divisorsArray = new int[divisorsList.size()];
        for (int i = 0; i < divisorsList.size(); i++) {
            divisorsArray[i] = divisorsList.get(i);
        }

        return divisorsArray;
    }
}
