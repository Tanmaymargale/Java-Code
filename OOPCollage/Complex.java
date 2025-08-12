public class Complex {
    double real;
    double imaginary;

    // Default constructor
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Parameterized constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getters and setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    // Method to divide two complex numbers
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        // Creating two complex numbers
        Complex complex1 = new Complex(3.0, 4.0);
        Complex complex2 = new Complex(1.5, 2.5);

        // Performing arithmetic operations
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        Complex quotient = complex1.divide(complex2);

        // Displaying the results
        System.out.println("Sum:");
        sum.display();

        System.out.println("\nDifference:");
        difference.display();

        System.out.println("\nProduct:");
        product.display();

        System.out.println("\nQuotient:");
        quotient.display();
    }
}

