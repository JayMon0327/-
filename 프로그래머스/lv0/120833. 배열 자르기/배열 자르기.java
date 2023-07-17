import java.util.*;
class Solution {
	public int[] solution(int[] numbers,int num1, int num2) { 
		int size = num2 - num1+1; // 3-1+1(3개)
		int[] answer = new int[size];
		int num = num1;
		for(int i=0; i<size;i++){
			answer[i]=numbers[num];
			num++;
		}
		return answer;
	}
}