class Solution {
    public int solution(int n, String control) {
        for(int i=0; i<control.length(); i++) {
            char x = control.charAt(i);
            if(x == 'w') {
                n += 1;
            } else if(x == 's') {
                n -= 1;
            } else if(x == 'd') {
                n += 10;
            } else if(x == 'a') {
                n -= 10;
            }
        }
        return n;
    }
}