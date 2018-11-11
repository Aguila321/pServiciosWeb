package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.Item;
import negocio.ItemNegocio;

@Path("/item")
public class ItemServicio {
	//
	ItemNegocio negocioItem = new ItemNegocio();
	private static List<Item> listaItem=null;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("json")
	public List<Item> listaJSON(){
		
		listaItem =  negocioItem.listaItem();
		System.out.println(listaItem);
		return listaItem;
	}
}
