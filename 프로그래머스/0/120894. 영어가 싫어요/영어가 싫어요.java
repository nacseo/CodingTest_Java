class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] matchNums = {"zero", "one", "two", "three", "four",
                              "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<matchNums.length; i++) {
            numbers = numbers.replaceAll(matchNums[i], String.valueOf(i));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}