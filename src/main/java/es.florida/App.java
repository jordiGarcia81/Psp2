package es.florida;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        MemberCreator memberCreator = new MemberCreator();
        MemberMonitor memberMonitor = new MemberMonitor();
        MailSender mailSender = new MailSender();


        Thread memberCreatorThread = new Thread(memberCreator);
        Thread memberMonitorThread = new Thread(memberMonitor);
        Thread mailSenderThread = new Thread(mailSender);

        memberCreatorThread.start();
        memberMonitorThread.start();
        mailSenderThread.start();
    }
}
