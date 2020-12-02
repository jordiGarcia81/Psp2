package es.florida;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public  static void main(String[]args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(new ChildTask());
        executorService.execute(new ChildTask());
        executorService.execute(new ChildTask());
        executorService.execute(new ChildTask());
        executorService.execute(new ChildTask());
        executorService.shutdown();

        if(!executorService.awaitTermination(2, TimeUnit.SECONDS)){
           executorService.shutdownNow() ;
        }

        /*Thread thread1 = new Thread(new ChildTask());
        Thread thread2 = new Thread(new ChildTask());
        Thread thread3 = new Thread(new ChildTask());

        thread1.start();
        thread2.start();
        thread3.start();*/
    }

}
