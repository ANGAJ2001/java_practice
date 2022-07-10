import java.util.*;
public class stringbuilder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        StringBuilder sb = new StringBuilder(a);
        for(int i = sb.length()-1;i>=0;i--)
        {
            System.out.print(sb.charAt(i));
        }
        System.out.println(sb.reverse());
    }
    
}
