import java.util.*;

class prac12 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int c = a * 100;

        System.out.println("Currency in a rupees=" + c);

        Scanner S1 = new Scanner(System.in);
        int R = S1.nextInt();
        int P = R * 100;
        System.out.println("Currency in Rupees=" + P);
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");

        S1.close();

    }
}