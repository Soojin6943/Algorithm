import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = 1;
        int i = 1;
        
        if (n == 1){
            System.out.println(1);
        } else{
            while(n>range){
                range += 6*i;
                i++;
            }
            System.out.println(i);
        }
       
    }
}