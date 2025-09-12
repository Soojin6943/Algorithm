import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] xa = new int[10];
        int[] ya = new int[10];
        Arrays.fill(xa, -1);
        Arrays.fill(ya, -1);
        int[] sam = new int[10];
        Arrays.fill(sam, -1);

        
        for (int i=0; i<X.length(); i++){
            int n = X.charAt(i) - '0';
            xa[n]++;
        }
        
        for (int i=0; i<Y.length(); i++){
            int n = Y.charAt(i) - '0';
            ya[n]++;
        }
        
        for (int i=0; i<10; i++){
            if (xa[i] == -1 || ya[i] == -1){
                continue;
            }
            int min = xa[i];
            sam[i] = Math.min(min, ya[i]) + 1;
        }
        
        for (int i=9; i>=0; i--){
            if (sam[i] == -1){
                continue;
            } else {
                for (int j=0; j<sam[i]; j++){
                    sb.append(Integer.toString(i));
                }
            }
        }
        
        String answer = sb.toString();
        if (answer.length() == 0){
            answer = "-1";
        } else if (answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }
}