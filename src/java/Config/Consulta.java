
package Config;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consulta extends Conexion{
    
   public boolean validar(String user, String pass) throws SQLException{
        Statement st;
        st = con.createStatement();
     
        ResultSet rs=null;
        String sql="select * from USUARIOS";
        rs=st.executeQuery(sql);
        while(rs.next()){
            if (user.equals(rs.getString("USER_USU"))&&pass.equals(rs.getString("PASS_USU"))){
               return true;
            }else{
               return false;
            }
         }
        return false;
   }
    
}

