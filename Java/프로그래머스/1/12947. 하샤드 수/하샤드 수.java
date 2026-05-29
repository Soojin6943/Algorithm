class Solution {
    public boolean solution(int x) {
        int hap = 0;
        int real = x;
        
        while (x > 0) {
            hap += x % 10;
            x /= 10;
        }
        
        return real % hap == 0 ? true : false;
    }
}