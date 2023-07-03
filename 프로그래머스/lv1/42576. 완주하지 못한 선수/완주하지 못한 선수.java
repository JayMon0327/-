import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
    HashMap<String,Integer> map = new HashMap<>();
    for (String key : participant) {
      map.put(key,map.getOrDefault(key,0)+1);
    }
    for (String key : completion) {
      map.put(key, map.get(key)-1);
    }
    String answer = "";
    for (String key : map.keySet()) {
      if(map.get(key)!=0){
        answer += key;
      }
    }
        return answer;
    }
}