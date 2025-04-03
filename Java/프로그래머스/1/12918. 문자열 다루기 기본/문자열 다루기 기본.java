class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() ==4 || s.length() == 6){
           for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int num = c;
            
            if (num > 57 || num < 48){
                answer = false;
                break;
            } 
        } 
        } else {
            return false;
        }
        
        return answer;
    }
}