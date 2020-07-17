package mx.sisu.challengeajax.dto;


/**
 * 
 * DTO con la definición de los datos de usuario
 * 
 * @author Luis Armando
 *
 */

 public class DatosUsuario {

	
	//Identificador de la ciudad del usuario
	private int ciudadId;
	
	//El nombre del usuario
	private String nombre;
	
	//La edad del usuario
	private int edad;

	/**
	 * Constructor por defecto
	 */
	public DatosUsuario(){
		
	}
	
	/**
	 * Constructor con parámetros
	 * @param ciudadId identificador de la ciudad del usuario
	 * @param nombre nombre del usuario
	 * @param edad la edad del usuario
	 */
	public DatosUsuario(int ciudadId, String nombre, int edad) {
		this.ciudadId = ciudadId;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * @return the ciudadId
	 */
	public int getCiudadId() {
		return ciudadId;
	}

	/**
	 * @param ciudadId the ciudadId to set
	 */
	public void setCiudadId(int ciudadId) {
		this.ciudadId = ciudadId;
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

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DatosUsuario [ciudadId=" + ciudadId + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
