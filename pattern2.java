import java.util.*;

public class pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int m = sc.nextInt();
        int n = sc.nextInt();
        for ( i=1;i<=m;i++)
        {
            for(j = 1;j<=n;j++)
            {
                if(i == 1 || j ==1 || i == m || j == n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    
    
}
