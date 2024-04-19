import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> lastPositions = new HashMap<>();
        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lastPositions.containsKey(currentChar)) {
                result[i] = i - lastPositions.get(currentChar);
            } else {
                result[i] = -1;
            }
            lastPositions.put(currentChar, i);  // Update the last seen position of this character
        }

        return result;
    }
}
