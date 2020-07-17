@Entity
public class User {

    //Identificador de la ciudad del usuario
	private int ciudadId;
	
	//El nombre del usuario
	private String nombre;
	
	//La edad del usuario
	private int edad;

	
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
}