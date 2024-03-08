class Solution {
    public String solution(String n_str) {
        int count = 0;
        while(count < n_str.length() && n_str.charAt(count)=='0') {
            count++;
        }
        return n_str.substring(count);
    }
}