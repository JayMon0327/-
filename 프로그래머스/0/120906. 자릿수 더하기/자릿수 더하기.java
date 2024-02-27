class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10; // n의 마지막 자리 숫자를 answer에 더함
            n /= 10; // n을 10으로 나눈 몫을 다시 n에 할당
        }
        return answer;
    }
}
