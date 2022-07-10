import java.util.*;
public class switchcase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        char button = sc.next().charAt(0);
        
        
        switch(button)
        {
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                System.out.print(a/b);
                break;
            default:
                System.out.println("enter a valid operator");
                
        }
        sc.close();

    }
    
}
