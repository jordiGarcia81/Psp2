package es.florida;


import java.io.*;
import java.util.Random;

public class MemberCreator implements Runnable  {
    File file = new File("miembros.txt");


    public MemberCreator() {
    }

    @Override
    public void run() {

        while(true){
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            CrearMiembros();
        }
    }

    private String generar(){
        // Array de nombres
        // Array Apellidos
        // Escoer Nombre y apellidos aleatorio
        // Array de correo o un correo fijo.


        String currentName = ""; //Nombre Apellidos Correo
        String output = currentName;
        return "\n"+output;
    }
    public void CrearMiembros() {


        try {
            BufferedWriter fileBufferedWriter = null;
            if(file.exists()){
                fileBufferedWriter = new BufferedWriter(new FileWriter(file, true));
                fileBufferedWriter.write(generar());
            } else {
                fileBufferedWriter = new BufferedWriter(new FileWriter(file));
                fileBufferedWriter.write(generar());

            }
            fileBufferedWriter.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
