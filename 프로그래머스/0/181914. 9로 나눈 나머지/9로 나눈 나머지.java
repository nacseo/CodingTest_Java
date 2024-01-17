class Solution {
    public int solution(String number) {
        int answer = 0;
        int k = 0;
        for(int i=0; i<number.length(); i++) {
            k += number.charAt(i) - '0';
        }
        answer = k%9;
        return answer;
    }
}