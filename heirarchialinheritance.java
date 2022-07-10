public class heirarchialinheritance {
    public static class A{
        public void hello(){
            System.out.println("hello");
        }
    }
    public static class B extends A{
        int a = 9;
    }
    public static class C extends A{
        int a = 9;
    }
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        obj.hello();
        obj1.hello();
        System.out.println(obj.a);
        System.out.println(obj1.a);
        
        
    }
}
