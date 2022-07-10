public class multilevelinheritance {
    public static class calculator{
        public int add(int a ,int b){
            return a+b;
        }
        public int sub(int a,int b){
            return a-b;
        }
        public int mul(int a, int b){
            return a*b;
        }
        public int div(int a , int b){
            if(b==0){
                System.out.println("divide by zero error");
                return -1;
            }
            return a/b;

        }

    }
    public static class advanced extends calculator{
        public int mod(int a , int b){
            return a%b;
        }
        
    }
    public static class area extends advanced{
        public int square(int a){
            return a*a;
        }
        public int rectangle(int a,int b){
                return a*b;
        }
    }
    public static void main(String[] args) {
        area a = new area();
        int add = a.add(10,20);
        int sub = a.sub(20,10);
        int mod = a.mod(10,20);
        int square=  a.square(10);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mod);
        System.out.println(square);
    }
    
}
