import java.util.*;
public class stringpractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        sc.close();
        for(int i = 0;i<a.length();i++)
        {
            if(a.charAt(i)=='e'){
                result+='i';
            }
            else
            {
                result += a.charAt(i);
            }
            }
            System.out.println("original string "+ a);
            System.out.println("result string "+ result);
        }

        
    }
    

