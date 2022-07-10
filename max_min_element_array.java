import java.util.*;
public class max_min_element_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[5];
        for(int i = 0;i<m.length;i++)
        {
            m[i] = sc.nextInt();

        }
        sc.close();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<m.length;i++)
        {
            if(m[i]<min){
                min = m[i];
            }
            if(m[i]>max)
            {
                max = m[i];
            }
            }
            System.out.println("max element is "+ max);
            System.out.println("min element is "+ min);
        }
       
    }
    

