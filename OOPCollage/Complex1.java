class Complex1
{
    private double real;
    private double imaginary;
    public Complex1()
    {
        real = 0.0;
        imaginary = 0.0;
    }

    public Complex1(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex1 add(Complex1 other)
    {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex1(newReal, newImaginary);
    }

    public Complex1 multiply(Complex1 other)
    {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real
    }

    public static void main(String args[])
    {
        
    }
}