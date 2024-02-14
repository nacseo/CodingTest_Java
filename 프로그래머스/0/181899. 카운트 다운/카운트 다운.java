import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        List<Integer> list = new ArrayList<>();
        for(int i=start; i>=end_num; i--) {
            list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}