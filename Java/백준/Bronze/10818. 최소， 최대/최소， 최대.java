import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = sc.nextInt();
        int maxN = num;
        int minN = num;

        for (int i=1; i<N; i++){
            num = sc.nextInt();
            if (maxN < num){
                maxN = num;
            } else if (minN > num){
                minN = num;
            }
        }

        System.out.print(minN + " " + maxN);
    }
}
