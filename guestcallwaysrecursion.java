public class guestcallwaysrecursion {
    //advanced recursion 4
    public static int callWays(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        // single 
        int single = callWays(n-1);
        // pairs
        int pairs = (n-1) * callWays(n-2);

        return single + pairs;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callWays(n));
    }
    
}
