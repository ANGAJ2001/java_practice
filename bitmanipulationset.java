public class bitmanipulationset {
    public static void main(String[] args) {
        int n = 5;//0101
        int pos = 1;
        int bitmask = 1<<pos;
        //or bitmask and number
        int newNumber = bitmask | n;
        System.out.println(newNumber);

    }
    
}
