package Collections.linkedlist;

import java.util.*;
public class linkedList {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      LinkedList<Integer> list= new LinkedList<>();
      int n= sc.nextInt();
      for(int i=0;i<n;i++){
          list.add(sc.nextInt());
      }
      int q=sc.nextInt();
      for(int i=0;i<q;i++){
          String Query=sc.next();
          if(Query.equals("Insert")){
              int x,y;
              x=sc.nextInt();
              y=sc.nextInt();
              list.add(x,y);
          }
          else if(Query.equals("Delete")){
              int d=sc.nextInt();
              list.remove(d);
          }
      }
      for(int i=0;i<list.size();i++){
          System.out.print(list.get(i)+" ");
      }
    }
}
