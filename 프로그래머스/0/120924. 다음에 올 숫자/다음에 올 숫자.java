class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d = 0;
        int r = 0;
        if((common[1]-common[0]) == (common[2]-common[1])) {
            d = common[1]-common[0];
            answer = common[common.length-1]+d;
        } else {
            r = common[1]/common[0];
            answer = common[common.length-1]*r;
        }
        return answer;
    }
}