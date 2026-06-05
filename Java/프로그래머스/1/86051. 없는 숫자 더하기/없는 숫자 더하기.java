class Solution {
    public int solution(int[] numbers) {
        int max = 45;
        
        for (int i : numbers) {
            max -= i;
        }
        
        return max;
    }
}