
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        while (num > 0){
            arr.add(num % 10);
            num = num / 10;
        }

        arr.sort(Collections.reverseOrder());

        int result = arr.get(0);
        for (int i=1; i<arr.size(); i++){
            result *= 10;
            result += arr.get(i);
        }

        System.out.println(result);
    }
}
