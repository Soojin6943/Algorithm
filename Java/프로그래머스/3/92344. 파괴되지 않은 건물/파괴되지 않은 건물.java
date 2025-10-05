class Solution {
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        // 누적 합 행렬 만들기
        int arr[][] = new int[board.length + 1][board[0].length + 1];
        for (int i=0; i<skill.length; i++){
            int type = skill[i][0];
            int r1 = skill[i][1]; int c1 = skill[i][2];
            int r2 = skill[i][3]; int c2 = skill[i][4];
            int degree = skill[i][5];
            
            arr[r1][c1] += type == 1 ? -1 * degree : degree;
            arr[r1][c2+1] += type == 1 ? degree : -1 * degree;
            arr[r2+1][c1] += type == 1 ? degree : -1 * degree;
            arr[r2+1][c2+1] += type == 1 ? -1 * degree : degree;
        }
        
        //누적 합 계산하기
        for (int i=0; i<board[0].length; i++){
            for (int j=1; j<board.length; j++){
                arr[j][i] = arr[j-1][i] + arr[j][i];
            }
        }
        
        for (int i=0; i<board.length; i++){
            for (int j=1; j<board[0].length; j++){
                arr[i][j] = arr[i][j-1] + arr[i][j];
            }
        }
        
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                board[i][j] += arr[i][j];
                if (board[i][j] >0){
                    answer ++;
                }
            }
        }
        return answer;
    }
}