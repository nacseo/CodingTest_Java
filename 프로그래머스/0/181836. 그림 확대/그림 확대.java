class Solution {
    public String[] solution(String[] picture, int k) {
        int row = picture.length;
        int col = picture[0].length();
        
        int newRow = row * k;
        int newCol = col * k;
        
        String[] answer = new String[newRow];
        
        for(int i=0; i<newRow; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<newCol; j++) {
                sb.append(picture[i/k].charAt(j/k));
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}