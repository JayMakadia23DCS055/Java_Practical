import java.util.*;

public class prac16 {

    private double real;
    private double imaginary;

    public prac16 () {
    }

    public prac16 (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static prac16  getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new prac16 (real, imaginary);
    }

    public prac16 add(prac16 other) {
        return new prac16(real + other.real, imaginary + other.imaginary);
    }

    public prac16 subtract(prac16 other) {
        return new prac16(real - other.real, imaginary - other.imaginary);
    }

    public prac16 multiply(prac16 other) {
        double newReal = (real * other.real) - (imaginary * other.imaginary);
        double newImaginary = (real * other.imaginary) + (imaginary * other.real);
        return new prac16(newReal, newImaginary);
    }

    
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public static void main(String[] args) {
        System.out.println("Enter first complex number:");
        prac16 number1 = getInput();
        System.out.println("Enter second complex number:");
        prac16 number2 = getInput();

        prac16 sum = number1.add(number2);
        prac16 difference = number1.subtract(number2);
        prac16 product = number1.multiply(number2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");

    }
}