public class singleinheritance {
    public static class hello{
        public void display(){
            System.out.println("this is hello class");
        }
    }
    public static class hi extends hello{

     int a = 10;
    }
    public static void main(String[] args) {
        hi a = new hi();
        a.display();
    }

}
