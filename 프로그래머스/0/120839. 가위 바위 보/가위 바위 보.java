public class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        
        for (char c : rsp.toCharArray()) {
            if (c == '2') {
                result.append('0');  // 가위는 바위로 이김
            } else if (c == '0') {
                result.append('5');  // 바위는 보로 이김
            } else if (c == '5') {
                result.append('2');  // 보는 가위로 이김
            }
        }
        
        return result.toString();
    }
}