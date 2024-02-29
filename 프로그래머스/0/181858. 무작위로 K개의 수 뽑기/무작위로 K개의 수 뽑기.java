import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
            if(list.size()==k) break;
        }
        while(list.size()<k) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}