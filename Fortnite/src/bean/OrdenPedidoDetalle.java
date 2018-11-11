package bean;

public class OrdenPedidoDetalle {
public int idPedido;
public int idPavo;
public int cantidad;
public double precio;

public int getIdPedido() {
	return idPedido;
}
public void setIdPedido(int idPedido) {
	this.idPedido = idPedido;
}
public int getIdPavo() {
	return idPavo;
}
public void setIdPavo(int idPavo) {
	this.idPavo = idPavo;
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

}
