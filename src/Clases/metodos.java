package Clases;

import Ventanas.inicio;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class metodos {
    ResultSet id = null ,bita;
    PreparedStatement consulta;
     ResultSet datos;
    public static Connection miconeccion,conex; 
    conexion_mysql bd=new conexion_mysql();
   int  auxiliar;
    
    
    
    //Metodos global
      public ResultSet consult_persona(String tabla, int cedula){
        ResultSet id = null ;
        bd.Conectar();
        String consult="SELECT * FROM "+tabla+" WHERE identification = '"+cedula+"'";
        try {
            bd.result= bd.stm.executeQuery(consult);
            if(bd.result.next()){
                 id= bd.result;//.getInt("id_login");
                System.out.println(" ta hacieendoo: "+bd.result.getInt("Id_person"));    
               seTauxiliar(bd.result.getInt("Id_person"));
            }else{
             //   id=null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        return id;
    }
      
      
      public void  seTauxiliar(int a){
      auxiliar=a;
      }
      
      public int  geTauxiliar(){
      return auxiliar;
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
     //Metodo de acceso login
     public ResultSet consult_user(String us, String ps){
        ResultSet id = null;
        bd.Conectar();
        String consult="SELECT id_login,type_user FROM login WHERE user='"+us+"'AND password = '"+ps+"'";
        try {
            bd.result= bd.stm.executeQuery(consult);
            if(bd.result.next()){
                 id= bd.result;//.getInt("id_login");
            }else{
                id=null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }
      
    
    //Metodos para todos

    
     public ResultSet consult_docente(int id_persona,String tabla){
        ResultSet id = null;
        bd.Conectar();
        String consult="SELECT "+tabla+".*,cursos.* FROM "+tabla+" INNER JOIN cursos ON("+tabla+".id_curse=cursos.id_curse) WHERE id_person="+id_persona;
        try {
            bd.result= bd.stm.executeQuery(consult);
            if(bd.result.next()){
                 id= bd.result;//.getInt("id_login");
                 bitacora(id_persona,"CONSULTADO");
            }else{
                id=null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }

     
     
     
     
 public void insertar(String tabla,int a,String b,String c,int d,String e,String f,String g,String h,String i,String st,int carnet,int curso,int tipo) throws SQLException{
    
     
    
     //al insertar se haran inserciones en 3 tablas (persona, docente o estudiantes,login)
      
      
       int aux=0;
       int bandera =0; 
    miconeccion=(Connection) this.bd.Conectar();

   
    try {
        PreparedStatement pst = miconeccion.prepareStatement("INSERT INTO persona (identification,name,last_name,age,genere,email,address,cellphone,phone_fixed,status,tipo_usuario) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
     
        pst.setInt(1,a);
        pst.setString(2,b);
        pst.setString(3,c);
        pst.setInt(4,d);
        pst.setString(5,e);
        pst.setString(6,f);
        pst.setString(7,g);
        pst.setString(8,h);
        pst.setString(9,i);
        pst.setString(10,st);
        pst.setInt(11,tipo);
    
      
        pst.executeUpdate();
     
    
     //   JOptionPane.showMessageDialog(null,"Se hizo el Registro Correctamente");
        bandera ++;
    } catch (SQLException | HeadlessException et) {
        
     
      System.out.print(et.getMessage());  
         
        String hy="Duplicate entry '"+a+"' for key 'identification'";
        String n=et.getMessage();
    if(hy.equals(n)){
    JOptionPane.showMessageDialog(null,"Esa Cedula ya esta registrada..... ",null,3);
    
    }else{ JOptionPane.showMessageDialog(null,"NO SE PUDO HACER EL REGISTRO: "+et,null,3);}
    }
     
   this.bd.Desconectar();
    
  if (bandera ==1){
      
      bd.Conectar();
      
      // consulta del id persona para luego hacer registro en docente y login
 
         ResultSet id = null;
        bd.Conectar();
        String consult="SELECT * FROM persona WHERE  identification = "+a;
        try {
            bd.result= bd.stm.executeQuery(consult);
            if(bd.result.next()){
              //   id= bd.result;//.getInt("id_login");
                aux= bd.result.getInt("Id_person");
                bandera++;
       //          JOptionPane.showMessageDialog(null,"este es el id persona" +aux);
                 bitacora(aux,"INSERTADO");
            }else{
                id=null;
            }
        } catch (SQLException kk) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, kk);
             JOptionPane.showMessageDialog(null,"pana no hace la consulta por esto: " +kk);
        }
        
        
   
 
 if(bandera==2){

   // insetar en la tabla docente luego q se obtiene el id persona
        
      try {
           PreparedStatement pstt = bd.link.prepareStatement("INSERT INTO "+tabla+" (id_person,id_curse,num_carnet) VALUES (?,?,?)");
     
           pstt.setInt(1,aux);
           pstt.setInt(2,curso);
           pstt.setInt(3,carnet);
           pstt.executeUpdate();
     
           bandera++;
     //     JOptionPane.showMessageDialog(null,"Se hizo el Registro Correctamente el registro en la tabla docente");
       
          } catch (SQLException | HeadlessException t) {
 //       JOptionPane.showMessageDialog(null,"NO SE PUDO HACER EL REGISTRO en la tabla docente "+t,null,3);
         }
 }
    
    // insetar en la tabla login  
 
  if(bandera==3){
      try {
           PreparedStatement pst =bd.link.prepareStatement("INSERT INTO login (id_person,user,password,type_user) VALUES (?,?,?,?)");
     
           pst.setInt(1,aux);
           pst.setString(2,Integer.toString(a));
           pst.setString(3,Integer.toString(a));
           pst.setInt(4,tipo);
           pst.executeUpdate();
     
    
         JOptionPane.showMessageDialog(null,"Se hizo el Registro Correctamente el registro Correctamente :)");
       
          } catch (SQLException | HeadlessException tx) {
     //    JOptionPane.showMessageDialog(null,"NO SE PUDO HACER EL REGISTRO en la tabla login "+tx,null,3);
         }
      
      
  }   
      
      
   
    
    
   }// fin de la consulta y del if 
    
 }//fin del insertar
 
 
 
 
 
 
 
 
 
  public void modificar(String tabla,int idd,int a,String b,String c,int d,String e,String f,String g,String h,String i,String st,int carnet,int curso,int tipo) throws SQLException{
  
  
  int realizo =0;
  
  
  
    Connection miconeccion = null;
    
    try {
    
         miconeccion=(Connection) this.bd.Conectar();
        
        String Ssql = "UPDATE persona SET identification=?,name=?,last_name=?,age=?,genere=?,email=?,address=?,cellphone=?,phone_fixed=?,status=? "
                    + "WHERE Id_person=?";
        
        PreparedStatement prest = miconeccion.prepareStatement(Ssql);
        
        prest.setInt(1, a);
        prest.setString(2, b);
        prest.setString(3, c);
        prest.setInt(4, d);
        prest.setString(5, e);
        prest.setString(6, f);
        prest.setString(7, g);
        prest.setString(8, h);
        prest.setString(9, i);
        prest.setString(10, st);
        prest.setInt(11, idd);

     
         
        if(prest.executeUpdate() > 0){
         realizo=1;
      /*      JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", 
                                          JOptionPane.INFORMATION_MESSAGE);*/
           
        }else{
        
          /*  JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos en la tabla:  persona\n"
                                          + "Inténtelo nuevamente.", "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);*/
            
        }
           
    } catch (SQLException t) {
    
       /* JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.\n"
                                          + "Error: "+t, "Error en la operación", 
                                        JOptionPane.ERROR_MESSAGE);*/
     
    }
    
    
    
    
    
    //22222 modificar tabla docente o estudiante
    if(realizo ==1){
    try {
    
         miconeccion=(Connection) this.bd.Conectar();
        
        String Ssql2 = "UPDATE "+tabla+" SET id_curse=?,num_carnet=? "
                    + "WHERE id_person=?";
        
        PreparedStatement prest = miconeccion.prepareStatement(Ssql2);
        
        prest.setInt(1, curso);
        prest.setInt(2, carnet);
        prest.setInt(3, idd);
      
        if(prest.executeUpdate() > 0){
         
        /*    JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito en la tabla "+tabla+"", "Operación Exitosa", 
                                          JOptionPane.INFORMATION_MESSAGE);*/
              JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa :)", 
                                          JOptionPane.INFORMATION_MESSAGE); 
            bitacora(idd,"MODIFICADO");
        }else{
        
           /* JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos en la tabla:  "+tabla+"\n"
                                          + "Inténtelo nuevamente.", "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);*/
            
        }
           
    } catch (SQLException t) {
      
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos de la tabla: "+tabla+"\n"
                                          + "Inténtelo nuevamente.\n"
                                          + "Error: "+t, "Error en la operación", 
                                        JOptionPane.ERROR_MESSAGE);
     
    }finally{
     
         this.bd.Desconectar();
    
    }
    

    
            
    }//fin del if realizo
 
  
  
  
  }//fin del modificar
 
 
 
 
 
  
  
  
  public void bitacora(int a,String b){
  
   
    conex=(Connection) this.bd.Conectar();

   
    try {
        PreparedStatement pst = conex.prepareStatement("INSERT INTO bitacora (id_persona,operacion) VALUES (?,?)");
     
        pst.setInt(1,a);
        pst.setString(2,b);
     
      
        pst.executeUpdate();
     
    
     //  JOptionPane.showMessageDialog(null,"Se hizo el Registro Correctamente la bitacora");
     
    } catch (SQLException | HeadlessException et) {
        
        JOptionPane.showMessageDialog(null,"NO SE PUDO HACER EL REGISTRO en la bitacora por esto: "+et,null,3);
    }
  }
  
  
  
  
 public ResultSet consulta_bita(){
     
      bd.Conectar();
     
       String consulta=  "SELECT * FROM bitacora INNER JOIN persona ON (bitacora.id_persona=persona.Id_person)";   
      //  String consulta="SELECT * FROM bitacora ";
        try {
            bd.result= bd.stm.executeQuery(consulta);
            
        } catch (SQLException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se hizo la consulta de la bitacora");
        }
    
     return bd.result;
   }
     
     
 
 
 public ResultSet consulta_bita2(int cedu){
     bd.result=null;
      bd.Conectar();
     
       String consulta=  "SELECT * FROM bitacora INNER JOIN persona ON (bitacora.id_persona=persona.Id_person) WHERE identification ="+cedu;   
      //  String consulta="SELECT * FROM bitacora ";
        try {
            bd.result= bd.stm.executeQuery(consulta);
         
        } catch (SQLException ex) {
            Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se hizo la consulta de la bitacora");
            JOptionPane.showMessageDialog(null,"La cedula no esta Registrada",null,3);
        }
    
     return bd.result;
   }
     

 
     
}//fin de la clases
