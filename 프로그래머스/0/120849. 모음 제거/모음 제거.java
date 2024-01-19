public class Solution {

    public static String solution(String myString) {
        String vowels = "aeiou";
        
        // StringBuilder를 사용하여 모음을 제외한 문자들로 새로운 문자열을 만듭니다.
        StringBuilder resultBuilder = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            if (vowels.indexOf(ch) == -1) {
                resultBuilder.append(ch);
            }
        }
        
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        // 예시 테스트
        System.out.println(solution("bus"));  // 출력 결과: "bs"
        System.out.println(solution("nice to meet you"));  // 출력 결과: "nc t mt y"
    }
}
