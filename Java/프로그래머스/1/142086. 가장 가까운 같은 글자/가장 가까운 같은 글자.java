class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        char[] ch= s.toCharArray();
        
        answer[0] = -1;
        for (int i=1; i<ch.length; i++){
            char now = ch[i];
            int cnt = 0;
            for (int j=i-1; j>=0; j--){
                cnt += 1;
                answer[i] = -1;
                if (now == ch[j]) {
                    answer[i] = cnt;
                    break;
                }
            }
        }
        return answer;
    }
}