import java.util.*;
public class bit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int pos = 2;
        int bitmask = 1<<pos;
        int number;
        int newbitmask = ~bitmask;
        if((bitmask & n) ==0)
        {
            
            number = newbitmask & n;
            System.out.println(number);
        }
        else
        {
            number = bitmask | n;
            System.out.println(number);
        }
        
    
}
    
}
