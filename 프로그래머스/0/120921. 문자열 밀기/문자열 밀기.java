class Solution {
    public int solution(String A, String B) {
        int count = 0;
        for(int i=0; i<A.length(); i++) {
            if(A.equals(B)) {
                break;
            } else {
                A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
                count++;
            }
        }
        return A.equals(B) ? count : -1;
    }
}