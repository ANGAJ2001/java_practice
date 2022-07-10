public class recursion1 {
    // recursion using function inside a function
    // function calling itself

    public static void printNumbers(int n)
    {
        // base case is important for recursion
        // recursion consumes more memory
        if(n==0){
            return;
        }

        System.out.print(n);
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);// n= 5;
        
    }

    
}
