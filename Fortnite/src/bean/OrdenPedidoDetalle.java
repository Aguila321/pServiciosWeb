package bean;

/**
 * Clase que Contiene los atributos de la tabla Orden Pedido Detalle
 * @author alex_
 *
 */
public class OrdenPedidoDetalle {
	
	// ATRIBUTOS
	
	/** Identificador del Pedido*/
	private OrdenPedido pedido;
	/** Pavos */
	private Pavos pavos;
	/** Cantidad de Pavos */ 
	private int cantidad;
	/** Precio de los Pavos */
	private double precio;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public OrdenPedidoDetalle() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idPedido
	 * @param pavos
	 * @param cantidad
	 * @param precio
	 */
	public OrdenPedidoDetalle(OrdenPedido idPedido, Pavos pavos, int cantidad, double precio) {
		super();
		this.pedido = idPedido;
		this.pavos = pavos;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
	/**
	 * Metodo que obtiene el Identificador del Pedido
	 * @return idPedido identificador del pedido, tipo {@link Integer}
	 */
	
	public OrdenPedido getPedido() {
		return pedido;
	}
	public void setPedido(OrdenPedido pedido) {
		this.pedido = pedido;
	}
	public Pavos getPavos() {
		return pavos;
	}
	public void setPavos(Pavos pavos) {
		this.pavos = pavos;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// GET - SET

	
	
	
	



}
