package modelo.conexion;

import java.sql.*;


/**
 * Clase que permite conectar con la base de datos
 *
 */
public class Conexion {
   private static String bd = "pruebaMVC";
   private static String login = "postgres";
   private static String password = "ova99472K02.";
   private static String url = "jdbc:postgresql://localhost/"+bd;

   private Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("org.postgresql.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            System.out.println("Conexión a base de datos "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}