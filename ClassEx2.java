class display
{
    int age ;
    String name ;
    void value()
    {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ClassEx2 
{
        // it static is not written in front of second method then we have to create a obj by using that we have to call
        // if static is written then we call it without creating object
        // Static method sa static method ko directly call karu shakto
        // The static method display() from the type ClassEx2 should be accessed in a static way
        // Sratic method is shared by all obj due to that it called directly
        // In one file, only one class is public if you try to make more then it will give an error
        

        public static void main(String [] args)
        {
            display obj = new display();

            obj.age = 10;
            obj.name = "Harshal";
            obj.value();
        }

}
