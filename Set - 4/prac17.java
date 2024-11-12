public class prac17 {

    void print1() {
        System.out.println("This is parent class");
    }

    public static void main(String[] args) {
        prac17 obj1 = new prac17();
        Child obj2 = new Child();
        obj1.print1();
        obj2.print1();
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");
    }
}

class Child extends prac17 {
    void print1() {
        System.out.println("This is child class");
    }
}