class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int num = 0;
        int index = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i]>num) {
                num = array[i];
                index = i;
            }
        }
        answer[0] = num;
        answer[1] = index;
        return answer;
    }
}