import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        BigInteger sum = x.add(y);
        return sum.toString();
    }
}