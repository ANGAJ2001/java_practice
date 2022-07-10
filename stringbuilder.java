public class stringbuilder {
    public static void main(String[] args) {
        // the difference between string and stringbuilder is that in java strings are immutable 
        // stringbuilder can be used for efficient memory location
        StringBuilder sb = new StringBuilder("Tony");
        // set charecter at index 0 by replacing existing charecter
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        // insert an extra charecter or substring by specifying begining index 
        sb.insert(1, 'p');
        System.out.println(sb);
        // prints the size of the stringbuilder

        System.out.println(sb.length());
        // delete function can be used to delete a substring within a string where we specify the start index and end index where the ending index is mutually exclusive
        sb.delete(1,2);
        System.out.println(sb);
        // appending an element to a stringbuilder
        sb.append(' ');
        sb.append('T');
        sb.append('a');
        sb.append('i');
        sb.append('l');

        System.out.println(sb);
       

    
    }
    
}
