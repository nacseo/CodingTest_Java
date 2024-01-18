import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            while(s<e) {
                char k = arr[s];
                arr[s] = arr[e];
                arr[e] = k;
                
                s++;
                e--;
            }
        }
        return new String(arr);
    }
}