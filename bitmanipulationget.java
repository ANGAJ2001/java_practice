public class bitmanipulationget {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitmask = 1<<pos;
        // and bitmask and number
        if((bitmask & n)==0)
        {
            System.out.print("bit was zero");
            
        }
        else{
            System.out.println("bit was one");
        }
    }
    
}
