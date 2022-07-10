public class moveallxtoendrecursion {
    public static void movex(String str,int idx,int count,String newString){
        if(idx == str.length())
        {
            for(int i = 1;i<=count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar=='x')
        {
            count++;
            movex(str, idx+1, count, newString);
        }
        else
        {
            newString+=currchar;
            movex(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "xxxxabababa";
        movex(str, 0, 0, "");
    }
    
}
