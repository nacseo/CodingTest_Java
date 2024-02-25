import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<answer.length; i++) {
            if(!answer[i].isEmpty()) {
                list.add(answer[i]);
            }
        }
        answer = new String[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }
}