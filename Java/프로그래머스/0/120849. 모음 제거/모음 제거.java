class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        for (char s: my_string.toCharArray()){
            if (s != 'i' && s != 'o' && s != 'a' && s != 'e' && s != 'u') {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}