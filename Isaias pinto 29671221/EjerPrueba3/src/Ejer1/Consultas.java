package Ejer1;
/*
 * Isaias Manuel Pinto Martinez
 *          29671221
 * algerninjaxdd@gmail.com
 */

//Modelo encargado de las consultas del CRUD
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;

public class Consultas extends Conexion {

    public boolean Registrar(Modelo00 Mod) {
        PreparedStatement ps = null;
        Connection cn = getConexion();

        String sql = "INSERT INTO contactos (nombre, apellido, cedula, empresa, Ptrabajo, telefono, correo) values (?,?,?,?,?,?,?)";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, Mod.getNombre());
            ps.setString(2, Mod.getApellido());
            ps.setInt(3, Mod.getCedula());
            ps.setString(4, Mod.getEmpresa());
            ps.setString(5, Mod.getPTrabajo());
            ps.setString(6, Mod.getTelefono());
            ps.setString(7, Mod.getCorreo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean Modificar(Modelo00 Mod) {

        PreparedStatement ps = null;
        Connection cn = getConexion();

        String sql = "UPDATE contactos SET nombre=?, apellido=?, cedula=?,empresa=?, Ptrabajo=?, telefono=?, correo=? WHERE ID=?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, Mod.getNombre());
            ps.setString(2, Mod.getApellido());
            ps.setInt(3, Mod.getCedula());
            ps.setString(4, Mod.getEmpresa());
            ps.setString(5, Mod.getPTrabajo());
            ps.setString(6, Mod.getTelefono());
            ps.setString(7, Mod.getCorreo());
            ps.setInt(8, Mod.getID());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean Eliminar(Modelo00 Mod) {

        PreparedStatement ps = null;
        Connection cn = getConexion();

        String sql = "DELETE FROM contactos WHERE ID = ?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, Mod.getID());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;

        } finally {
            try {
                cn.close();

            } catch (SQLException e) {
                System.err.println(e);

            }
        }
    }

    public boolean Buscar(Modelo00 Mod) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cn = getConexion();

        String sql = "SELECT * FROM contactos WHERE cedula=?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, Mod.getCedula());
            rs = ps.executeQuery();

            if (rs.next()) {
                Mod.setID(Integer.parseInt(rs.getString("ID")));
                Mod.setNombre(rs.getString("nombre"));
                Mod.setApellido(rs.getString("apellido"));
                Mod.setCedula(Integer.parseInt(rs.getString("cedula")));
                Mod.setEmpresa(rs.getString("empresa"));
                Mod.setPTrabajo(rs.getString("Ptrabajo"));
                Mod.setTelefono(rs.getString("telefono"));
                Mod.setCorreo(rs.getString("correo"));
                return true;
            }
            return false;

        } catch (SQLException e) {
            System.err.println(e);
            return false;

        } finally {
            try {
                cn.close();

            } catch (SQLException e) {
                System.err.println(e);

            }
        }
    }
}
