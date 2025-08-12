class MyEmployee
{
    // In second class if we create a private variable then it can not be axcess by other class. To access variable
    // we have to create a getter and setter.
    // it is use because user can add only phone number , no special character
    private int id;
    private String name;

    public void setId(int i)
    {
        this.id = i;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }

}

public class AccessModifier
{
    
    public static void main(String [] args)
    {
        MyEmployee obj = new MyEmployee();
        obj.setId(1221);
        obj.setName("Harshal");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        
    }
    
}
