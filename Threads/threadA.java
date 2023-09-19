package Threads;

public class threadA extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\t From Thread A i: " + i);
        }
        System.out.println("Exit from Thread A");
    }
    
}