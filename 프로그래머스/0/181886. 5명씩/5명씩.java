import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<names.length; i+=5) {
            list.add(names[i]);
        }
        String[] answer = new String[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        } 
        return answer;
    }
}