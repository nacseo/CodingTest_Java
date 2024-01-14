import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n>1) {
            if(n%2 == 0) {
                n /= 2;
                list.add(n);
            } else if(n%2 == 1) {
                n = 3*n+1;
                list.add(n);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}