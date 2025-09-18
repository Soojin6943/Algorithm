class Solution {
    boolean[][] map;
    
    public void check(int[] arr, int n){
        
        for (int i=0; i<n; i++){
            // 지도의 각 행 십진수
            int[] row = new int[n];
            int num = arr[i];
            
            int col = n-1;
            while(num > 0) {    
                int d = num % 2;
                // 1이면 벽(false), 0이면 공백(true)
                if (d == 1){
                    map[i][col] = false;
                } else {
                    if (!map[i][col]){  // 공백이지만 이미 false이면 벽 유지
                        map[i][col] = false;
                    } else {
                        map[i][col] = true;
                    }
                    
                }
                num = num / 2;
                col --;
            }
        }
        return;
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        
        // 완성된 지도 
        map = new boolean[n][n];
        
        // 기본값을 공백으로
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                map[i][j] = true;
            }
        }
        
        // 각 지도별 암호 해독
        check(arr1, n);
        check(arr2, n);
        
        for (int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<n; j++){
                if (map[i][j]) sb.append(" ");
                else sb.append("#");
            }
            answer[i] = sb.toString();
        }
        
        
        return answer;
    }
}