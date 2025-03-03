class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자 나누기
        String[] sp = s.split(" ");
        
        // 최대최솟값 초기화
        int max = Integer.parseInt(sp[0]); 
        int min = Integer.parseInt(sp[0]); 

        
        for (int i=0; i < sp.length; i++){
            int a = Integer.parseInt(sp[i]);
            
            if (a > max) {
                max = a;
            } else if (a < min){
                min = a;
            }
        }
        answer = min + " " + max;
        return answer;
    }
}