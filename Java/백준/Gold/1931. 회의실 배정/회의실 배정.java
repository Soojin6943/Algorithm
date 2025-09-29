import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(br.readLine());
        List<int[]> times = new ArrayList<>();
        
        StringTokenizer st;
        for (int i=0; i<N; i++){
            String line = br.readLine();
            st = new StringTokenizer(line);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            times.add(new int[]{start, end});
        }
        
        times.sort((a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        
        int cnt = 0;
        int last_end = 0;
        
        for (int[] t : times){
            if (t[0] >= last_end){
                cnt ++;
                last_end = t[1];
            }
        }
        
        System.out.println(cnt);
    }
}