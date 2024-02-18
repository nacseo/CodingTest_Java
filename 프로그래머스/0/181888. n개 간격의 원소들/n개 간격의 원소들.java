import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num_list.length; i+=n) {
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}