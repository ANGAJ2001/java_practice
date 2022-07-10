public class bitmanipulationclear {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        // not bitmask and (and) with number
        int number = ~bitmask & n;
        System.out.println(number);


    }
}
