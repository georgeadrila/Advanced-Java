package Threads;

public class thread {
    public static void main(String[] args) {
        //todo auto generated method stub
        threadA t1 = new threadA();
        threadB t2 = new threadB();
        threadC t3 = new threadC();

        // start thread A
        t1.start();
        // start thread B
        t2.start();
        // start thread C
        t3.start();
    }
}
