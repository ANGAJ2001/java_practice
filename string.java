import java.util.*;
public class string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //string basics
        sc.close();
        String firstName = "Anil";
        String lastName = "Prakash";
        //string concatenation
        String fullName = firstName +" " + lastName;
        System.out.println(fullName);

        //printing the size of the string
        System.out.println(fullName.length());

        //Printing the string using a for loop
        //charAt(i) -- returns the charecter of a string at location i

        for(int i = 0;i<fullName.length();i++ )
        {
            System.out.println(fullName.charAt(i));
        }


    }
    
}
