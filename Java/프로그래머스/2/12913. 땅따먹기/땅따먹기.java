import java.util.*;

class Solution {
//     static int result = Integer.MIN_VALUE;
    
//     public static void dfs(int score, int depth, int before, int[][] land) {
//         if (depth == land.length - 1) {
//             result = Math.max(result, score);
//             return;
//         }
        
//         for (int i=0; i<4; i++) {
//             if (before == i) continue;
//             dfs(score + land[depth+1][i], depth + 1, i, land);
//         }
//     }
    
    int solution(int[][] land) {
        for (int i=1; i<land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][1]));
        }
        
        return Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), 
                        Math.max(land[land.length-1][2], land[land.length-1][3]));
    }
}