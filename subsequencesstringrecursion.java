public class subsequencesstringrecursion {
    
    //very important for placements
    public static void subsequence(String str, int idx,String newString)
    {
        if(idx == str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        //first call if the charecter wants to be in the substring
        subsequence(str, idx+1, newString+currchar);
        //if the string doesnt want to be in the substring
        subsequence(str, idx+1, newString);

    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");

    }
}
