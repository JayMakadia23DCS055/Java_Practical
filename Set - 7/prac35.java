class prac35 {
    public static void main(String[] args) {
        IncrementThread incrementThread = new IncrementThread();
        incrementThread.start();
    }
}

class IncrementThread extends Thread {
    private int value = 0;

    public void run() {
        try {
            System.out.println("Value before increment: " + value);
            Thread.sleep(1000);
            value++;
            System.out.println("Value after increment: " + value);
            System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}