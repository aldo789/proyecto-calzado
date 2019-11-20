
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    
     public static String cadena = "jdbc:mysql://localhost/BDinvetario";
    public static String usuario = "root";
    public static String clave = "12345678";
    public static Connection con;

    public Conexion() {
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            System.out.println("Se Cargó el Driver Correctamente");
            con = DriverManager.getConnection(cadena, usuario, clave);
            System.out.println("Se Conectó a la Base de Datos");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.toString());

           }
    }
    public Connection getConnection(){
        return con;
    }
}
    

