class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int topRow = 0;
        int bottomRow = n-1;
        int leftCol = 0;
        int rightCol = n-1;
        int num = 1;
        
        while(num <= n*n) {
            // 왼 -> 오 이동
            for(int i=leftCol; i<=rightCol; i++) {
                answer[topRow][i] = num++;
            }
            // 다음 행 이동
            topRow++;
            
            // 위 -> 아래 이동
            for(int i=topRow; i<=bottomRow; i++) {
                answer[i][rightCol] = num++;
            }
            // 다음 열 이동
            rightCol--;
            
            // 오 -> 왼 이동
            for(int i=rightCol; i>=leftCol; i--) {
                answer[bottomRow][i] = num++;
            }
            // 다음 행 이동
            bottomRow--;
            
            // 아래 -> 위 이동
            for(int i=bottomRow; i>=topRow; i--) {
                answer[i][leftCol] = num++;
            }
            // 다음 열 이동
            leftCol++;
        }
        return answer;
    }
}