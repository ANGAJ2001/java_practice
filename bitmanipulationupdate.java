import java.util.*;
public class bitmanipulationupdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        sc.close();
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int newbitmask = ~bitmask; // not of bitmask
        int number; // print value in decimal
        
        if(oper == 1)
        {
            //update bit in pos 1 to 1                              
            // similar to clear
           number =  newbitmask & n;
           System.out.println(number);

        }
        else
        {
            // update bit in pos 1 to 0
            // similar to set
            number = bitmask | n;
            System.out.println(number);
        }
        
    }
    
}
