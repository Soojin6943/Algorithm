class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int n = start_num;
        
        for (int i=0; i<=end_num - start_num; i++) {
            answer[i] = n;
            n ++;
        }
        
        return answer;
    }
}