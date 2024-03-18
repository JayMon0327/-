class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num); // 정수를 문자열로 변환
        char kChar = (char) ('0' + k); // 정수 k를 문자로 변환

        // numStr에서 kChar의 위치를 찾음
        int index = numStr.indexOf(kChar);

        // kChar가 numStr에 없으면 -1을, 있으면 그 위치(인덱스 + 1)를 반환
        return index == -1 ? -1 : index + 1;
    }
}
