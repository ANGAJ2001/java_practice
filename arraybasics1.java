import java.util.*;
public class arraybasics1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        int marks[] = new int[size];
        for(int i = 0;i<size;i++)
        {
            System.out.println(marks[i]);
        }
    }
    
}
