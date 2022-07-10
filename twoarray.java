
public class twoarray {
    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        // declaration
        
        int arr[][] = new int[row][col];
        
        for(int i = 0;i<row;i++)
            {
                for(int j = 0;j<col;j++)
                    arr[i][j] = 0;

            }
            for(int i = 0;i<row;i++)
            {
                for(int j = 0;j<col;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
            
            
            
    }
    
}
