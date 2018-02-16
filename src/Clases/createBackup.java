
package Clases;



 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
 
/**
 *
 * @author Farid
 */
public class createBackup {
 
    public createBackup() {
    }
 
    public void crear(String user, String pass, String database) {
 
        // configuracion de la fecha actual 
        Calendar c = Calendar.getInstance();
        String fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
        fecha = fecha + "." + String.valueOf(c.get(Calendar.HOUR_OF_DAY));
        fecha = fecha + "." + String.valueOf(c.get(Calendar.MINUTE));
        fecha = fecha + "." + String.valueOf(c.get(Calendar.SECOND));
               
        // clase Runtime para lanzar DOS
        Runtime runtime = Runtime.getRuntime();
        //se prepara File para con la ruta
        File backup = new File("src/backup");
        // se crea la ruta, si no existe crea la ruta completa
        backup.mkdirs();
        //preparamos el backupfile con la ruta
        //y el archivo sql que tendra la fecha y hora de creacion
        File backupFile = new File("src/backup/backup" + "_" + fecha + ".sql");
         
        try {
             
            InputStreamReader irs;
            BufferedReader br;
            //preparamos el filewrite para guardar el backup
            FileWriter filewrite = new FileWriter(backupFile);
            //ruta donde se encuntra mysqldump
          String patch = "C:\\wamp\\bin\\mysql\\mysql5.6.12\\bin\\";
          //  String patch = "C:\\Program Files\\MySQL\\MySQL Server 5.5\\bin\\";
            //C:\xampp\mysql\data
           
            
            //se lanza el DOS
            Process child = runtime.exec(patch
                    + "mysqldump "
                    + " --opt "
                    + " --user=" + user
                    + " --password=" + pass
                    + " --databases " + database + " -R");
             
            /* Se obtiene el stream de salida del programa */
            irs = new InputStreamReader(child.getInputStream());
            /* Se prepara un BufferedReader para poder leer la salida más comodamente. */
            br = new BufferedReader(irs);
             
            String line;
            //mientras exista una linea
            while ((line = br.readLine()) != null) {
                filewrite.write(line + "\n");
            }
            // terminamos los servicios
            irs.close();
            br.close();
             
        } catch (IOException e) {
            System.out.println("Error.. No se realizo el backup!");
        }
    }
 
    /*public static void main(String[] args) {
        new createBackup().crear("root", "", "hibernate1");
    }*/
 
}