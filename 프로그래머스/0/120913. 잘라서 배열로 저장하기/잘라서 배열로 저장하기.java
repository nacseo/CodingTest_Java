import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<my_str.length(); i+=n) {
            if(i+n > my_str.length()) {
                list.add(my_str.substring(i));
            } else {
                list.add(my_str.substring(i, i+n));
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}