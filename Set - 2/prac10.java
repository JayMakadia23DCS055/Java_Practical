import java.util.*;

    public class prac10 {

        public static String reverse(String s){
            String str3="";
            for(int i=s.length()-1;i>=0;i--){
                str3=str3+s.charAt(i);
            }
            return str3;
        }

        public static String sort(String s){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }

        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            String s;
            System.out.print("Enter a String : ");
            s=ip.next();
            System.out.print("Length  : "+s.length()+"\n");
            System.out.print("Upper case : "+s.toUpperCase()+"\n");
            System.out.print("Lower case : "+s.toLowerCase()+"\n");
            System.out.print("Reverse : "+reverse(s)+"\n");
            System.out.print("Sort : "+sort(s)+"\n");
            System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");

            ip.close();
        }
    }