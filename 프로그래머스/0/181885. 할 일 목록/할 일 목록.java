import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<finished.length; i++) {
            if(finished[i]==false) {
                list.add(todo_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}