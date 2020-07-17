package mx.sisu.challengeajax.dto;

/**
 * 
 * DTO con la definición de un país
 * 
 * @author Luis Armando
 *
 */
public class Pais {

	//Identificador del país
	private int id;

	//Nombre del país
	private String nombre;

	/**
	 * Constructor con parámetros
	 * @param id identificador del país
	 * @param nombre nombre del país
	 */
	public Pais(int id, String nombre) {
		this.id = id;
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
