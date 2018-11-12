package interfaces;

import bean.Pais;
import bean.RarezaItem;
import bean.TipoItem;
import bean.TipoUsuario;
import bean.Usuario;

public interface ObtenerInterface {

	public Pais obtenerPais(int id);
	public Usuario obtenerUsuario(int idUser);
	public TipoUsuario obtenerTipoUsuario(int id);
}
