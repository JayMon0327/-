class Solution {
    public double solution(int[] numbers) {
        int size = numbers.length; //개수
        int sum = 0;
        for(int x : numbers){
            sum = sum+x;
        }
        
        double answer = (double)sum/size;
        return answer;
    }
}