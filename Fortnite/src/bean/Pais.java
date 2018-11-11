package bean;

public class Pais {
	/* Identificador del Pais */
	public int idpais;
	/* Nombre del Pais */
	public String nombrePais;
	
	// GET / SET
	
	/**
	 * Metodo que obtiene el Identificador del Pais
	 * @return idpais identificador del pais, tipo int
	 */
	public int getIdpais() {
		return idpais;
	}
	/**
	 * Metodo que envia el Identificador del Pais
	 * @param idpais identificador del pais, tipo int
	 */
	public void setIdpais(int idpais) {
		this.idpais = idpais;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
}
