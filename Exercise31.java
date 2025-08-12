class Cylinder
{
    public float radius;
    public float height;

    void setRadius(float r)
    {
        this.radius = r;
    }
    void setHeight(float h)
    {
        this.height = h;
    }
    float getRadius()
    {
        return radius;
    }
    float getHeight()
    {
        return height;
    }
}

public class Exercise31 
{
    public static void main(String [] args)
    {
        Cylinder c = new Cylinder();
        c.setRadius(5);
        c.setHeight(7);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
    }
    
}
