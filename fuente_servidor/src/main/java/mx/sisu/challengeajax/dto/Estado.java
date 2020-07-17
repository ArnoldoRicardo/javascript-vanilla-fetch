package mx.sisu.challengeajax.dto;

/**
 * 
 * DTO con la definición de un estado
 * 
 * @author Luis Armando
 *
 */
public class Estado {

	//Identificador del estado
	private int id;
	
	//Identificador del pais del estado
	private int paisId;
	
	//Nombre del estado
	private String nombre;

	/**
	 * Constructor con parámetros
	 * @param id identificador del estado
	 * @param paisId identificador del país del estado
	 * @param nombre nombre del estado
	 */
	public Estado(int id, int paisId, String nombre) {
		this.id = id;
		this.paisId = paisId;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the paisId
	 */
	public int getPaisId() {
		return paisId;
	}

	/**
	 * @param paisId the paisId to set
	 */
	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
