// using Thread class
class prac32Thread extends Thread {
    public void run() {
        System.out.println("Hello World");
        
    }

    public static void main(String[] args) {
        prac32Thread thread = new prac32Thread();
        thread.start();
    }
}

// using Runnable interface
class prac32 implements Runnable {
    public void run() {
        System.out.println("Hello World");
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new prac32());
        thread.start();
    }
}