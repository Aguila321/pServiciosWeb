package services;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import bean.Usuario;
import negocio.UsuarioNegocio;

@Path("/proyecto")
public class UsuarioServicio {
	UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
	private static List<Usuario> listaUsuario = null;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("usuario")
	public List<Usuario> listaJSON(){
		listaUsuario = usuarioNegocio.usuarioLista();
		return listaUsuario;
	}
}

