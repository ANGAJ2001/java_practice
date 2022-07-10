import java.util.*;
public class linkedlistproblem2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i = 1;i<51;i++)
        {
            list.add(i);
        }
        System.out.println(list);

      for(int i = 0;i<list.size();i++)
      {
          int arr = list.get(i);
          if(arr>25){
          list.remove(arr);
          }
      }
      System.out.println(list);
       
    
}
}
