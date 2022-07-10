public class xpowern {

        public static int power(int x,int n){
            int p = x;
            if(n == 0){
                return 1;}
            else if(n==1){
                return x;
            }
            else{
            for(int i = 2;i<=n;i++){
                p*=x;
            }
            return p;
        }
        }
        public static void main(String[] args){
            System.out.println(power(4,3));
        }
    }
    

