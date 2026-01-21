import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> hap = new HashSet<>();
        int[] round = new int[elements.length * 2];
        
        round[0] = elements[0];
        for (int i=1; i<elements.length * 2; i++) {
            round[i] = elements[i % elements.length] + round[i-1];
        }
        
        for (int i=0; i<elements.length; i++) {
            hap.add(round[i]);
            for (int j=1; j<=elements.length; j++) {
                hap.add(round[i + j] - round[i]);
            }
        }
        
        answer = hap.size();
        
        return answer;
    }
}