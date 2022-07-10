import java.util.*;
public class startendposstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char tar = sc.next().charAt(0);
        sc.close();
        for(int i = 0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==tar)
            {
                System.out.println("start position " + i);
                break;
            }
        }
        for(int i = str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==tar)
            {
                System.out.println("End position "+ i );
                break;
            }
        }


        }
        
    }
    

