class Solution {
	public int[] solution(int[] num_list) {
			int[] answer = new int[num_list.length];
			//수도코드(모의코드)
			//1. 반복문을 이용해서
			//2. num_list 에서 0부터 하나씩 꺼내주고 --> i변수 이용
			//3. answer배열의 뒤에서 부터 하나씩 넣어준다. --> 뒤에서 부터 카운트 해줄 별도의 변수가 필요!! -> j변수 이용
			//--> j변수의 시작은 맨 뒤에서 부터 시작을 해야함!! --> numbers.length - 1
			// {1,2,3,4,5,} --> {5,4,3,2,1,}
			int j = num_list.length -1 ;// 마지막 index 값을 알 수 있음
			for(int i=0; i< num_list.length; i++){
				answer[j] = num_list[i];
				j--;
			}
			return answer;
	}
}