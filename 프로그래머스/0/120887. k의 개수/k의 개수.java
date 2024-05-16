class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++) {
            String numStr = String.valueOf(a);
            for(int b=0; b<numStr.length(); b++) {
                if(numStr.charAt(b)==k+'0') answer++;
            }
        }
        return answer;
    }
}