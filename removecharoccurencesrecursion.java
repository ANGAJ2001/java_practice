public class removecharoccurencesrecursion {
    public static boolean[] map = new boolean[26];
    public static void removeOccurenes(String str,int idx,String newStr)
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true)
        {
            removeOccurenes(str, idx+1, newStr);
        }
        else
        {
            newStr+=currchar;
            map[currchar-'a']=true;
            removeOccurenes(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "angaj";
        removeOccurenes(str, 0, "");

    }
    
}
