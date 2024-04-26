import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float T = sc.nextFloat();
        sc.close();


        int result = Math.round((T/2)*(T/2));
        System.out.print(result);
    }
}
