import java.util.HashSet;

import javax.naming.ldap.ManageReferralControl;
public class uniquesubsequencesrecursion {
    public static void uniquesubsequence(String str, int idx ,String newString ,HashSet<String> set )
    {
        if(idx == str.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar = str.charAt(idx);
        
        uniquesubsequence(str, idx+1, newString+currchar, set);

        uniquesubsequence(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniquesubsequence(str, 0, "", set);
    }
    
}
