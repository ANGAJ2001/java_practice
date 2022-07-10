import java.util.*;
public class linkedlistproblem1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        int arr[] = {1,5,7,3,8,2,3};
        for(int i = 0;i<arr.length;i++)
        {
            l1.add(arr[i]);
        }
        for(int i = 0;i<l1.size();i++)
        {
            if(l1.get(i)==7)
            {
                System.out.println(i);
            }
        }
    }
    
}
