class student
{
    String name;
    static String school;
   
    
}
public class statickeyword{
    public static void main(String[] args) {
        student.school = "JMV";
        student s1 = new student();
        System.out.println(s1.name);
        System.out.println(student.school);
        
    }
}