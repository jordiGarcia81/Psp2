package es.florida;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        MemberCreator memberCreator = new MemberCreator();
        MemberMonitor memberMonitor = new MemberMonitor();

        Thread memberCreatorThread = new Thread(memberCreator);
        Thread memberMonitorThread = new Thread(memberMonitor);

        memberCreatorThread.start();
        memberMonitorThread.start();


    }

}

