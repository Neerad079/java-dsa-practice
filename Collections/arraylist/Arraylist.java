/*
You are given n lines.
 In each line there are zero or more integers.
 You need to answer a few queries where you need to tell the number located in yth position of xth line

Platform : HackerRank

*/





package Collections.arraylist;
import java.util.*;
public class Arraylist {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // Creating an ArrayList of an ArrayList
        // so that all the xth lines becomes individual list inside a list
        // from where we can access the number located at the yth position of the xth list

        ArrayList<ArrayList<Integer>> l= new ArrayList<>();
        int s=sc.nextInt(); // to read the first line
        for(int i=0;i<s;i++){
            int si= sc.nextInt(); // to read the 2nd line's first number

            ArrayList<Integer> l1 = new ArrayList<>();
            for(int j=0;j<si;j++){
                l1.add(sc.nextInt());  // to add all the elements in the Arraylist
            }
            l.add(i,l1);
        }
        int q= sc.nextInt(); // to read queries

        for(int i=0;i<q;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            ArrayList<Integer> a = l.get(x-1);  // this will get the xth line from which we will get the number at yth pos

            if(y>0 && y<=a.size()){
                System.out.println(a.get(y-1)); // here we will get the number at the yth position in the xth list
            }
            else{
                System.out.println("ERROR!");

            }
        }
        sc.close();

    }

}

