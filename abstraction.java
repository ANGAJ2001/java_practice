abstract class animals{
    abstract void walk();
    animals()
    {
        System.out.println("you are creating a new animal");
    }

}
class horse extends animals
{
    public void walk(){
        System.out.print("Walks on 4 legs");
    
}
}
class chicken extends animals{
public void walk(){
    System.out.println("Walks on 2 legs");
}
}
public class abstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
       
        ;
    }
    
}
