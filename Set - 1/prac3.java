import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        float distance;
        int hr, min, sec;

        System.out.print("Enter The Distance(in meter) : ");
        Scanner s = new Scanner(System.in);
        distance = s.nextFloat();
        float km = distance / 1000;
        float miles = distance / 1609;

        System.out.println("Enter The time(in hr,min,sec)");
        hr = s.nextInt();
        min = s.nextInt();
        sec = s.nextInt();

        float timeInSec = (hr * 3600) + (min * 60) + (sec);
        float timeInHr = hr + ((float) min / 60) + ((float) sec / 3600);

        float speed1 = distance / timeInSec;
        float speed2 = km / timeInHr;
        float speed3 = miles / timeInHr;

        System.out.println("Your speed is : " + speed1 + " m/s");
        System.out.println("Your speed is : " + speed2 + " km/hr");
        System.out.println("Your speed is : " + speed3 + " mi/hr");
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");

        s.close();

    }
}