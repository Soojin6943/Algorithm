import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        answer = sides[2] < sides[0] + sides[1] ? 1 : 2;
        
        // System.out.println(sides[0]);
        return answer;
    }
}