class password{
    private int pass;
    //getter
    public int getpass()
    {
        return this.pass;
    }
    //setter
    public void setpass(int pass)
    {
        this.pass = pass;
    }
}

public class privatemodifier {
    public static void main(String[] args) {
    password p1 = new password();
    p1.setpass(1234);
    System.out.println(p1.getpass());
    
    }
    

    
}
