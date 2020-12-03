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
        String[] nombres={"Jordi","Juan","Carlos","Jesus","Damia","Pablo","Rafa","Noe","Cristian","Raquel","Cristina","Javier","Enrique"};
        String[] apellidos={"Garcia","Romero","Simon","Perez","Ruiz","Navarro","Gonzalez","Rodriguez","Martinez","Martin","Moreno","Alonso"};
        String correo="testmailprueba2@gmail.com";
        Random random=new Random();
        int posNombre=random.nextInt(nombres.length);
        int posApellido=random.nextInt(apellidos.length);



        String currentName = "Enviando correo a: "+nombres[posNombre]+" "+apellidos[posApellido]+" "+correo;
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
