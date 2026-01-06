import java.util.HashMap;
import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        HashMap<Integer, String> numberMap = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();

        for (int i=1; i<=N; i++) {
            String name = sc.nextLine();
            numberMap.put(i, name);
            nameMap.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            String quiz = sc.nextLine();
            if (quiz.charAt(0) < 'A' || quiz.charAt(0) > 'z') {
                sb.append(numberMap.get(Integer.parseInt(quiz))).append("\n");
            } else {
                sb.append(nameMap.get(quiz)).append("\n");
            }
        }

        System.out.println(sb.toString());



    }
}