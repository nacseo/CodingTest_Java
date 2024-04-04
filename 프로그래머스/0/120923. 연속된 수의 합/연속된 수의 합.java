class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int temp = 0;
        if(total%num == 0) {
            temp = total/num - num/2;
        } else {
            temp = total/num - num/2 + 1;
        }
        for(int i=0; i<num; i++) {
            answer[i] = temp++;
        }
        return answer;
    }
}