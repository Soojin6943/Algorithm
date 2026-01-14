import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long[] road =  new long[N-1];
        long[] price = new long[N];
        
        for (int i=0; i<N-1; i++) {
            road[i] = sc.nextLong();
        }
        
        for (int i=0; i<N; i++) {
            price[i] = sc.nextLong();
        }
        
        long[] result = new long[N];
        long low_price = price[0];
        // 첫번째 도시는 무조건 다음 도시 거리만큼 구매
        result[0] = price[0] * road[0];
        
        for (int i=0; i<N-2; i++) {
            if (price[i+1] < low_price) {
                low_price = price[i+1];
            }
            
            result[i+1] = low_price * road[i+1];
        }
        
        long totalPrice = Arrays.stream(result)
            .sum();
        
        System.out.println(totalPrice);
    }
}