public class pattern12 {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1;i<=n;i++)
        { // pyramid number
            for(int j = 0; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    
}
