public class xpowernrecursionlogn {
    public static int calcpower(int x,int n)
    {
        if(n==0){
            return 1;
        }
        if(x ==0){
            return 0;
        }
        if(n%2==0) // n is even
        {
            return calcpower(x, n/2)*calcpower(x, n/2);
        }
        else{
            return calcpower(x, n/2)*calcpower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
    
    
}
