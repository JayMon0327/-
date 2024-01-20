import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String solution(int[] numbers) {
        // int 배열을 String 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 문자열을 조합하여 가장 큰 수 순으로 정렬
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1 + o2와 o2 + o1을 비교하여 내림차순으로 정렬
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 0만 여러 번 있는 경우 "0"으로 리턴
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        // 정렬된 순서대로 숫자를 이어 붙여 문자열로 반환
        StringBuilder answer = new StringBuilder();
        for (String strNumber : strNumbers) {
            answer.append(strNumber);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numbers1 = {6, 10, 2};
        System.out.println(solution.solution(numbers1)); // "6210"

        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(solution.solution(numbers2)); // "9534330"
    }
}
