class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            if (c == alp.charAt(0)){
                c = Character.toUpperCase(c);
            }
            answer.append(c);
        }
        return answer.toString();
    }
}