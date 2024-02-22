import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].equals("")) {
                list.add(arr[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}