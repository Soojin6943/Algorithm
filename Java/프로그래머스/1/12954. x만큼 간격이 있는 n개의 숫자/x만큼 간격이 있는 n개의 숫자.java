class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long in = x;
        
        for (int i=0; i<n; i++) {
            answer[i] = in;
            in += x;
        }
        return answer;
    }
}