import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int newLength = 1;
        while(newLength<length) {
            newLength *= 2;
        }
        int[] answer = Arrays.copyOf(arr, newLength);
        return answer;
    }
}