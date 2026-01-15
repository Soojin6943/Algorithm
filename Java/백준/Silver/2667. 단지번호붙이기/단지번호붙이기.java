import java.util.*;

class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = new int[]{0, 0, 1, -1};
    static int[] dy = new int[]{1, -1, 0, 0};
    static int apartNum = 0;
    static HashMap<Integer, Integer> houseNum = new HashMap<>();
    
    public static void dfs(int x, int y, int N) {
        visited[x][y] = true;
        houseNum.put(apartNum, houseNum.getOrDefault(apartNum, 0) + 1);
        
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if (map[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny, N);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 지도 
        map = new int[N][N];
        for (int i=0; i<N; i++) {
            String input = sc.next();
            for (int j=0; j<N; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        
        visited = new boolean[N][N];
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    apartNum ++;
                    dfs(i, j, N);
                }
            }
        }
        
        List<Integer> houseNumKey = new ArrayList<>(houseNum.keySet());
        
        houseNumKey.sort((o1, o2) -> houseNum.get(o1).compareTo(houseNum.get(o2)));
        
        StringBuilder sb = new StringBuilder();
        for (int house : houseNumKey) {
            sb.append(houseNum.get(house)).append("\n");
        }
        
        System.out.println(apartNum);
        System.out.println(sb);
    }
}