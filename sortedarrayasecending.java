import java.util.*;
public class sortedarrayasecending {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Boolean isAscending = true;
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
                isAscending = false;
        }
        System.out.println("the array is sorted: " + isAscending);
    }
    
}
