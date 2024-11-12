import java.util.Scanner;

public class prac24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter integer x: ");
            int x = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter integer y: ");
            int y = Integer.parseInt(scanner.nextLine());

            int d = x / y;
            System.out.println("Division " + d);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: Division by zero is not allowed.");
        } finally {
            scanner.close();
            System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");
        }
    }
}