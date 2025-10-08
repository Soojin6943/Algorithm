import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        // 소수 찾기
        for (int i=2; i<=n; i++){
            boolean check = true;
            if (i == 2){
                list.add(i);
                continue;
            }
            for (int j=2; j<=Math.sqrt(i); j++){
                if (i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                list.add(i);
            }
        }
        
        int start = 0, end = 0, sum = 0;
        int cnt = 0;
        
        while (true){
            if (sum > n) {
                sum -= list.get(start);
                start ++;
            } else if (sum == n){
                // 합과 n이 같을 때
                cnt ++;
                sum -= list.get(start);
                start ++;
            } else if (sum < n){
                // 합이 n보다 작을 때
                if (end == list.size()){
                    break;
                }
                sum += list.get(end);
                end ++;
            }
            

        }
        
        System.out.println(cnt);
    }
}