import java.util.*;
public class spiralorder{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<row;j++){
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int row_start = 0;
        int row_end = row-1;
        int col_start = 0;
        int col_end = col-1;
        while(row_start<=row_end && col_start<=col_end){
            for(int i = col_start;i<=col_end;i++)
            {
                System.out.print(a[row_start][i]+ " ");
            }
            row_start++;
            for(int i = row_start;i<=row_end;i++)
            {
                System.out.print(a[i][col_end]+ " ");
            }
            col_end--;
            for(int i = col_end;i>=col_start;i--)
            {
                System.out.print(a[row_end][i] + " ");
            }
            row_end--;
            for(int i = row_end;i>=row_start;i--)// great going
            {
                System.out.print(a[i][col_start] + " ");
            }
            col_start++;
            

        }

    }
}