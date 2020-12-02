package es.florida;

public class ChildTask implements Runnable {
    public void run() {
        System.out.println("Hello from thread"+Thread.currentThread().getName());
    }
}
