class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int len = s.length();

        // 1. 0제거
        // 2. 문자열 길이 체크
        // 3. 이진 변환
        
        while(len != 1){
            // 0제거
            String rep = s.replace("0", "");
            // 길이 체크
            len = rep.length();
            // 제거된 0 갯수 카운트
            answer[1] += s.length() - len;

            // 2진수 변환
            s = Integer.toBinaryString(len);
            
            // 이진 변환 횟수 카운트
            answer[0] += 1;
            
            //System.out.println(s);
        }
        
        
        return answer;
    }
}