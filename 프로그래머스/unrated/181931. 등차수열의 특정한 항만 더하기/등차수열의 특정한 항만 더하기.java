class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int size = included.length;
        int[] arr = new int[size];
        arr[0] = a;
        for(int i=1; i<size; i++) {
            arr[i] = arr[i-1] + d;
            if(included[i] == true) {
                answer += arr[i];
            }
        }
        if(included[0] == true) {
            answer += a;
        }
        return answer;
    }
}