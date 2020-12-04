package es.florida;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class App {

    private static ExecutorService executorService = Executors.newFixedThreadPool(42);
    public static void main(String[] args) throws IOException, InterruptedException {
        MemberCreator memberCreator = new MemberCreator();
        MemberMonitor memberMonitor = new MemberMonitor();
        MailSender mailSender = new MailSender();


        Thread memberCreatorThread = new Thread(memberCreator);
        Thread memberMonitorThread = new Thread(memberMonitor);
        Thread mailSenderThread = new Thread(mailSender);



        memberCreatorThread.start();
        memberMonitorThread.start();
        mailSenderThread.start();

        /*executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        executorService.execute(new Thread(mailSender));
        if(!executorService.awaitTermination(1, TimeUnit.SECONDS)){
            executorService.shutdownNow();*/
        }
    }

