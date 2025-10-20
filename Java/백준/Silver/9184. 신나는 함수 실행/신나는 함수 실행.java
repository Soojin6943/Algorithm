import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[][][] arr = new int[21][21][21];
        arr[0][0][0] = 1;
        for (int i=0; i<=20; i++){
            for (int j=0; j<=20; j++){
                for (int k=0; k<=20; k++){
                    if (i == 0 || j == 0 || k == 0){
                        arr[i][j][k] = 1;
                        continue;
                    }
                    if (i < j && j < k){
                        arr[i][j][k] = arr[i][j][k-1] + arr[i][j-1][k-1] - arr[i][j-1][k];
                    } else {
                        arr[i][j][k] = arr[i-1][j][k] + arr[i-1][j-1][k] + arr[i-1][j][k-1] - arr[i-1][j-1][k-1];
                    }
                }
            }
        }

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == -1 && b == -1 && c == -1){
                break;
            }

            if (a <=0 || b <= 0 || c <= 0){
                sb.append("w(" + a + ", " + b + ", " + c + ") = " + arr[0][0][0]).append("\n");
            } else if (a > 20 || b > 20 || c > 20) {
                sb.append("w(" + a + ", " + b + ", " + c + ") = " + arr[20][20][20]).append("\n");
            } else {
                sb.append("w(" + a + ", " + b + ", " + c + ") = " + arr[a][b][c]).append("\n");
            }

        }

        System.out.println(sb.toString());
    }
}
