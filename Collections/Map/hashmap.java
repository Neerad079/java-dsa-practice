package Collections.Map;
import java.util.*;
public class hashmap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Long> map= new HashMap<>();
        int n= sc.nextInt();// to read the number of entries in phone book
        sc.nextLine();  // same context
        for(int i=0;i<n;i++){
            String name= sc.nextLine();
            long phone = sc.nextLong();
            sc.nextLine();
            /* to read the empty line after pressing enter as nextInt() does not include next line
             if we don't add this line then after hitting enter after the first integer input a new empty line is created
            and the nextLine() read that empty line instead of the actual String input so that's why this line is imp.
            */
            map.put(name,phone);
        }
        while(sc.hasNext()){
            String s= sc.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
