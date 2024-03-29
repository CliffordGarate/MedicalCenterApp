package clinica.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import clinica.bean.Usuario;
import clinica.conexion.Conexion;


public class UsuarioDAO extends Conexion {

    public Usuario validarUsuario(String us, String pas) {
        //variables
        Usuario usuario = null;

        //instrucion sql para verificar si usuario esta registrado en la base de datos
        String sql = "SELECT * FROM usuarios WHERE usuario=? AND password=?";
        //abrir conexion a la base de datos tienda.
        //abrir al conexion a  la base de datos tienda
        cn = abrirConexion();
        try {
            //asociar instruccion sql al objeto PreparedStatement a traves de la aconexion
            stm = cn.prepareStatement(sql);
            //asignar valores a los parametros ? ?
            stm.setString(1, us);
            stm.setString(2, pas);
            rs = stm.executeQuery();
            //if porque dentro del rs solo tengo un registro
            if (rs.next()) {
                //crear objeto usuario
                
                usuario = new Usuario();
                //encapsular datos en el objeto usuario
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setUsuario(rs.getString(2));
                usuario.setPassword(rs.getString(3));
                
                
            }

        } catch (SQLException ex) {
            usuario = null;
        } finally {
            cerrar(cn);
            cerrar(stm);
            cerrar(rs);
        }
        //rerornar objeto usaurio con sus respectivos datos 
        return usuario;
    }
}
