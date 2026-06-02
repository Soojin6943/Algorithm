class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        long m = price;
        for (int i=1; i<=count; i++) {
            total += m;
            m += price;
        }
        
        if (total >= money) {
            return total - money;
        }
        return 0;
    }
}