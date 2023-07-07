/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Conexion {
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/mybiblioteca";

    private final String USER = "root";
    private final String PASS = "";
    
    public void Conectar() throws ClassNotFoundException{
        try{
            System.out.println("Conexion ok");
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Cerrar() throws SQLException {
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    
//    static String db="db_agenda";
//    static String usu="root";
//    static String cla = "";
//    static String url="jdbc:mysql://localhost/"+db;
//    Connection conexion = null;
//    
//    public Conexion(){
//            try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             conexion = DriverManager.getConnection(url, usu, cla);
//             if(conexion != null){
//                 System.out.println("conexion con la base de datos, ok");
//                }
//             else{
//                 System.out.println("Error con la conexion con la base de datos");
//                }
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//    }
//    public Connection conectar(){
//        return conexion;
//    }
}
