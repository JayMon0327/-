import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
    char[] s = my_string.toLowerCase().toCharArray();
        Arrays.sort(s);
        for(char x : s){
            answer = answer +x;
        }
        
        return answer;
    }
}