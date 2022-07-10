
public class factorial {
    public static void fact(int a){
        if(a<0){
            System.out.println("invalid number");
            return;
        }
        int fact = 1;
        for(int i = 1;i<=a;i++)
        {
             fact = fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args){
        fact(6);



    }

    }
    

