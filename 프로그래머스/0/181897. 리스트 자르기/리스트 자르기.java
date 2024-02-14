import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        if(n==1) {
            for(int i=0; i<=slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else if(n==2) {
            for(int j=slicer[0]; j<num_list.length; j++) {
                list.add(num_list[j]);
            }
        } else if(n==3) {
            for(int k=slicer[0]; k<=slicer[1]; k++) {
                list.add(num_list[k]);
            }
        } else if(n==4) {
            for(int x=slicer[0]; x<=slicer[1]; x+=slicer[2]) {
                list.add(num_list[x]);
            }
        }
        int[] answer = new int[list.size()];
        for(int y=0; y<list.size(); y++) {
            answer[y] = list.get(y);
        }
        return answer;
    }
}