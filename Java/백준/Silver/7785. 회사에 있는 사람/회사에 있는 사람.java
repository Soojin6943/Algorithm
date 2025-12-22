import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Set;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        HashMap<String, String> map = new HashMap<>();
        List<String> leaveList = new ArrayList<>();
        
        for (int i=0; i<n; i++){
            String name = sc.next();
            String work = sc.next();
            
            map.put(name, work);
        }
        
        for (String nameSet : map.keySet()) {
            String workState = map.get(nameSet);
            
            if (workState.equals("enter")){
                leaveList.add(nameSet);
            }
        }
        sc.close();
        
        Collections.sort(leaveList, Collections.reverseOrder());
        
        for (String str : leaveList){
            System.out.println(str);
        }
    }
}