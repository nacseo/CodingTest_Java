class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int k = my_string.length();
        for(int i=k-n; i<k; i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}