interface animal{
    int age = 2;
    public void walk();
    
}
interface herbivore{

}
// multiple inheritance 
class Horse implements animal,herbivore{
    public void walk(){
        System.out.println("horse is walking");
    }
}


public class interfaces {
    
}
