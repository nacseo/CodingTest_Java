import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++) {
            list1.add(Integer.parseInt(intStrs[i].substring(s,s+l)));
            }
        for(int x=0; x<list1.size(); x++) {
            if(list1.get(x)>k) {
                list2.add(list1.get(x));
            }
        }
        int[] answer = list2.stream().mapToInt(y->y).toArray();
        return answer;
    }
}