import java.util.*;

class Solution {
    public int[] solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=sqrt; i++) {
            if(n%i == 0) {
                list.add(i);
                if(n/i != i) {
                    list.add(n/i);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}