class Solution {
    boolean solution(String s) {
        String lower = s.toLowerCase();
        int countY = 0;
        int countP = 0;
        for (int i=0; i<lower.length(); i++) {
            if (lower.charAt(i) == 'p') countP++;
            else if (lower.charAt(i) == 'y') countY++;
        }
        
        return countY == countP ? true : false;
    }
}