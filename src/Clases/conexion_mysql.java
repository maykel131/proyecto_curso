
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion_mysql {
    public ResultSet result;
    public Statement stm;
    public String db = "curso_unefa";
    public String url = "jdbc:mysql://127.0.0.1/"+db;
    public String user = "root";
    public String pass = "";
    public String sent;
    public Connection con;
    public Connection link= null;
    
    //public m_BD(){}
    public Connection Conectar(){
        try{
            //carga el driver MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            //se crea enlace hacia la base de datos,
            link= DriverManager.getConnection(url, user, pass);
            stm= link.createStatement();
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
    
    public void Desconectar(){
        try {
            this.link.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion_mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    
    
    
    
    public void execBackup()
        {
                JOptionPane.showMessageDialog(null, "Colocar la extencion .sql seguida del nombre del backup", "Atención",JOptionPane.INFORMATION_MESSAGE);
                     
                try{
                        String pathFile = "";
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setApproveButtonText("Guardar Backup de la Base de datos");
                        FileNameExtensionFilter filter =  new FileNameExtensionFilter("Archivos sql", "sql");
                        fileChooser.addChoosableFileFilter(filter);
                        fileChooser.showSaveDialog(null);
                        File fileDB = fileChooser.getSelectedFile();
                        String PATH = fileDB.getAbsolutePath();
 
                        Runtime runtime = Runtime.getRuntime();
 
       */                 /*backupFile se utiliza para indicarle la ubicacion y nombre del archivo que contendra el backup con la extencion .sql*/
   //                     String pathDB = "\"C:\\Program Files\\MySQL\\MySQL Server 5.2\\bin\\mysqldump.exe\" -uroot -proot TuBD -r "+ PATH;

 //                       Process child = runtime.exec(pathDB); 
                        //Process es el que ejecuta el comando para buscar el mysqldump.exe
 
  //                                      JOptionPane.showMessageDialog(null, "Archivo generado", "Verificar",JOptionPane.INFORMATION_MESSAGE);
    //            }catch(Exception e){
  //                      e.printStackTrace();
  //                      JOptionPane.showMessageDialog(null, "Error no se genero el archivo por el siguiente motivo: " + e.getMessage(), "Verificar",JOptionPane.ERROR_MESSAGE);
   //             }
 
  //      }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
