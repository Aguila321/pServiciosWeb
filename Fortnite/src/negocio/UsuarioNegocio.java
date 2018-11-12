package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Util.MySQLConexion;
import bean.Usuario;
import interfaces.UsuarioInterface;

public class UsuarioNegocio implements UsuarioInterface{

	ObtenerNegocio obtener = new ObtenerNegocio();
	@Override
	public List<Usuario> usuarioLista() {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;		
		try {
			con = MySQLConexion.getConexion();
			String sql = "select * from usuario";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
												rs.getString(7), rs.getInt(8), obtener.obtenerPais(rs.getInt(9)),obtener.obtenerTipoUsuario(rs.getInt(10)));
				listaUsuario.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MySQLConexion.closeStatement(pst);
			MySQLConexion.closeConexion(con);
		}
		return listaUsuario;
	}
}