public class pattern8 {
    public static void main(String[] args){
       
            
               int n = 5;
               int r =1; 
               for(int i = 1;i<=n;i++) // floyd's triangle 
               {
                   for(int j = 1;j<=i;j++)
                   {
                       
                           System.out.print(r + " ");
                           r++;
                       
        
                   }
                   System.out.println();
               }
            }
            
        
    }
    

