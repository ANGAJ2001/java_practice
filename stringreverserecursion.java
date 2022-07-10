public class stringreverserecursion {
    public static void reverse(String r,int i){
    
        if(i==0)
        {
            System.out.println(r.charAt(i));
            return;
        }
        System.out.print(r.charAt(i));
        reverse(r, i-1);
        


        
    }
    public static void main(String[] args) {
        String str = "hello";
        reverse(str,str.length()-1);

    }
    
}
