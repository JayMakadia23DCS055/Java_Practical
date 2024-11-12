import java.util.*;

public class prac7 {

    static void front_times(String s, int a){
        s=s.substring(0, 3);

        for(int i=0;i<a;i++){
            System.out.print(s);
        }

    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s;
        System.out.print("Enter a String(Word containing more than 3 characters) : ");
        s=ip.next();
        System.out.print("How many times you want to repeat words? : ");
        int n =ip.nextInt();
        front_times(s,n);
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");

        ip.close();

    }
}