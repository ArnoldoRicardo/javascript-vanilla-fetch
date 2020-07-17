package mx.sisu.challengeajax.dto;

/**
 * 
 * DTO con la definición de una ciudad
 * 
 * @author Luis Armando
 *
 */
public class Ciudad {

	//El identificador de la ciudad
	private int id;
	
	//El identificador del estado relacionado con esta ciudad
	private int estadoId;
	
	//El nombre de la ciudad
	private String nombre;

	
	/**
	 * Constructor con parámetros
	 * @param id identificador de la ciudad
	 * @param estadoId identificador del estado asociado
	 * @param nombre nombre de la ciudad
	 */
	public Ciudad(int id, int estadoId, String nombre) {
		this.id = id;
		this.estadoId = estadoId;
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
	 * @return the estadoId
	 */
	public int getEstadoId() {
		return estadoId;
	}

	/**
	 * @param estadoId the estadoId to set
	 */
	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
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
