class Solution {
    public int solution(int n) {
        int compositeCount = 0; // 합성수의 개수를 저장할 변수

        // 4부터 n까지 각 수에 대해 약수의 개수가 3개 이상인지 확인
        for (int i = 4; i <= n; i++) {
            int divisorCount = 0; // 약수의 개수를 저장할 변수
            
            // 1부터 i까지 각 수로 나누어보며 약수인지 확인
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++; // 약수이면 카운트 증가
                }
            }
            
            // 약수의 개수가 3개 이상이면 합성수
            if (divisorCount >= 3) {
                compositeCount++;
            }
        }

        return compositeCount;
    }
}
