class ConstEx
{
    // no need to write data type and return 
    // name as that of class
    // it is use to assign a values to a variable
    // We can pass parameter in the constructor 
    // we can create more than one Constructor
    // Method Overloaading :- when a method has same name but different no. of parameter or different data types of parameter.
    public int age;
    public String name;

    public ConstEx()
    {
        age = 13;
        name = "Rohit";  
    }

    public ConstEx(int myId , String myName)
    {
        age = myId;
        name = myName;
    }

    public int getValue()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}

public class Constructor 
{
    public static void main(String [] args)
    {
        ConstEx harsh = new ConstEx();
        System.out.println(harsh.getValue());
        System.out.println(harsh.getName());
    }
    
}
