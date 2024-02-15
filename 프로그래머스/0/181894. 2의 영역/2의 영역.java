import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==2) {
                firstIndex = i;
                break;
            }
        }
        if(firstIndex != -1) {
            for(int j=firstIndex; j<arr.length; j++) {
                if(arr[j]==2) {
                    lastIndex = j;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        if(firstIndex == -1) {
            list.add(-1);
        } else if(firstIndex == lastIndex) {
            list.add(2);
        } else {
            for(int k=firstIndex; k<=lastIndex; k++) {
                list.add(arr[k]);
            }
        }
        int[] answer = new int[list.size()];
        for(int x=0; x<list.size(); x++) {
            answer[x] = list.get(x);
        }
        return answer;
    }
}