class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for (int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            int num = c - '0';
            answer += num;
        }
        return (answer%9);
    }
}