import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            
            int size = (int) Math.pow(3, n);
            
            char[] arr = new char[size];
            Arrays.fill(arr, '-');
        
            while (size > 1) {
                size = size / 3;
                for (int i=0 ; i < arr.length; i++) {
                    if ((i / size) % 2 != 0) {
                        arr[i] = ' ';
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
        
            for (char c : arr) {
                sb.append(c);
            }
        
            System.out.println(sb);
        }
    }
}