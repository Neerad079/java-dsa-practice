package Collections.maps;
import java.util.*;
public class hashsets {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> pairs = new HashSet<>();

        int t= sc.nextInt();
        // sc.nextLine();
        String[] pair_left=new String[t];
        String[] pair_right=new String[t];
        for(int i=0;i<t;i++){
            pair_left[i]=sc.next();
            pair_right[i]=sc.next();
        }



        for(int i=0;i<t;i++){

            String p = pair_left[i] + " " + pair_right[i];
            pairs.add(p);
            System.out.println(pairs.size());

        }



    }
}
