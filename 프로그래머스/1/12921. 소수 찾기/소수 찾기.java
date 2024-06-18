public class Solution {
    public int solution(int n) {
        // 배열을 사용하여 소수 여부를 체크
        boolean[] isPrime = new boolean[n + 1];
        
        // 처음에 모든 수를 소수로 간주
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // 소수 개수를 셈
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }
        
        return primeCount;
    }
}