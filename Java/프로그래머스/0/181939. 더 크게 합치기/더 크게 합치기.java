class Solution {
    public int solution(int a, int b) {
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        
        String ab = sa + sb;
        String ba = sb + sa;
        
        int answer = Integer.parseInt(ab);
        
        if (answer < Integer.parseInt(ba)){
            answer = Integer.parseInt(ba);
        }
        
        return answer;
    }
}