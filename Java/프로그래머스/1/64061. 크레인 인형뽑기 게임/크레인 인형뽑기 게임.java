import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        // 집게가 하나 집고 바구니 담음
        // 담을때 스택에 제일 위에꺼랑 같으면 넣지말고 팝
        // 그리고 카운트
        Stack<Integer> bucket = new Stack<>();
        int answer = 0;
        
        // 처음 peek 시 오류 발생 안하게
        bucket.push(0);
        
        for (int m : moves){  // 크레인 동작 횟수만큼 반복문 실행
            // 뽑으면 0으로 변경
            for(int i=0; i<board.length; i++){
                if(board[i][m-1] != 0){
                    if (bucket.peek() == board[i][m-1]){
                        bucket.pop();
                        answer += 2;
                    } else {
                        bucket.push(board[i][m-1]);
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
            
        }
        return answer;
    }
}