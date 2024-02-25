class Solution {
	public int[] solution(int money) {
		int[] answer = {0,0}; //몇잔, 나머지 돈
            
        int orderPrice = 5500;
        
        answer[0] = money/orderPrice; // 아메리카노 몇잔
        answer[1] = money % orderPrice; // 사고 남은돈
        
        return answer;
	}
}