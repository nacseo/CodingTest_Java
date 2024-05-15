class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for(int num : array) {
            int diff = Math.abs(num - n);
            if(diff<min) {
                min = diff;
                answer = num;
            } else if(diff==min && num<answer) {
                answer = num;
            }
        }
        return answer;
    }
}