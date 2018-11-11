package bean;

/**
 * Clase que Contiene los atributos de la tabla Orden Pedido Detalle
 * @author alex_
 *
 */
public class OrdenPedidoDetalle {
	
	// ATRIBUTOS
	
	/** Identificador del Pedido*/
	private int idPedido;
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
	public OrdenPedidoDetalle(int idPedido, Pavos pavos, int cantidad, double precio) {
		super();
		this.idPedido = idPedido;
		this.pavos = pavos;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Pedido
	 * @return idPedido identificador del pedido, tipo {@link Integer}
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * Metodo que envia el Identificador del Pedido
	 * @param idPedido identificador del pedido, tipo {@link Integer}
	 */
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * Metodo que obtiene el bean Pavos
	 * @return pavos datos de los pavos comprados, tipo {@link Pavos}
	 */
	public Pavos getPavos() {
		return pavos;
	}
	/**
	 * Metodo que envia el bean Pavos
	 * @param pavos datos de los pavos comprados, tipo {@link Pavos}
	 */
	public void setPavos(Pavos pavos) {
		this.pavos = pavos;
	}
	/**
	 * Metodo que obtiene la cantidad de pavos Comprados
	 * @return cantidad cantidad de pavos comprados, tipo {@link Integer}
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * Metodo que envia la cantidad de pavos Comprados
	 * @param cantidad cantidad de pavos comprados, tipo {@link Integer}
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * Metodo que obtiene el Precio de los pavos Comprados
	 * @return precio precio de los pavos comprados, tipo {@link Double}
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Metodo que envia el Precio de los pavos Comprados
	 * @param precio precio de los pavos comprados, tipo {@link Double}
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	



}
