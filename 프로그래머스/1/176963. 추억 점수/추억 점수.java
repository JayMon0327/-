import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameYearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            nameYearningMap.put(name[i], yearning[i]);
        }

        int[] result = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int totalYearning = 0;
            for (String person : photo[i]) {
                totalYearning += nameYearningMap.getOrDefault(person, 0);
            }
            result[i] = totalYearning;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 입력에 대한 테스트
        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution.solution(name1, yearning1, photo1))); // [19, 15, 6]

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        System.out.println(Arrays.toString(solution.solution(name2, yearning2, photo2))); // [67, 0, 55]

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
        System.out.println(Arrays.toString(solution.solution(name3, yearning3, photo3))); // [5, 15, 0]
    }
}
