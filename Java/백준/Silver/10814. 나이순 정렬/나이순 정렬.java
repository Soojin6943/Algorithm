import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String[][] arr = new String[N][2];
        sc.nextLine();
        
        for (int i=0; i<N; i++) {
            String[] now = sc.nextLine().split(" ");
            arr[i][0] = now[0];
            arr[i][1] = now[1];
        }
        
        Arrays.sort(arr, (o1, o2) -> {
            int age1 = Integer.parseInt(o1[0]);
            int age2 = Integer.parseInt(o2[0]);
            return age1 - age2;
        });
        
        StringBuilder sb = new StringBuilder();
        for (String[] s : arr) {
            sb.append(s[0] + " " + s[1]).append("\n");
        }
        
        System.out.println(sb);
    }
}