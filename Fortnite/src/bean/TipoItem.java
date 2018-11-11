package bean;

public class TipoItem {
		
	private int idItem;
	private String descripcion;
	
	
	public TipoItem() {
		super();
	}

	public TipoItem(int idItem, String descripcion) {
		super();
		this.idItem = idItem;
		this.descripcion = descripcion;
	}
	
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
