import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] array = new int[n];

            for (int j=0; j<n; j++){
                array[j] = sc.nextInt();
            }
            Arrays.sort(array);
            System.out.println((array[array.length-1] - array[0])*2);

        }
    }

}
