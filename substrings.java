public class substrings {
    public static void main(String[] args)
    {
        String a = "angaj anil prakash";
        // lets print the substring prakash now
        // to retrieve the substring we use the function substring
        String sub = a.substring(11,18);
        // as we see we are required to enter two parameters one is the begining index and the other ending index if we dont enter
        // the ending index the function will by default take is as the length of the string
        // we should make sure that we specify the ending index by + 1 as substring function returns the value from begining index to ending index -1
        int b = a.length();
        System.out.println(b);
        System.out.print(sub);
        // strings are immutable they cannot be deleted once created they cannot be modified.

    }
    
}
