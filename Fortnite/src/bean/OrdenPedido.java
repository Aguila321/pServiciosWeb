package bean;

public class OrdenPedido {
private int idpedido;
private String fechaPedido;
Usuario usuario ;
public int getIdpedido() {
	return idpedido;
}
public void setIdpedido(int idpedido) {
	this.idpedido = idpedido;
}
public String getFechaPedido() {
	return fechaPedido;
}
public void setFechaPedido(String fechaPedido) {
	this.fechaPedido = fechaPedido;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

}
