import java.util.*;

class SurfaceArea
{
    public float r;
    public float h;
    public float surArea, volume;
    public SurfaceArea(float radius, float height)
    {
        this.r = radius;
        this.h = height;
    }

    public float calSurfaceArea()
    {
        surArea = 2 * 3.14f * r * (r + h);
        return surArea;
    }
    public float getRadius()
    {
        return r;
    }
    public float getHeight()
    {
        return h;
    }
    public float calVolume()
    {
        volume = 3.14f * r * r * h;
        return volume;
    }
}

public class Exercise32 
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a radius :");
        float radius = s.nextInt();
        System.out.println("Enter height :");
        float height = s.nextInt();
        SurfaceArea su = new SurfaceArea(radius, height);
        System.out.println("Radius is " + su.getRadius());
        System.out.println("Height is " + su.getHeight());
        System.out.println("Surface area is " + su.calSurfaceArea());
        System.out.println("Volume is " + su.calVolume());
    }
}
