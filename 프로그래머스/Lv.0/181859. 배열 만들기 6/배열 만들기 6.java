import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i+=1;
            } else {
                if(list.size() != 0) {
                    int last = list.get(list.size()-1);
                    if(last == arr[i]) {
                        list.remove(list.size()-1);
                        i+=1;
                    } else if(last != arr[i]) {
                        list.add(arr[i]);
                        i+=1;
                    }
                }
            }
        }
        int[] stk = list.stream().mapToInt(k->k).toArray();
        if(stk.length == 0) return new int[]{-1};
        return stk;
    }
}