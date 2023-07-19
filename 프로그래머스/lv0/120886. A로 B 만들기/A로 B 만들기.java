import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
         int answer = 0;
        if(Arrays.equals(a,b)){
            answer=1;
        }
        return answer;
    }
}