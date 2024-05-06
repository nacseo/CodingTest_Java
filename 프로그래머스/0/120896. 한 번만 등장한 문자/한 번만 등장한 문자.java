import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count==1) {
                answer += arr[i];
            }
        }
        return answer;
    }
}