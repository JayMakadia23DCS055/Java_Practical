import java.util.Scanner;

public class prac2{
    public static void main(String[] args) {
        int balance=20,no;

        System.out.print("Enter your account number : ");
        Scanner s = new Scanner(System.in);
        no =s.nextInt();

        if(no==6)

    {
        System.out.print("Your curent balance is : "+ balance+"$");

    }
        else {System.out.print("Enter valid account number");}

        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");

        s.close();
    }
          
}