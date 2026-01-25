class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ", -1); // 아직 공백이 연속으로 오는지는 확신 X
        
        StringBuilder sb = new StringBuilder();
        
        for (String word : str) {
            for (int i=0; i<word.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(word.charAt(i)));
                } else sb.append(Character.toLowerCase(word.charAt(i)));
            }
            sb.append(" ");
        }
        
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}