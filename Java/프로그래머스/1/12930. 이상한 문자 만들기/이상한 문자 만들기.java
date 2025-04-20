class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        
        // 공백으로 문자열 배열로 나누기
        // 문자열 기준으로 대소 변경
        // 공백이 2개 이상 연속일때 생각하기
        
        String[] arr = s.split(" ", -1);
        
        for (String str : arr) {    // 나눈 문자별로 수행
            for (int i=0; i<str.length(); i++){ // 문자열의 문자 바꾸기
                
                char change = str.charAt(i);
                if (i % 2 == 0){ // 짝수 - 대문자
                    answer.append(Character.toUpperCase(change));
                } else { // 홀수 - 소문자
                    answer.append(Character.toLowerCase(change));
                }
            }
            
            answer.append(" ");
            
        }
        
        // 마지막 공백 삭제
        answer.deleteCharAt(answer.length() -1);
        return answer.toString();
    }
}