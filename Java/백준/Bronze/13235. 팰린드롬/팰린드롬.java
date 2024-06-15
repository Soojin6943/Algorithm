import java.util.Scanner;

public class Main {
    public static boolean pall(String a){
        for (int i=0; i<a.length()/2; i++){
            if (a.charAt(i) != a.charAt(a.length()-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (pall(a))
            System.out.println("true");
        else System.out.println("false");
    }
}
