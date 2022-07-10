class pen{
    String color;// class data eg
    String type;
    // class members ie - methods
    public void write(){
        System.out.println("writing something");
    }
    public void printColor()
    {
        // this keyword used to refer class data that is class members 
        System.out.println(this.color);
    }
}
class student{
    String name;
    int age;
    // parameterized constructor
    student(String name,int age){
      this.name = name;
      this.age = age; 

    }
    //copy constructor
    //student(student s2)
    //{
    //this.name = s2.name;
    //this.age = s2.age;
    //}
    

    
    public void printName()
    {
        System.out.println(this.name);
    }
    public void printAge()
    {
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String[] args) {
        student s1 = new student("angaj",21);
        
        s1.printName();
        s1.printAge();
    }
    
}
