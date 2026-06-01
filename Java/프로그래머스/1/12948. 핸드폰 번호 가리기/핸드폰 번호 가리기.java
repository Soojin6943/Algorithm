class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int lastLength = phone_number.length() - 4;
        
        for (int i=0; i<lastLength; i++) {
            answer.append("*");
        }
        
        
        answer.append(phone_number.substring(lastLength, lastLength+4));
        
        return answer.toString();
    }
}