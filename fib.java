
public class fib {
        public static int fibnoncacci(int number)
        {
            int fib1 = 1;
            int fib2 = 1;
            int fib =1;
            if(number == 1 || number == 2)
            {
                return 1;
                //calculate fibonacci number at a given position
            }
            
            for(int i = 3;i<=number;i++)
            {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
            
          }  return fib;
        }
        
        public static void main(String[] args)
        {
            System.out.println(fibnoncacci(10));
        }
    
}
