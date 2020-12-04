package es.florida;


import org.apache.commons.mail.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;


public class MailSender implements Runnable {
    public static final int MAXIMUM_THREADS = 40;
    File file = new File("miembros.txt");
    //bloquear y desbloquear antes y despues del envio de correo
    private String ultimoCorreo;
    public MailSender(String ultimoCorreo) {
        this.ultimoCorreo=ultimoCorreo;
    }

    public MailSender(){

    }

    @Override
    public void run() {
        FileReader fr = null;
        BufferedReader br = null;
        String linea;
        LinkedList<String> objectMail = new LinkedList<>();

        Email email = new SimpleEmail();




        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null){
                /*objectMail= new ObjectMail();
                String arrSplit = arrObj.split(" ");
                ObjectMail.Add(arrSplit);*/
            }
            fr.close();
            br.close();

            email.setHostName("localHost");
            email.setHostName("jordiGarcia@gmail.com");
            email.setSmtpPort(1025);
            email.addTo(ultimoCorreo);
            email.setSubject("nuevo miembro");
            email.setMsg("El nuevo miembro es: "+ultimoCorreo);
            email.addTo(objectMail);
            email.send();
            //Enviar los correos Práctica 2 ----- thread enviar email

            String threadEmail = Thread.currentThread().getName();







        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }
}

