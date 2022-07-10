import java.util.*;
public class pirme {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int i;
    sc.close();
    boolean flag = false;
    for( i = 2;i<=a/2;i++)
    {
        if(a%i==0)
        {
            flag = true;
            break;
        }
     
    }
    if(!flag){
        System.out.print(a + " is a prime number");
    }
    else{
        System.out.println("not a prime number");
    }
    
    }
    
}
