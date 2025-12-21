import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] change = new int[]{25, 10, 5, 1};
        
        for (int i=0; i<T; i++) {
            int[] changeMoney = new int[4];
            
            int money = sc.nextInt();
            
            for (int j=0; j<4; j++) {
                changeMoney[j] = money / change[j];
                money = money % change[j];
            }
            
            for (int k=0; k<3; k++){
                System.out.print(changeMoney[k]);
                System.out.print(" ");
            }
            System.out.println(changeMoney[3]);
        }
    }
}