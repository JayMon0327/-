class Solution {
    public double solution(int[] numbers) {
        int size = numbers.length; // 넘버 배열의 개수
        
        int sum = 0;
        for(int x : numbers){
            sum += x;
        }
        
        double answer = (double) sum/size;
        return answer;
    }
}