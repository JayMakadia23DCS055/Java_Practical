import java.util.Scanner;

class Area {
    double length;
    double breadth;

   
    Area(double l, double b) {
        length = l;
        breadth = b;
    }

    
     double returnArea() {
        return length * breadth;
    }
}

class prac15 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        Area A = new Area(length, breadth);
        System.out.println("The Area is : "+A.returnArea());
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");

        scanner.close();

    }
}