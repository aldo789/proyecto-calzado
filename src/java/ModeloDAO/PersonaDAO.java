package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();

    @Override
    public List listar() {
        ArrayList<Persona> list = new ArrayList<>();
        String sql = "SELECT * FROM USUARIOS";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona per = new Persona();
                per.setId(rs.getInt("ID_USU"));
                per.setUsuario(rs.getString("USER_USU"));
                per.setPass(rs.getString("PASS_USU"));
                per.setNombre(rs.getString("NOMBRE_USU"));
                per.setApellido(rs.getString("APELLIDO_USU"));
                per.setCorreo(rs.getString("CORREO_USU"));
                per.setNumero(rs.getString("CELULAR_USU"));
                per.setTipoU(rs.getString("TIPO_USU"));
                per.setEstadoU(rs.getInt("STD_USU"));
                list.add(per);
            }
        } catch (Exception e) {

        }
        return list;

    }

    @Override
    public Persona list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Persona per) {

        String sql = "SELECT *FROM USUARIOS (USER_USU, PASS_USU, NOMBRE_USU, APELLIDO_USU, CORREO_USU, CELULAR_USU, TIPO_USU, STD_USU)values('" + per.getUsuario() + "','" + per.getPass() + "','" + per.getNombre() + "','" + per.getApellido() + "','" + per.getCorreo() + "','" + per.getNumero() + "','" + per.getTipoU() + "','" + per.getEstadoU() + "')";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
