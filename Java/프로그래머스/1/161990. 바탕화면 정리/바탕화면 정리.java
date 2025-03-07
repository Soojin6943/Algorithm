class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int col_min = -1;
        int row_min = -1;
        int col_max = -1;
        int row_max = -1;
        
        for (int i=0; i<wallpaper.length; i++) {
            String s = wallpaper[i];
            
            for (int k=0; k<s.length(); k++){
                char ch = s.charAt(k);
                if (ch == '#'){
                    if (col_min > k || col_min == -1) {
                        col_min = k;
                        //col_max = k;
                    } 
                    if (col_max < k || col_max == -1) {
                        col_max = k;
                    }
                    if (row_min > i || row_min == -1){
                        row_min = i;
                    } 
                    if (row_max < i || row_max == -1) {
                        row_max = i;
                    }
                }
            }
        }
        answer[0] = row_min;
        answer[1] = col_min;
        answer[2] = row_max + 1;
        answer[3] = col_max + 1;
        return answer;
        
    }
}