import java.util.ArrayList;


public class subsetoffirstnnaturalno {
    public static void printsubset(ArrayList<Integer> subset)
{
    for(int i = 0;i<subset.size();i++)
    {
        System.out.print(subset.get(i)+" ");

    }
    System.out.println();

}
    public static void findSubsets(int n,ArrayList<Integer> subset ){
        //number wants to be in the subset
        if(n==0)
        {
            printsubset(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1, subset);

        //does not want to be added
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    

public static void main(String[] args) {
    ArrayList<Integer> subset = new ArrayList<>();
    int n = 3;
    findSubsets(n, subset);
}
}
