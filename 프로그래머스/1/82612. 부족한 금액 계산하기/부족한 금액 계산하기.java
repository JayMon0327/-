public class Solution {
    public long solution(int price, int money, int count) {
        // 등차수열의 합 계산
        long totalCost = (long) price * (count * (count + 1) / 2);

        // 필요한 추가 금액 계산
        long shortfall = totalCost - money;

        // 금액 부족이 없으면 0 반환, 부족하면 부족한 금액 반환
        return (shortfall > 0) ? shortfall : 0;
    }
}
