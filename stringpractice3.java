import java.util.*;
public class stringpractice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        String email = sc.nextLine();
        sc.close();
        String username = "";
                                                            //
        
        for(int i = 0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                username = email.substring(0, i);
            }
        }
        System.out.println("email: "+ email);
        System.out.println("username: "+ username);
    }
    
}
