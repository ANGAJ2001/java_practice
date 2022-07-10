import java.util.*;
public class stringpractice3alt {
   
 

   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     String email = sc.next();
     sc.close();
     String userName = "";
 
     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }
 
     System.out.println(userName);
   }
}


