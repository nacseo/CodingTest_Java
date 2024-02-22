import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        int[] answer = new int[str.length];
        for(int i=0; i<str.length; i++) {
            answer[i] = str[i].length();
        }
        if(myString.endsWith("x")) {
            int[] temp = new int[answer.length+1];
            temp = Arrays.copyOf(answer, answer.length+1);
            temp[temp.length-1] = 0;
            answer = temp;
        }
        return answer;
    }
}