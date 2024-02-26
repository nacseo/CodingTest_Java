import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        int temp = 0;
        for(int i=0; i<myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                list.add(myStr.substring(temp, i));
                temp = i+1;
            }
        }
        if(temp<myStr.length()) {
            list.add(myStr.substring(temp));
        }
        for(int j=0; j<list.size(); j++) {
            if(list.get(j).isEmpty()) {
                list.remove(j);
                j--;
            }
        }
        if(list.isEmpty()) {
            list.add("EMPTY");
        }
        String[] answer = new String[list.size()];
        for(int k=0; k<list.size(); k++) {
            answer[k] = list.get(k);
        }
        return answer;
    }
}