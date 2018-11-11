package bean;

public class Usuario {

	public int iduser  ;
	public String nombre  ;
	public String apellido;
	public String username;
	public String clave  ; 
	public String fecnac  ;
	public String email;  
	public int pavos   ;
	public int idpais  ;
	public int idtipo  ;
	
	public Usuario () {
		
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFecnac() {
		return fecnac;
	}
	public void setFecnac(String fecnac) {
		this.fecnac = fecnac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPavos() {
		return pavos;
	}
	public void setPavos(int pavos) {
		this.pavos = pavos;
	}
	public int getIdpais() {
		return idpais;
	}
	public void setIdpais(int idpais) {
		this.idpais = idpais;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	
	public Usuario(int iduser, String nombre, String apellido, String username, String clave, String fecnac,
			String email, int pavos, int idpais, int idtipo) {
		super();
		this.iduser = iduser;
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.clave = clave;
		this.fecnac = fecnac;
		this.email = email;
		this.pavos = pavos;
		this.idpais = idpais;
		this.idtipo = idtipo;
	}


}
