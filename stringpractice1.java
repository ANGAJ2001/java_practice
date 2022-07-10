import java.util.*;
public class stringpractice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.next();

        }
        sc.close();
        for(int i = 0;i<size;i++){
            sum = sum + arr[i].length();


        }
        System.out.println(sum);
    }
    
}
