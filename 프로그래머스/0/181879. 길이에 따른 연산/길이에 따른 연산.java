class Solution {
    public int solution(int[] num_list) {
        if(num_list.length>=11) {
            int sum = 0;
            for(int i=0; i<num_list.length; i++) {
                sum += num_list[i];
            }
            return sum;
        } else {
            int product = 1;
            for(int j=0; j<num_list.length; j++) {
                product *= num_list[j];
            }
            return product;
        }
    }
}