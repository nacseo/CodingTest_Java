class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int temp = my_string.length()/m;
        String[][] arr = new String[temp][m];
        for(int i=0; i<temp; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = my_string.substring(i*m+j, i*m+j+1);
            }
        }
        for(int i=0; i<temp; i++) {
            answer += arr[i][c-1];
        }
        return answer;
    }
}