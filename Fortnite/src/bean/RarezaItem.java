package bean;

public class RarezaItem {
	private int idrareaza;
	private String descripcion;
	
	

	public RarezaItem() {
		super();
	}

	public RarezaItem(int idrareaza, String descripcion) {
		super();
		this.idrareaza = idrareaza;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdrareaza() {
		return idrareaza;
	}

	public void setIdrareaza(int idrareaza) {
		this.idrareaza = idrareaza;
	}
	

}
