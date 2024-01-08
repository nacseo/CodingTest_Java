class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list.length;
        int[] answer = new int[last+1];
        System.arraycopy(num_list, 0, answer, 0, last);
        if(num_list[last-1]>num_list[last-2]) {
            answer[last] = num_list[last-1] - num_list[last-2];
        } else {
            answer[last] = num_list[last-1] * 2;
        }
        return answer;
    }
}