class Solution {
    public int solution(int num1, int num2) {
        double dnum1 = num1;
        double d = dnum1/num2;
        int result = (int)(d * 1000);
        
        return result;
    }
}