class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        
        for (int i=0; i<ch.length; i++){
            if (ch[i] == ' '){
                continue;
            } else if (Character.isUpperCase(ch[i])) {
                ch[i] = (char)((ch[i] - 'A' + n)%26 + 'A');
            } else if (Character.isLowerCase(ch[i])){
                ch[i] = (char)((ch[i] - 'a' + n)%26 + 'a');
            } 
        }
        answer = String.valueOf(ch);
        return answer;
    }
}