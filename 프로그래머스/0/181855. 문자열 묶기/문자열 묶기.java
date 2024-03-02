import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> groupCount = new HashMap<>();
        for(String str : strArr) {
            int length = str.length();
            groupCount.put(length, groupCount.getOrDefault(length, 0)+1);
        }
        int answer = 0;
        for(int count : groupCount.values()) {
            answer = Math.max(answer, count);
        }
        return answer;
    }
}