import java.util.*;
public class Linkedlistusingcollection {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.addFirst("a");
        l1.addFirst("is");
        System.out.println(l1);
        l1.addLast("linked list");
        System.out.println(l1);
        l1.addFirst("this");
        System.out.println(l1);
        l1.add("hello");
        //if we use add function by default element is added at the end
        System.out.println(l1);
        // to get the size of linked list we use .size() function
        System.out.println(l1.size());
        for(int i = 0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+"-->");
        }
        System.out.print("null");
        System.out.println();
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
        //remove an element at a particular index use list.remove(index)
        l1.remove(0);
        System.out.println(l1);


        
    }
    
}
