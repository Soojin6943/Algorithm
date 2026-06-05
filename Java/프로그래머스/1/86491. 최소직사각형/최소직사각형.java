class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxY = 0;
        for (int[] s : sizes) {
            int w, y;
            
            if (s[0] < s[1]) {
                maxW = Math.max(maxW, s[0]);
                maxY = Math.max(maxY, s[1]);
            } else {
                maxW = Math.max(maxW, s[1]);
                maxY = Math.max(maxY, s[0]);
            }
            
        }
        return maxW * maxY;
    }
}