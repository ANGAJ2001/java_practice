import java.util.*;
public class numberpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbr = sb.reverse();
        String rev =sbr.toString();
        if(str.equals(rev))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }

        
        
    }
    
}
