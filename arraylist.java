import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // add elements .add() method
        arr.add(0);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        //to get an element at a specified index we use the get method
        int element = arr.get(0);
        System.out.println(element);
        //to add an element at a specified index we use the add method where we pass 2 parameters one is the index and other an element
        arr.add(1,1);
        System.out.println(arr);
        //set element a specified index or change element at a specified index
        arr.set(0, 5);
        System.out.println(arr);
        //delete element we use the remove function
        arr.remove(3);
        System.out.println(arr);
        //size of arraylist arr.size();
        System.out.println(arr.size());
        for(int i = 0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");

        }
        System.out.println();
        //sorting in arraylist we use the Collections.sort()
        Collections.sort(arr);
        System.out.println(arr);



        
    }
}
  

