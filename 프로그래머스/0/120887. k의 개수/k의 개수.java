class Solution {
    public int solution(int i, int j, int k) {
        int count = 0; // k가 등장하는 횟수를 저장할 변수
        String kStr = String.valueOf(k); // 비교를 위해 k를 문자열로 변환

        // i부터 j까지 모든 숫자에 대해 검사
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num); // 현재 숫자를 문자열로 변환
            // 현재 숫자의 문자열에 k가 몇 번 등장하는지 카운트
            for (int index = 0; index < numStr.length(); index++) {
                if (numStr.charAt(index) == kStr.charAt(0)) {
                    count++;
                }
            }
        }

        return count;
    }
}
