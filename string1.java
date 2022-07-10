public class string1 {
    public static void main(String[] args)
    {
        //string comparision
        String one = "Tony";
        String two = "Tony";
        //using compareTo operation
        //compareTo returns 3 values if 
        //one>two returns positive value
        //one==two returns 0 value
        //one<two returns negative value
        if(one.compareTo(two)==0)
        {
            System.out.println("the two strings are equal");
        }
        else
        {
            System.out.println("the two strings are not equal");
        }
        System.out.println("comparing the two strings using == operator ");
        {
            if(one == two)
            {
                System.out.println("the two strings are equal");
            }
            else
            {
                System.out.println("the two strings are not equal");
            }
        }
    }

    
}
