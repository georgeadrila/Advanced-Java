package Threads;

public class threadC extends Thread {
    public void run() {
        for (int k = 0; k < 5; k++) {
            System.out.println("\tFrom Thread C k: " + k);
        }
        System.out.println("Exit from Thread C");
    }
}
