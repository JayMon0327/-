public class Solution {
    public String solution(int a, int b) {
        // 각 월별 일수, 1월부터 시작
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 요일 배열, 1월 1일이 금요일이므로 인덱스 0은 금요일
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 1월 1일부터 a월 b일까지의 총 일수를 계산
        int totalDays = b - 1; // a월 b일의 b-1일까지 계산
        for (int i = 0; i < a - 1; i++) { // 1월부터 (a-1)월까지의 일수를 더함
            totalDays += daysInMonth[i];
        }
        
        // 총 일수를 7로 나눈 나머지를 사용하여 요일 결정
        return daysOfWeek[totalDays % 7];
    }
}