public class stackheightrecursion {
    public static int powern(int x ,int n ){
    if(n==0)
    {
        return 1;
    }
    if(x == 0)
    {
        return 0;
    }
    

   int p =  powern(x,n-1);
   int pn = x*p;
   return pn;
}
public static void main(String[] args) {
    int x = 9;
    int n = 2;
    int ans = powern(x, n);
    System.out.println(ans);
}
}

