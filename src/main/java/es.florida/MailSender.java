package es.florida;


import org.apache.commons.mail.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class MailSender implements Runnable {
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
        //Array de objetos ObjectMail

        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null){
                //Crear objeto
                //Split de linea
                //Añadir a la lista de Objetos ADD
            }
            fr.close();
            br.close();

            //Enviar los correos Práctica 2 ----- thread enviar email









        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

