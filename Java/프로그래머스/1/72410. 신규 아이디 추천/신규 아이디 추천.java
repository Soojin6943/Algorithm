class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1 단계 - 소문자로 치환
        String id = new_id.toLowerCase();
        
        // 2, 3 단계 - 가능한 문자만 남기고, 마침표가 연속되면 하나만 남기기
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (Character.isLowerCase(c) || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                if (i >= 1 && sb.length() > 0 && sb.charAt(sb.length() - 1) == '.' && c == '.') continue;
                sb.append(c);
            }
        }
        
        // 4단계
        if (sb.length() > 0 && sb.charAt(0) == '.') sb.deleteCharAt(0);
        if (sb.length() > 0 && sb.charAt(sb.length()-1) == '.') sb.deleteCharAt(sb.length()-1);
        
        // 5
        if (sb.length() == 0) sb.append("a");
        
        // 6
        answer = sb.toString();
        if (sb.length() >= 16) answer = answer.substring(0, 15);
        if (answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, answer.length()-1);
        
        // 7
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}