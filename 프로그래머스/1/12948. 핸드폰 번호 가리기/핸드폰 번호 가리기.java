public class Solution {
    public String solution(String phone_number) {
        // 전화번호의 길이
        int length = phone_number.length();
        
        // 전화번호 뒷 4자리를 제외한 나머지 숫자를 *로 가림
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(length - 4)); // 전화번호의 뒷 4자리를 추가
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String phone_number1 = "01033334444";
        System.out.println(solution.solution(phone_number1)); // Output: *******4444

        String phone_number2 = "027778888";
        System.out.println(solution.solution(phone_number2)); // Output: *****8888
    }
}
