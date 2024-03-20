class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] rotated = new int[length];
        
        if ("right".equals(direction)) {
            // 오른쪽으로 회전
            rotated[0] = numbers[length - 1]; // 마지막 요소를 첫 번째 위치에 배치
            for (int i = 1; i < length; i++) {
                rotated[i] = numbers[i - 1]; // 나머지 요소들을 오른쪽으로 이동
            }
        } else if ("left".equals(direction)) {
            // 왼쪽으로 회전
            rotated[length - 1] = numbers[0]; // 첫 번째 요소를 마지막 위치에 배치
            for (int i = 0; i < length - 1; i++) {
                rotated[i] = numbers[i + 1]; // 나머지 요소들을 왼쪽으로 이동
            }
        }
        
        return rotated;
    }
}
