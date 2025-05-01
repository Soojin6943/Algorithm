class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num = Integer.toString(n);
        for(char c : num.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }
}