package Threads;
public class threadB extends Thread {
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println("\tFrom Thread B J: " + j);
        }
        System.out.println("Exit from Thread B");
    }
}
