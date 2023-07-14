class Solution {
	public int solution(int n, int k) {
			int free = n/10; // 무료로 주는 음료 수
			int answer = n * 12000 + k * 2000 - free * 2000;
			return answer;
	}
}