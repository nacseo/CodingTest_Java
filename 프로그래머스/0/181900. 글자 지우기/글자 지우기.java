import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);
        int offset = 0;
        for(int i = 0; i < indices.length; i++) {
            int index = indices[i] - offset;
            answer.deleteCharAt(index);
            offset++;
        }
        return answer.toString();
    }
}