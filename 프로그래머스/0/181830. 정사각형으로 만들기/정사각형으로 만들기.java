import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] rowsAnswer = new int[rows][rows];
        int[][] colsAnswer = new int[cols][cols];
        if(rows>cols) {
            for(int i=0; i<rows; i++) {
                rowsAnswer[i] = Arrays.copyOf(arr[i], rows);
            }
            return rowsAnswer;
        } else if(cols>rows) {
            for(int i=0; i<rows; i++) {
                colsAnswer[i] = Arrays.copyOf(arr[i], cols);
            }
            return colsAnswer;
        } else return arr;
    }
}