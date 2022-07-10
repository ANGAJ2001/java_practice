public class backtracking1 {
    public static void backtrack(String str,String permutation,int idx)
    {
    if(str.length()==0)
    {
        System.out.println(permutation);
        return;
    }
    for(int i = 0;i<str.length();i++)
    {
        char currchar = str.charAt(i);
        String newstr = str.substring(0,i)+str.substring(i+1);
        backtrack(newstr,permutation+currchar,idx+1);

    }
    
}
public static void main(String[] args) {
    String str = "ABC";
    backtrack(str,"",0);
}
}