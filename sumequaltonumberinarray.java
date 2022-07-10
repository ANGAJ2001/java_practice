import java.util.*;
class sumequaltonumberinarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 5;

        for(int i = 0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==sum)
                {
                   System.out.println(a[i]+"," +a[j]);
                }
            }
            
        }
    }
}
